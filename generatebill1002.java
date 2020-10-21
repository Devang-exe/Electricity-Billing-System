import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.io.*;

/**
 *
 * @author GUPTA
 */
 
public class generatebill1002 extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	//JTextField jl7,jl8;
	//JButton jb2,jb3;
	
	generatebill1002()
	{
		super("Generate Bill");
		
		JLabel l2 = new JLabel("Meter No. ");
		l2.setBounds(50,50,150,30);
        add(l2);
		Font f = new Font("monospaced",Font.PLAIN,20);
		l2.setFont(f);
		
        JLabel l1 = new JLabel("1002");
		l1.setBounds(70,90,100,40);
        add(l1);
		l1.setFont(f);
		
		ImageIcon c3 = new ImageIcon(ClassLoader.getSystemResource("icons/generate.png"));
		Image i2=c3.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
		ImageIcon c4=new ImageIcon(i2);
		JLabel jl2 = new JLabel(c4);
		jl2.setBounds(210,30,150,150);
		add(jl2);
		
		Font f1 = new Font("Arial",Font.BOLD,16);
		
		JLabel l3 = new JLabel("Bill Statement for");
		l3.setBounds(100,200,200,30);
		l3.setFont(f1);
		add(l3);
		
		JLabel l5 = new JLabel("05-Sep-20 To 04-Oct-20");
		l5.setBounds(80,230,300,30);
		l5.setFont(f1);
		add(l5);
		
		JLabel l4 = new JLabel("Generated On 05-Oct-20");
		l4.setBounds(90,270,250,40);
        add(l4);
		l4.setForeground(Color.RED);
		l4.setFont(f1);
		
		Font f2 = new Font("Arial",Font.BOLD,14);
		
		JLabel l6 = new JLabel("Units Cosumed ");
		l6.setBounds(30,330,200,40);
        add(l6);
		l6.setFont(f2);
		
		JLabel l7 = new JLabel("100 units");
		l7.setBounds(300,330,200,40);
        add(l7);
		l7.setFont(f2);
		
		JLabel l8 = new JLabel("Cost of Per Unit");
		l8.setBounds(30,370,200,40);
        add(l8);
		l8.setFont(f2);
		
		JLabel l9 = new JLabel("Rs.5");
		l9.setBounds(300,370,200,40);
        add(l9);
		l9.setFont(f2);
		
		JLabel l11 = new JLabel("Total Charges Till now");
		l11.setBounds(30,420,200,30);
        add(l11);
		l11.setFont(f2);
		
		JLabel l10 = new JLabel("Rs.500");
		l10.setBounds(300,420,200,40);
        add(l10);
		l10.setFont(f2);
		
		JLabel l12 = new JLabel("(Updated Yesturday)");
		l12.setBounds(30,450,200,30);
		add(l12);
		l12.setFont(f2);
		
		JLabel l13 = new JLabel("Due in 10 days ");
		l13.setBounds(120,500,200,40);
        add(l13);
		l13.setForeground(Color.RED);
		l13.setFont(f1);
		
		JButton jb1 = new JButton("Pay Now");
		jb1.setBounds(250,500,100,40);
		add(jb1);
		jb1.addActionListener(this);
		
		
        setSize(400,600);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setLocation(500,200);
	

	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("Pay Now")){
			int i=JOptionPane.showConfirmDialog(jf,"Proceed to pay ?"," ",JOptionPane.YES_NO_OPTION);
			//int i = JOptionPane.showConfirmDialog(new ConfirmDialogInFrame(),"Proceed to Pay?", "Customized Dialog",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if(i==0){
				this.setVisible(false);
				new pay().setVisible(true);
			}else if(i==1){
				JOptionPane.showMessageDialog(jf,"Payment Cancel","Alert",JOptionPane.WARNING_MESSAGE); 
				new userlogin1002().setVisible(true);
			}
		}
	}
	public static void main(String s[])
	{
		new generatebill1002().setVisible(true);
	}
    
}