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
 
public class newviewbill extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	JTextArea t1;
	JComboBox jc1,jc2;
	
	String name="";
	String meterno="";
	
	newviewbill()
	{
		super("View Bills");
		
		try{
			
			String[] mwords=null;  //Intialize the word Array
			
			FileReader fr = new FileReader("meter.txt");  //Creation of File Reader object
				
			BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
				
			String s; 
			
			boolean flag=false;
				//String input1=t1.getText();
				
			  // Input word to be searched
				
			while((s=br.readLine())!=null)   //Reading Content from the file
			{
				mwords=s.split(" ");  //Split the word using space
				for (String mword : mwords) 
				{
					meterno = mword; //System.out.println(word);
					
				}
			}
		}catch(Exception e){
			
		}
		
		try{
			
			String[] words=null;  //Intialize the word Array
			
			FileReader fr = new FileReader("name.txt");  //Creation of File Reader object
				
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
					name = word; //System.out.println(word);
					
				}
			}
		}catch(Exception e){
			
		}
		
		Font f1=new Font("Senserif",Font.BOLD,14);
		
		JLabel jl1 = new JLabel("Meter No.");
		jl1.setBounds(60,10,80,30);
		jl1.setFont(f1);
		add(jl1);
		
		
		jc1 = new JComboBox();
		jc1.setBounds(50,40,80,30);
		jc1.addItem("1001");
		add(jc1);
		jc1.setEnabled(false);
		
		JLabel jl2 = new JLabel("Duration");
		jl2.setBounds(240,10,80,30);
		jl2.setFont(f1);
		add(jl2);
		
		
		jc2 = new JComboBox();
		jc2.setBounds(180,40,190,30);
		jc2.addItem("05-01-20 to 04-02-20");
		jc2.addItem("05-02-20 to 04-03-20");
		jc2.addItem("05-03-20 to 04-04-20");
		jc2.addItem("05-04-20 to 04-05-20");
        jc2.addItem("05-05-20 to 04-06-20");
		jc2.addItem("05-06-20 to 04-07-20");
		jc2.addItem("05-07-20 to 04-08-20");
		jc2.addItem("05-08-20 to 04-09-20");
		jc2.addItem("05-09-20 to 04-10-20");
		jc2.setEnabled(true);
        
		jc2.setFont(f1);
		add(jc2);
		
		t1 = new JTextArea();
		t1.setBounds(30,100,330,400);
		t1.setFont(f1);
		t1.setEnabled(false);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/print.png"));
        Image img1=i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img1);
		
		JButton jb1 = new JButton("Print",i2);
		jb1.setBounds(70,510,100,40);
		add(jb1);
		jb1.addActionListener(this);
		
		ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icons/show.png"));
        Image img2=i3.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i4=new ImageIcon(img2);
		
		JButton jb2 = new JButton("Show",i4);
		jb2.setBounds(220,510,100,40);
		add(jb2);
		jb2.addActionListener(this);
		
		
		add(t1);
        setSize(400,600);
		setLayout(null);
		setResizable(false);
        setBackground(Color.BLUE);
		setLocation(500,200);
	

	}
	
	public void actionPerformed(ActionEvent ev)
	{
		String msg = ev.getActionCommand();
		
		if(msg.equals("Show")){
			int i = jc2.getSelectedIndex();
			
			if(i==0){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==1){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==2){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==3){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==4){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==5){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==6){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==7){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==8){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t  \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}else if(i==9){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. "+ name +" \n Address\t \n Meter No. \t "+ meterno +" \n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t "+ name +"@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.0 \n Load Main \t 0 W \n Load DG \t 0 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.0 \n Last Balance \t\t Rs.0 \n Total Amount \t\t Rs.0");
				t1.setEditable(false);
				
			}
            
		}else if(msg.equals("Print")){
			try{
				t1.print();
			}catch(Exception e){
				
			}
		}
		
		
	}
	public static void main(String s[])
	{
		new newviewbill().setVisible(true);
	}
    
}