import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.io.*;
import java.sql.*;

/**
 *
 * @author GUPTA
 */
 
public class pay extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	JLabel jl1,jl2;
	JTextArea t1;
	JComboBox jc1,jc2;
	JRadioButton jr1,jr2,jr3,jr4,jr5;
	JButton jb1,jb2;
	
	Font f1=new Font("Senserif",Font.BOLD,14);
	
	pay()
	{
		super("Payment Section");
		
		
		
		JLabel jl1 = new JLabel("Chose Payment Option");
		jl1.setBounds(80,10,200,30);
		jl1.setFont(f1);
		add(jl1);
		
		ButtonGroup bg_payment = new ButtonGroup();
		
		
		jr1 = new JRadioButton("VISA / Master Card");
		jr1.setBounds(70,70,200,30);
		jr1.setFont(f1);
		add(jr1);
		bg_payment.add(jr1);
		jr1.addActionListener(this);
		
		jr2 = new JRadioButton("Net Banking");
		jr2.setBounds(70,130,150,30);
		jr2.setFont(f1);
		add(jr2);
		bg_payment.add(jr2);
		jr2.addActionListener(this);
		
		jr3 = new JRadioButton("NEFT");
		jr3.setBounds(70,190,150,30);
		jr3.setFont(f1);
		add(jr3);
		bg_payment.add(jr3);
		jr3.addActionListener(this);
		
		jr4 = new JRadioButton("Paytm");
		jr4.setBounds(70,250,150,30);
		jr4.setFont(f1);
		add(jr4);
		bg_payment.add(jr4);
		jr4.addActionListener(this);
		
		jr5 = new JRadioButton("BHIM UPI");
		jr5.setBounds(70,310,150,30);
		jr5.setFont(f1);
		add(jr5);
		bg_payment.add(jr5);
		jr5.addActionListener(this);
		
		jb1 = new JButton("Check Bill");
		jb1.setBounds(190,400,100,40);
		add(jb1);
		jb1.addActionListener(this);
		jb1.setVisible(false);
		
		jb2 = new JButton("Cancel");
		jb2.setBounds(70,400,100,40);
		add(jb2);
		jb2.addActionListener(this);
		
		

        setSize(400,500);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setLocation(500,200);
	

	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("VISA / Master Card")){
			

			JOptionPane.showInputDialog(jf,"Card No.");
			JOptionPane.showInputDialog(jf,"Expire Month");
			JOptionPane.showInputDialog(jf,"Expire Year");
			JOptionPane.showInputDialog(jf,"Security Code");
			JOptionPane.showInputDialog(jf,"Enter Amount");
			//int i = JOptionPane.showMessageDialog(jf,"Payment Successful!!");
			
			jb1.setVisible(true);
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing","root","devang");
				Statement st = con.createStatement();
				String q=" Update bills set status = 'PAID' where duration = '02-09-20 - 01-10-20' and meterno = '1002'";
				st.executeUpdate(q);
				System.out.println("Update Successful");
			}catch(Exception e){
				
			}
			
		}else if(msg.equals("Net Banking")){
			
			JOptionPane.showInputDialog(jf,"Bank Name");
			JOptionPane.showInputDialog(jf,"Account No.");
			JOptionPane.showInputDialog(jf,"Password");
			JOptionPane.showInputDialog(jf,"Enter Amount");
			JOptionPane.showMessageDialog(jf,"Payment Successful!!");
			jb1.setVisible(true);
			
		}else if(msg.equals("Paytm")){
			JOptionPane.showInputDialog(jf,"Mobile No.");
			JOptionPane.showInputDialog(jf,"Password");
			JOptionPane.showInputDialog(jf,"Enter Amount");
			JOptionPane.showMessageDialog(jf,"Payment Successful!!");
			jb1.setVisible(true);
						
			
		}else if(msg.equals("BHIM UPI")){
			
			JOptionPane.showInputDialog(jf,"Bank Name");
			JOptionPane.showInputDialog(jf,"Account No.");
			JOptionPane.showInputDialog(jf,"Password");
			JOptionPane.showInputDialog(jf,"Enter Amount");
			JOptionPane.showMessageDialog(jf,"Payment Successful!!");
			jb1.setVisible(true);
			
			
			
		}else if(msg.equals("Cancel")){
			JOptionPane.showMessageDialog(jf,"Payment Cancel");
			this.setVisible(false);
				
		
		}else if(msg.equals("Check Bill")){
			this.setVisible(false);
			new generatebill1002new().setVisible(true);
		}
		
		
	}
	
	public static void main(String s[])
	{
		new pay().setVisible(true);
	}
    
}