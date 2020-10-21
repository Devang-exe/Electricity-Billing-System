import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author GUPTA
 */
public class regform extends JFrame implements ActionListener, ItemListener{
	
    JFrame jf;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	JButton b1,b2,b3;
	JComboBox jcb_state, jcb_dist;
	JPasswordField p1;
	
	private String state1[] = {"Tamil Nadu","Bihar", "Maharashtra" , "Karnataka" , "Andhra Pradesh" , "Uttar Pradesh"};
	ArrayList<String> state = new ArrayList<String>();
	private ArrayList<ArrayList<String>> dist;  // 2 dimensional array list
	
	{
		dist = new ArrayList<ArrayList<String>>(); 
		
		dist.add(new ArrayList<String>(Arrays.asList("Kurnool","Krishna","Vizag","Guntur","Chitoor")));
		dist.add(new ArrayList<String>(Arrays.asList("Patna","Begusarai","Muzaffarpur","Darbhanga")));
		dist.add(new ArrayList<String>(Arrays.asList("Banglore","Manglore","Vizag","Mysore","Kolar")));
		dist.add(new ArrayList<String>(Arrays.asList("Mumbai","Pune","Nasik","Nagpur","Kolhapur")));
		dist.add(new ArrayList<String>(Arrays.asList("Coimbatore","Madurai","Kancheepuram","Vellore","Chennai")));
		dist.add(new ArrayList<String>(Arrays.asList("Noida","Ghaziabad","Kanpur","Mirzapur","Meerut","Varanasi")));
		
		//System.out.println(dist);
	}
	
	regform()
	{
		super("Registration page");
		jf = new JFrame();
		
		l1 = new JLabel(" Name ");
		l1.setBounds(100,20,150,30);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(250,20,200,30);
		add(t1);
		
		l2 = new JLabel(" Meter No ");
		l2.setBounds(100,60,150,30);
		add(l2);
		
		t2 = new JTextField();
		t2.setBounds(250,60,200,30);
		add(t2);
		
		l4 = new JLabel("(ex. 1001)");
		l4.setBounds(500,60,100,30);
		add(l4);
		
		l3 = new JLabel(" Address ");
		l3.setBounds(100,100,150,30);
		add(l3);
		
		t3 = new JTextField();
		t3.setBounds(250,100,200,30);
		add(t3);
		
		l2 = new JLabel(" State ");
		l2.setBounds(100,140,150,30);
		add(l2);
		
		l3 = new JLabel(" City ");
		l3.setBounds(100,180,150,30);
		add(l3);
		
		jcb_state = new JComboBox();
		jcb_state.addItem("State");
		jcb_state.setBounds(250,140,200,30);
		add(jcb_state);
		jcb_state.addItemListener(this);
		
		
		jcb_dist = new JComboBox();
		jcb_dist.addItem("City");
		jcb_dist.setBounds(250,180,200,30);
		add(jcb_dist);
		jcb_dist.setEnabled(false);
		
		for(String i:state1){
			state.add(i);
		}
		Collections.sort(state);
		
		for(String i:state){
			jcb_state.addItem(i);
		}
		
		
		l7 = new JLabel(" Email ");
		l7.setBounds(100,220,150,30);
		add(l7);
		
		t7 = new JTextField();
		t7.setBounds(250,220,200,30);
		add(t7);
		
		l8 = new JLabel(" Phone no ");
		l8.setBounds(100,260,150,30);
		add(l8);
		
		t8 = new JTextField();
		t8.setBounds(250,260,200,30);
		add(t8);
		
		l9 = new JLabel("Password: ");
		l9.setBounds(100,300,150,30);
		add(l9);
		
		p1 = new JPasswordField();
		p1.setBounds(250,300,200,30);
		add(p1);
		
		b1 = new JButton("Submit");
		b1.setBounds(120,350,100,30);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Clear");
		b2.setBounds(420,350,100,30);
		add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Cancel");
		b3.setBounds(270,350,100,30);
		add(b3);
		b3.addActionListener(this);
		
        setSize(700,500);
		setLayout(null);
        setBackground(Color.YELLOW);
		setLocation(400,200);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void itemStateChanged(ItemEvent ie){
		
		System.out.println(ie.getItem());
		if(!(ie.getItem().equals("State"))){
			jcb_dist.setEnabled(true);
			jcb_dist.removeAllItems();
			
			for(String i : state){
				if(ie.getItem().equals(i)){
					int index = state.indexOf(i); 
					ArrayList<String> pdist = new ArrayList<String>(dist.get(index));
					Collections.sort(pdist);
					//System.out.println(pdist);
					
					for(String p : pdist){
						jcb_dist.addItem(p);
					}
				}
			}
			
		}else{
			jcb_dist.setEnabled(false);
			jcb_dist.removeAllItems();
			
		}
		
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		
		String text = ev.getActionCommand();
		
		if(text.equals(b3.getText())){
			this.setVisible(false);
			new loginpageuser().setVisible(true);
			
		}else if(text.equals(b2.getText())){
			this.setVisible(false);
			new regform().setVisible(true);
			
		}else if(text.equals(b1.getText())){
			try{
				
				FileWriter filewriter = new FileWriter("text.txt",true);
				filewriter.write("\n");
				
				filewriter.write("New Customer\n");
				filewriter.write("\n");
				filewriter.write("Name: ");
				t1.write(filewriter);
				filewriter.write("\n");
				
				filewriter.write("Meter No: ");
				t2.write(filewriter);
				filewriter.write("\n");
				
				filewriter.write("Address: ");
				t3.write(filewriter);
				filewriter.write("\n");
				
				filewriter.write("State: ");
				filewriter.write(jcb_state.getSelectedItem().toString());
				filewriter.write("\n");
				
				filewriter.write("City: ");
				filewriter.write(jcb_dist.getSelectedItem().toString());
				filewriter.write("\n");
				
				filewriter.write("Email: ");
				t7.write(filewriter);
				filewriter.write("\n");
				
				filewriter.write("Phone No.: ");
				t8.write(filewriter);
				filewriter.write("\n");
				filewriter.close();
				
				FileWriter fwp = new FileWriter("passwords.txt",true);
				t2.write(fwp);
				fwp.write(",");
				p1.write(fwp);
				fwp.write("\n");
				fwp.close();
				
				FileWriter fwph = new FileWriter("phone.txt",true);
				t2.write(fwph);
				fwph.write(",");
				t8.write(fwph);
				fwph.write("\n");
				fwph.close();
				
				FileWriter fwm = new FileWriter("meter.txt",true);
				t2.write(fwm);
				fwm.write(" ");
				fwm.close();
				
				FileWriter fwn = new FileWriter("name.txt",true);
				t1.write(fwn);
				fwn.write(" ");
				fwn.close();
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try{
				String url="jdbc:mysql://localhost:3306/billing";
				String uname="root";
				String pass="devang";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st = con.createStatement();
				
				String cname = t1.getText();
				String cmeterno = t2.getText();
				String caddress = t3.getText();
				String cstate = jcb_state.getSelectedItem().toString();
				String ccity = jcb_dist.getSelectedItem().toString();
				String cemail = t7.getText();
				String cphone = t8.getText();
				
				String q ="insert into billing values('"+cname+"','"+cmeterno+"','"+caddress+"','"+cstate+"','"+ccity+"','"+cemail+"','"+cphone+"') ";
				st.executeUpdate(q);
				System.out.println("Registered successfully");
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(jf,"Registered Successfully");
			this.setVisible(false);
			new users().setVisible(true);
		}
		
	}
	
	public static void main(String s[])
	{
		new regform().setVisible(true);
	}
    
}