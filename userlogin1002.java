import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author GUPTA
 */
 
public class userlogin1002 extends JFrame implements ActionListener{
    
	JFrame jf;
	JMenuBar mb;
	JMenu bills,profile,exit;  
    JMenuItem generate,pay_bill,view_bill,my_account,i_exit;
	
	userlogin1002()
	{
		super("User Window");
		
		jf = new JFrame();
		
        JLabel l1=new JLabel("WELCOME! TEJAS");
		l1.setBounds(150,40,350,40);
		Font f = new Font("monospaced",Font.PLAIN,20);
		l1.setFont(f);
		l1.setForeground(Color.RED);
        add(l1);
		
		mb = new JMenuBar();
		
		bills = new JMenu("Bills");
		
		generate = new JMenuItem("Generate Bill");
		bills.add(generate);
		generate.addActionListener(this);
		
		view_bill = new JMenuItem("View Your Bills");
		bills.add(view_bill);
		view_bill.addActionListener(this);
		
		//pay_bill = new JMenuItem("Pay Your Bills");
		//bills.add(pay_bill);
		//pay_bill.addActionListener(this);
		
		profile = new JMenu("Profile");
		
		my_account = new JMenuItem("My Account");
		profile.add(my_account);
		my_account.addActionListener(this);
		
		exit = new JMenu("Log Out");
		
		i_exit = new JMenuItem("Log Out");
		exit.add(i_exit);
		i_exit.addActionListener(this);
		
		mb.add(bills);
		mb.add(profile);
		mb.add(exit);
		jf.add(mb);
		
        setSize(500,300);
		setLayout(null);
        jf.setBackground(Color.BLUE);
		setJMenuBar(mb);
		setLocation(500,250);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
		
		
        setSize(700,500);
		setLayout(null);
        setBackground(Color.BLUE);
		setLocation(500,250);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });	
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("Generate Bill"))
		{
			JOptionPane.showMessageDialog(jf,"Generate Bill");
			new generatebill1002().setVisible(true);
		}
		//else if(msg.equals("Pay Your Bills"))
		//{
			//JOptionPane.showMessageDialog(jf,"Pay Your Bills");
			//new paybill1002().setVisible(true);
			
		//}
		else if(msg.equals("View Your Bills")){
			//JOptionPane.showMessageDialog(jf,"View Your Bills");
			new viewbill1002().setVisible(true);
			
		}else if(msg.equals("My Account")){
			//JOptionPane.showMessageDialog(jf,"Add Account");
			new profile1002().setVisible(true);
			
		}else if(msg.equals("Log Out")){
			JOptionPane.showMessageDialog(jf,"Logged out Successfully ");
			this.setVisible(false);
			new users().setVisible(true);
		}
		
		
	}
	public static void main(String s[])
	{
		new userlogin1002().setVisible(true);
	}
    
}