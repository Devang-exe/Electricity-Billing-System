import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class bills extends JFrame implements ActionListener
{
    int i=0,j=0;
    JTable t1;
    JButton b1,b2,b3;
	JComboBox jcb_meter;
	JScrollPane sp;
    String x[]={"meter number","Duration","amount","status"};
    String y[][]=new String[20][5];
    bills()
    {
        super("Bills");
		
        setSize(700,600);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setLocation(500,200);
		
		
		jcb_meter = new JComboBox();
		jcb_meter.setBounds(200,20,200,30);
		//jcb_meter.addItem("Meter No.");
		add(jcb_meter);
		jcb_meter.addActionListener(this);
		
		
		
		try
		{
				
			String[] words=null;  //Intialize the word Array
			
			FileReader fr = new FileReader("meter.txt");  //Creation of File Reader object
			
			BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
			
			String s;
				
			while((s=br.readLine())!=null)   //Reading Content from the file
			{
				words=s.split(" ");  //Split the word using space
				for (String word : words) 
				{
					jcb_meter.addItem(word);
				}
			}
				
		}catch(Exception e){
				
		}
	
		
        t1=new JTable(y,x);
        b1=new JButton("Print");
		b1.setBounds(50,500,100,40);
        add(b1);

        b2=new JButton("Show");
		b2.setBounds(250,500,100,40);
        add(b2);
		
		b3=new JButton("Refresh");
		b3.setBounds(450,500,100,40);
        add(b3);
		
        sp=new JScrollPane(t1);
		sp.setBounds(10,100,670,300);
        add(sp);
		sp.setVisible(false);
		
        b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
    }
	
    public void actionPerformed(ActionEvent ev)
    {
		String msg = ev.getActionCommand();
		//System.out.println(msg);
		
		if(msg.equals("Show")){
			
			sp.setVisible(true);
			
		try
        {
			
			String url="jdbc:mysql://localhost:3306/billing";
			String uname="root";
			String pass="devang";
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
            String q="select * from bills where meterno = '"+jcb_meter.getSelectedItem().toString()+"'";
            ResultSet res=st.executeQuery(q);
            while(res.next())
            {
                y[i][j++]=res.getString("meterno");
                y[i][j++]=res.getString("Duration");
                y[i][j++]=res.getString("Amount");
                y[i][j++]=res.getString("Status");
                i++;
                j=0;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		
		}
		
        else if(ev.getSource()==b1)
        {
            try
            {
                t1.print();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }else if(msg.equals("Refresh")){
			this.setVisible(false);
			new bills().setVisible(true);
		}
    }
    public static void main(String args[])
    {
        new bills().setVisible(true);
    }
}