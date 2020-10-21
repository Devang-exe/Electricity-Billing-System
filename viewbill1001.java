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
 
public class viewbill1001 extends JFrame implements ActionListener{
    
	JFrame jf = new JFrame();
	JTextArea t1;
	JComboBox jc1,jc2;
	
	viewbill1001()
	{
		super("View Bills");
		
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
		jc2.addItem("01-01-20 to 02-02-20");
		jc2.addItem("01-02-20 to 02-03-20");
		jc2.addItem("01-03-20 to 02-04-20");
		jc2.addItem("01-04-20 to 02-05-20");
		jc2.addItem("01-05-20 to 02-06-20");
		jc2.addItem("01-06-20 to 02-07-20");
		jc2.addItem("01-07-20 to 02-08-20");
		jc2.addItem("01-08-20 to 02-09-20");
		jc2.addItem("01-09-20 to 02-10-20");
		
        
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
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==1){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
			
				
				
			}else if(i==2){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==3){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==4){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==5){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==6){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
			
				
				
			}else if(i==7){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
				
				
				
			}else if(i==8){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
				t1.setEditable(false);
			
				
				
			}else if(i==9){
				String month1=jc2.getItemAt(i).toString();
				//String month2=jc2.getItemAt(i).toString();
				t1.setEnabled(true);
				t1.setText("\tBharat Power limited \n\t Monthly Statement\n -------------------------------------------------------------------\n Name\t Mr. Devang Gupta\n Address\t Amrapali Noida UP\n Meter No. \t 1001\n Credit Limit \t 1000\n Phone No \t 9876543210\n Bill Period\t "+month1+"\n Email Id: \t Devang@gmail.com \n ----------------------------------------------------------------\n Amount \t Rs.171845.49 \n Load Main \t 7000.00 W \n Load DG \t 3500.00 W \n Due Date \t 10th of the Month \n ------------------------------------------------------------------------------------ \n\t Bill Details \n Monthly Charges \t Rs.5471.88 \n Last Balance \t\t Rs.11713.61 \n Total Amount \t\t Rs.17185.49");
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
		new viewbill1001().setVisible(true);
	}
    
}