import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class customer_details extends JFrame implements ActionListener
{
    int i=0,j=0;
    JTable t1;
    JButton b1;
    String x[]={"name","meter number","address","state","city","email","phone"};
    String y[][]=new String[20][8];
    customer_details()
    {
        super("Customer Details");
        setSize(1200,650);
        setLocation(100,100);
        setResizable(false);
        try
        {
			String url="jdbc:mysql://localhost:3306/billing";
			String uname="root";
			String pass="devang";
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
            String q="select * from billing";
            ResultSet res=st.executeQuery(q);
            while(res.next())
            {
                y[i][j++]=res.getString("name");
                y[i][j++]=res.getString("meterno");
                y[i][j++]=res.getString("address");
                y[i][j++]=res.getString("state");
                y[i][j++]=res.getString("city");
                y[i][j++]=res.getString("email");
                y[i][j++]=res.getString("phono");
                i++;
                j=0;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        t1=new JTable(y,x);
        b1=new JButton("print");
        add(b1,"South");
        JScrollPane sp=new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource()==b1)
        {
            try
            {
                t1.print();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new customer_details().setVisible(true);
    }
}