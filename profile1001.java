import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author GUPTA
 */
 
public class profile1001 extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	JMenuBar mb;
	JMenu bills,profile,exit;  
    JMenuItem generate,pay_bill,view_bill,my_account,i_exit;
	JTextField jl7,jl8;
	String emailid = "";
	String phoneNo = "";
	JButton jb2,jb3;
	
	profile1001()
	{
		super("My Profile");
		
        JLabel l1=new JLabel("DEVANG");
		l1.setBounds(110,150,300,40);
		Font f = new Font("monospaced",Font.PLAIN,20);
		l1.setFont(f);
		l1.setForeground(Color.RED);
        add(l1);
		
		ImageIcon c3 = new ImageIcon(ClassLoader.getSystemResource("icons/user icon.png"));
		Image i2=c3.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon c4=new ImageIcon(i2);
		JLabel jl2 = new JLabel(c4);
		jl2.setBounds(110,30,100,100);
		add(jl2);
		
		JLabel l3=new JLabel("Meter No.: ");
		l3.setBounds(50,200,100,40);
        add(l3);
		
		JTextField jl3= new JTextField("1001"); 
		jl3.setBounds(150,200,200,40);
		add(jl3);
		jl3.setEditable(false);
		
		JLabel l4 = new JLabel("Address: ");
		l4.setBounds(50,250,100,40);
        add(l4);
		
		JTextField jl4= new JTextField("Amrapali"); 
		jl4.setBounds(150,250,200,40);
		add(jl4);
		jl4.setEditable(false);
		
		
		JLabel l5 = new JLabel("State: ");
		l5.setBounds(50,300,100,40);
        add(l5);
		
		JTextField jl5= new JTextField("Uttar Pradesh"); 
		jl5.setBounds(150,300,200,40);
		add(jl5);
		jl5.setEditable(false);
		
		JLabel l6 = new JLabel("City: ");
		l6.setBounds(50,350,100,40);
        add(l6);
		
		JTextField jl6= new JTextField("Noida"); 
		jl6.setBounds(150,350,200,40);
		add(jl6);
		jl6.setEditable(false);
		
		try{
					
			Scanner sc = new Scanner(new File("email1001.txt"));
			sc.useDelimiter("[,\n]");
					
			while(sc.hasNext()){
				emailid = sc.next();
				phoneNo = sc.next();
			}
				
			sc.close();
				
		}catch(Exception e){
				
		}
		
		JLabel l7 = new JLabel("Email Id ");
		l7.setBounds(50,400,100,40);
        add(l7);
		
		jl7= new JTextField(emailid); 
		jl7.setBounds(150,400,200,40);
		add(jl7);
		jl7.setEditable(false);
		
		JLabel l8 = new JLabel("Phone No: ");
		l8.setBounds(50,450,100,40);
        add(l8);
		
		jl8= new JTextField(phoneNo); 
		jl8.setBounds(150,450,200,40);
		add(jl8);
		jl8.setEditable(false);
		
		JButton jb = new JButton("Back");
		jb.setBounds(50,520,100,30);
		add(jb);
		jb.addActionListener(this);
		
		jb2 = new JButton("Edit Details");
		jb2.setBounds(200,520,100,30);
		add(jb2);
		jb2.addActionListener(this);
		
		jb3 = new JButton("Save Details");
		jb3.setBounds(200,520,130,30);
		add(jb3);
		jb3.addActionListener(this);
		jb3.setVisible(false);
		
        setSize(400,600);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setJMenuBar(mb);
		setLocation(500,200);
		

	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("Back")){
			this.setVisible(false);
		}else if(msg.equals("Edit Details")){
			jb3.setVisible(true);
			jb2.setVisible(false);
			jl7.setEditable(true);
			jl8.setEditable(true);
			
		}else if(msg.equals("Save Details")){
			jb3.setVisible(false);
			jb2.setVisible(true);
			emailid = jl7.getText();
			phoneNo = jl8.getText();
			jl7.setEditable(false);
			jl8.setEditable(false);
			
			try{
					
				FileWriter fwe = new FileWriter("email1001.txt");
				jl7.write(fwe);
				fwe.write(",");
				jl8.write(fwe);
				fwe.write("\n");
				fwe.close();
				
			}catch(Exception e){
				
			}
		}
		
	}
	public static void main(String s[])
	{
		new profile1001().setVisible(true);
	}
    
}