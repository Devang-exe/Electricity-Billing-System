import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationForm extends JFrame implements ActionListener
{
	
	private JFrame jframe; //frame Window
	private JLabel jl_title, jl_username, jl_password, jl_dob, jl_gender, jl_skills; // Labels on the Window
	private JTextField jtf_username; //username textfield
	private JPasswordField jpf_password; //password TextField
	private JComboBox jcb_date, jcb_month, jcb_year; 
	private JRadioButton jrb_male, jrb_female;
	private JCheckBox jcb_java, jcb_python, jcb_c;
	private JButton jb_submit, jb_clear;
	
	ButtonGroup bg_gender = new ButtonGroup();
	ButtonGroup bg_skills = new ButtonGroup();
		
	public void RegistrationForm(){
		
		jframe = new JFrame();
		jframe.setTitle("RegistrationForm");
			
		String title = " RegistrationForm ";
		jl_title = new JLabel(title);
		jl_title.setBounds(500,30,300,40);
		jframe.add(jl_title);
		
		jl_username = new JLabel("Enter User Name");
		jl_username.setBounds(300,100,300,40);
		jframe.add(jl_username);
		
		jtf_username = new JTextField();
		jtf_username.setBounds(500,100,300,30);
		jframe.add(jtf_username);
		
		jl_password = new JLabel("Enter Password");
		jl_password.setBounds(300,150,300,40);
		jframe.add(jl_password);
		
		jpf_password = new JPasswordField();
		jpf_password.setBounds(500,150,300,30);
		jframe.add(jpf_password);
		
		jl_gender = new JLabel("Gender");
		jl_gender.setBounds(300,200,300,40);
		jframe.add(jl_gender);
		
		
		
		jrb_female = new JRadioButton("Female");
		jrb_female.setBounds(500,200,100,30);
		jframe.add(jrb_female);
		bg_gender.add(jrb_female);
		
		jrb_male = new JRadioButton("male");
		jrb_male.setBounds(650,200,100,30);
		jframe.add(jrb_male);
		bg_gender.add(jrb_male);
		
		jl_dob = new JLabel("Date of Birth");
		jl_dob.setBounds(300,250,300,40);
		jframe.add(jl_dob);
		
		jcb_date = new JComboBox();
		jcb_date.setBounds(500,250,100,30);
		jframe.add(jcb_date);
		jcb_date.addItem("Date");
		
		for(int i=1;i<=31;i++){
			String date=""+i;
			jcb_date.addItem(date);
		}
		
		jcb_month = new JComboBox();
		jcb_month.setBounds(600,250,100,30);
		jframe.add(jcb_month);
		jcb_month.addItem("Month");
		
		for(int i=1;i<=12;i++){
			String Month=""+i;
			jcb_month.addItem(Month);
		}
		
		jcb_year = new JComboBox();
		jcb_year.setBounds(700,250,100,30);
		jframe.add(jcb_year);
		jcb_year.addItem("Year");
		
		for(int i=1900;i<=2030;i++){
			String Year=""+i;
			jcb_year.addItem(Year);
		}
		
		jl_skills = new JLabel("Skills");
		jl_skills.setBounds(300,300,300,40);
		jframe.add(jl_skills);
		
		jcb_c = new JCheckBox("C");
		jcb_c.setBounds(500,300,100,30);
		jframe.add(jcb_c);
		bg_skills.add(jcb_c);
		
		jcb_java = new JCheckBox("Java");
		jcb_java.setBounds(600,300,100,30);
		jframe.add(jcb_java);
		bg_skills.add(jcb_java);
		
		jcb_python = new JCheckBox("Python");
		jcb_python.setBounds(700,300,100,30);
		jframe.add(jcb_python);
		bg_skills.add(jcb_python);
		
		jb_submit = new JButton("Submit");
		jb_submit.setBounds(400,350,150,30);
		jframe.add(jb_submit);
		jb_submit.addActionListener(this);
		
		jb_clear = new JButton("Clear");
		jb_clear.setBounds(600,350,150,30);
		jframe.add(jb_clear);
		jb_clear.addActionListener(this);
		
			
		//Default closing statements
		setSize(1080,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setLocation(500,200);
	}
	
	public void actionPerformed(ActionEvent ae){
			String text = ae.getActionCommand();
			//System.out.println(text);
			
			if(text.equals(jb_submit.getText())){
				System.out.println("User Name is: " + jtf_username.getText());
				System.out.println("Password is: " + jpf_password.getText());
				String gender = "";
				if(jrb_male.isSelected()){
					gender = jrb_male.getText();
				}else{
					gender = jrb_female.getText();
				}
				
				System.out.println("Gender is: "+gender);
				System.out.println("Date is: " + jcb_date.getSelectedItem());
				System.out.println("Month is: " + jcb_month.getSelectedItem());
				System.out.println("Year is; " + jcb_year.getSelectedItem());
				
				String skills="";
				if(jcb_c.isSelected()){
					skills = "C";
				}else{
					skills = "None";
				}
				
				System.out.println("Skills: " + skills);
				
				JOptionPane.showMessageDialog(jframe,"success");
				
				 
				
				
			}else if(text.equals(jb_clear.getText())){
				jtf_username.setText("");
				jpf_password.setText("");
				jcb_date.setSelectedIndex(0);
				jcb_month.setSelectedIndex(0);
				jcb_year.setSelectedIndex(0);
				bg_gender.clearSelection();
				bg_skills.clearSelection();
				JOptionPane.showMessageDialog(jframe,"Cleared");
				
			}
			
			
				
				int a=JOptionPane.showConfirmDialog(jframe,"Are you sure?");  
				if(a==JOptionPane.CANCEL_OPTION){  
					jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
				} 
		}
		
		
	//public static void main(String[] args){
		
		//new RegistrationForm();
		//r.setVisible(true);
		//r.doAction();
	//}
}