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
 
public class newgeneratebill extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	//JTextField jl7,jl8;
	//JButton jb2,jb3;
	String input=""; 
	
	newgeneratebill()
	{
		super("Generate Bill");
		
		JLabel l2 = new JLabel("Meter No. ");
		l2.setBounds(50,50,150,30);
        add(l2);
		Font f = new Font("monospaced",Font.PLAIN,20);
		l2.setFont(f);
		
		
		try{
			
			String[] words=null;  //Intialize the word Array
			
			FileReader fr = new FileReader("meter.txt");  //Creation of File Reader object
				
			BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
				
			String s; 
			
			boolean flag=false;
				//String input1=t1.getText();
				
			  // Input word to be searched
				
			while((s=br.readLine())!=null)   //Reading Content from the file
			{
				words=s.split(" ");  //Split the word using space
				for (String word : words) 
				{
					input = word; //System.out.println(word);
					
				}
			}
		}catch(Exception e){
			
		}
		
        JLabel l1 = new JLabel(input);
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
		
		JLabel l5 = new JLabel("05-Oct-20 To 04-Nov-20");
		l5.setBounds(80,230,300,30);
		l5.setFont(f1);
		add(l5);
		
		JLabel l4 = new JLabel("Not Generated Yet");
		l4.setBounds(110,270,200,40);
        add(l4);
		l4.setForeground(Color.GREEN);
		l4.setFont(f1);
		
		Font f2 = new Font("Arial",Font.BOLD,14);
		
		JLabel l6 = new JLabel("Units Cosumed Till Now");
		l6.setBounds(30,310,200,40);
        add(l6);
		l6.setFont(f2);
		
		JLabel l7 = new JLabel("0 Units");
		l7.setBounds(300,310,200,40);
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
		
		JLabel l10 = new JLabel("Rs.00.00");
		l10.setBounds(300,420,200,40);
        add(l10);
		l10.setFont(f2);
		
		JLabel l12 = new JLabel("(Updated Yesturday)");
		l12.setBounds(30,450,200,30);
		add(l12);
		l12.setFont(f2);
		
		JLabel l13 = new JLabel("No history found for Meter no. "+input);
		l13.setBounds(70,500,300,40);
        add(l13);
		l13.setForeground(Color.GREEN);
		l13.setFont(f1);
		
		
        setSize(400,600);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setLocation(500,200);
	

	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
	}
	public static void main(String s[])
	{
		new newgeneratebill().setVisible(true);
	}
    
}