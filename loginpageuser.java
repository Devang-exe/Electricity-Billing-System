import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GUPTA
 */
public class loginpageuser extends JFrame implements ActionListener{
   
	JButton b1,b2, b3;
	
	loginpageuser()
	{
		super("User Login");
		
		ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("icons/new.png"));
		Image i1=c1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon c2 = new ImageIcon(i1);
		JLabel jl1 = new JLabel(c2);
		jl1.setBounds(80,50,150,150);
		add(jl1);
		
		b1 = new JButton("New");
		b1.setBounds(100,220,100,30);
		add(b1);
		b1.addActionListener(this);
		
		ImageIcon c3=new ImageIcon(ClassLoader.getSystemResource("icons/exist 2.png"));
		Image i2=c3.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon c4=new ImageIcon(i2);
		JLabel jl2 = new JLabel(c4);
		jl2.setBounds(250,50,150,150);
		add(jl2);
		
		b2 = new JButton("Existing");
		b2.setBounds(290,220,100,30);
		add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("Back");
		b3.setBounds(190,270,100,30);
		add(b3);
		b3.addActionListener(this);
		
        setSize(500,350);
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
		}else if(text.equals(b2.getText())){
			this.setVisible(false);
			new loginpageuser2().setVisible(true);
		}else if(text.equals(b1.getText())){
			this.setVisible(false);
			new regform().setVisible(true);
		}
		
	}
	public static void main(String s[])
	{
		new loginpageuser().setVisible(true);
	}
    
}