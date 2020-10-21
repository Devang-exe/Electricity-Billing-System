import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author GUPTA
 */
public class loginpageuser2 extends JFrame implements ActionListener{
    JFrame jf ;
    JLabel l1,l2,l3;
	JTextField t1;
	JCheckBox jcb_fpassword;
	JComboBox jcb_meter;
	JButton b1,b2,b3;
	JPanel p1,p2,p3,p4;
	JPasswordField t2;
	loginpageuser2()
	{
		super("Login page");
		
		jf = new JFrame();
		
		l1 = new JLabel("Meter No: ");
		l1.setBounds(100,40,100,30);
		add(l1);
		
		jcb_meter = new JComboBox();
		jcb_meter.setBounds(250,40,100,30);
		add(jcb_meter);
		
		try{
				
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
		
		l2 = new JLabel("Password: ");
		l2.setBounds(100,90,100,30);
		add(l2);
		
		t2 = new JPasswordField();
		t2.setBounds(250,90,100,30);
		add(t2);
		
		jcb_fpassword = new JCheckBox("Forget Password");
		jcb_fpassword.setBounds(200,120,150,30);
		add(jcb_fpassword);
		jcb_fpassword.addActionListener(this);
		
		b1 = new JButton("Submit");
		b1.setBounds(120,200,100,30);
		add(b1);
		b1.addActionListener(this);
		
		//b2 = new JButton("Cancel");
		//b2.setBounds(250,150,100,30);
		//add(b2);
		
		b3 = new JButton("Back");
		b3.setBounds(250,200,100,30);
		add(b3);
		b3.addActionListener(this);
		
        setSize(500,300);
		setLayout(null);
        setBackground(Color.BLUE);
		setLocation(500,250);
		addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		
		String text = ev.getActionCommand();
		
		if(text.equals(b3.getText())){
			this.setVisible(false);
			new loginpageuser().setVisible(true);
		}else if(text.equals(b1.getText())){
			
			if(jcb_fpassword.isSelected()){
				String ph = JOptionPane.showInputDialog(jf,"Enter Mobile Number");
				
				try{
					String meterno = jcb_meter.getSelectedItem().toString();
									
					boolean flag = false;
					String tempmeterno="";
					String temph="";
					
					Scanner sc = new Scanner(new File("phone.txt"));
					sc.useDelimiter("[,\n]");
					
					while(sc.hasNext() && !flag){
						tempmeterno = sc.next();
						temph = sc.next();
						
						if(tempmeterno.trim().equals(meterno.trim()) && temph.trim().equals(ph.trim())){
							flag = true;
						}
					
					}
					
					if(!flag){
						JOptionPane.showMessageDialog(jf,"Invalid phone number");
					}
						
					sc.close();
					
					if(flag){
						try{
							meterno = jcb_meter.getSelectedItem().toString();
									
							boolean found = false;
							tempmeterno="";
							String tempassword="";
					
							sc = new Scanner(new File("passwords.txt"));
							sc.useDelimiter("[,\n]");
					
							while(sc.hasNext() && !found){
								tempmeterno = sc.next();
								tempassword = sc.next();
						
								if(tempmeterno.trim().equals(meterno.trim())){
									found = true;
									tempassword = tempassword.trim();
								}
							}
							sc.close();
					
							if(found){
								JOptionPane.showMessageDialog(jf,"Meter No."+meterno+"\n"+"Password: "+tempassword);
								this.setVisible(false);
								new loginpageuser2().setVisible(true);
							}
				
						}catch(Exception e){
				
						}
						
					}
					
				
				}catch(Exception e){
				
				}
				
				
			
			}else{
				
				String meterno = jcb_meter.getSelectedItem().toString();
				String password = t2.getText();
				try{
					
					boolean found = false;
					String tempmeterno="";
					String tempassword="";
					
					Scanner sc = new Scanner(new File("passwords.txt"));
					sc.useDelimiter("[,\n]");
					
					while(sc.hasNext() && !found){
						tempmeterno = sc.next();
						tempassword = sc.next();
						
						if(tempmeterno.trim().equals(meterno.trim()) && tempassword.trim().equals(password.trim())){
							found = true;
						}
					}
					sc.close();
					if(found){
						
						JOptionPane.showMessageDialog(jf,"Login Successful");
					
						if(jcb_meter.getSelectedItem().toString().equals("1001")){
							this.setVisible(false);
							new userlogin1001().setVisible(true);
						}else if(jcb_meter.getSelectedItem().toString().equals("1002")){
							this.setVisible(false);
							new userlogin1002().setVisible(true);
						}else{
							this.setVisible(false);
							new newuserlogin().setVisible(true);
						}
						
						
						
						
					}else{
						JOptionPane.showMessageDialog(jf,"Invalid Username or Password");
						this.setVisible(false);
						new loginpageuser2().setVisible(true);
					}
					
				
				}catch(Exception e){
				
				}
			}				
			
		}
		
	}
	public static void main(String s[])
	{
		new loginpageuser2().setVisible(true);
	}
    
}