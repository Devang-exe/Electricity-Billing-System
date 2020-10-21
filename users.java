import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author GUPTA
 */
public class users extends JFrame implements ActionListener{
    
    private JButton jb_admin, jb_user;
	private JFrame jf ;
 
    public users() {
		
		//JLabel jl_title = new JLabel("Login as");
		//jl_title.setBounds(220,0,100,20);
		//add(jl_title);
		
        jf = new JFrame();
        
		ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("icons/admin 3.png"));
		Image i1=c1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon c2 = new ImageIcon(i1);
		JLabel jl1 = new JLabel(c2);
		jl1.setBounds(100,50,150,150);
		add(jl1);
		
		jb_admin = new JButton("Admin");
		jb_admin.setBounds(100,250,100,30);
		add(jb_admin);
		jb_admin.setBackground(Color.WHITE);
		jb_admin.addActionListener(this);
		
		
		ImageIcon c3=new ImageIcon(ClassLoader.getSystemResource("icons/user.jpg"));
		Image i2=c3.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon c4=new ImageIcon(i2);
		JLabel jl2 = new JLabel(c4);
		jl2.setBounds(350,50,150,150);
		add(jl2);
		
		jb_user = new JButton("User");
		jb_user.setBounds(390,250,100,30);
		add(jb_user);
		jb_user.setBackground(Color.WHITE);
		jb_user.addActionListener(this);
		
        
        setTitle("Login as");
        setSize(600,400);
        setLayout(null);
        setVisible(true);
        setLocation(500, 200);
		jf.setBackground(Color.WHITE);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
			//System.out.println(text);
			
			if(text.equals(jb_admin.getText())){
				
				JOptionPane.showMessageDialog(jf,"Admin Selected");
				this.setVisible(false);
				new loginpage().setVisible(true);
				
				
			}else if(text.equals(jb_user.getText())){
				
				JOptionPane.showMessageDialog(jf,"User Selected");
				this.setVisible(false);
				new loginpageuser().setVisible(true);
				
			}
    }
    
}