import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author GUPTA
 */
 
public class adminlogin extends JFrame implements ActionListener{
	JFrame jf;
	JMenuBar mb;
	JMenu customers,bills,exit;  
    JMenuItem add_customer, view_customers,bills_paid,bills_not_paid,i_exit;  
	
	adminlogin()
	{
		super("Admin Window");
		jf = new JFrame();
		
        JLabel l1=new JLabel("WELCOME");
		l1.setBounds(200,100,300,40);
		Font f = new Font("monospaced",Font.PLAIN,24);
		l1.setFont(f);
		l1.setForeground(Color.RED);
        add(l1);
		
		mb = new JMenuBar();
		
		customers = new JMenu("Customers");
		
		add_customer = new JMenuItem("Add Customer");
		customers.add(add_customer);
		add_customer.addActionListener(this);
		
		view_customers = new JMenuItem("Customer Details");
		customers.add(view_customers);
		view_customers.addActionListener(this);
		
		bills = new JMenu("Bills");
		
		bills_paid = new JMenuItem("Bills paid");
		bills.add(bills_paid);
		bills_paid.addActionListener(this);
		
		bills_not_paid = new JMenuItem("Bills Due");
		bills.add(bills_not_paid);
		bills_not_paid.addActionListener(this);
		
		exit = new JMenu("Exit");
		
		i_exit = new JMenuItem("Exit");
		exit.add(i_exit);
		i_exit.addActionListener(this);
		
		mb.add(customers);
		mb.add(bills);
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
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("Add Customer"))
		{
			JOptionPane.showMessageDialog(jf,"customer added");
			//new regform().setVisible(true);
		}
		else if(msg.equals("Customer Details"))
		{
			JOptionPane.showMessageDialog(jf,"customer Viewed");
			//new customer_details().setVisible(true);
			
		}else if(msg.equals("Bills paid")){
			JOptionPane.showMessageDialog(jf,"Bills Paid");
			
		}else if(msg.equals("Bills Due")){
			JOptionPane.showMessageDialog(jf,"Bills Due");
			
		}else if(msg.equals("Exit")){
			JOptionPane.showMessageDialog(jf,"Logged out Successfully ");
			this.setVisible(false);
			new users().setVisible(true);
		}
		
		
	}
	public static void main(String s[])
	{
		new adminlogin().setVisible(true);
	}
    
}