import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GUPTA
 */
public class loginpage extends JFrame implements ActionListener{
    JFrame jf;
    JLabel l1,l2,l3;
	JTextField t1;
	JButton b1,b2,b3;
	JPanel p1,p2,p3,p4;
	JPasswordField t2;
	loginpage()
	{
		super("Login page");
		
		jf = new JFrame();
		
		l1 = new JLabel("Username: ");
		l1.setBounds(100,40,100,30);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(250,40,100,30);
		add(t1);
		
		l2 = new JLabel("Password: ");
		l2.setBounds(100,90,100,30);
		add(l2);
		
		t2 = new JPasswordField();
		t2.setBounds(250,90,100,30);
		add(t2);
		
		b1 = new JButton("Submit");
		b1.setBounds(120,150,100,30);
		add(b1);
		b1.addActionListener(this);
		
		//b2 = new JButton("Cancel");
		//b2.setBounds(250,150,100,30);
		//add(b2);
		
		b3 = new JButton("Back");
		b3.setBounds(250,150,100,30);
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
			new users().setVisible(true);
			
		}else if(text.equals(b1.getText())){
			
				String word="Admin";  //Intialize the word Array
			
				String input=t2.getText();   // Input word to be searched
				System.out.println(input);
				
				if (word.equals(input))   //Search for the given word
				{
					JOptionPane.showMessageDialog(jf,"logged in successfully");
					this.setVisible(false);
					new adminlogin().setVisible(true); 
					
				
				}else{
					JOptionPane.showMessageDialog(jf,"Invalid Password ! Try Again");
					this.setVisible(false);
					new loginpage().setVisible(true);
				
				}
			
		}
		
	}
	public static void main(String s[])
	{
		new loginpage().setVisible(true);
	}
    
}