import java.sql.*;

/*
*import package --> java.sql.*;
*load and register the driver --> com.mysql.jdbc.Driver;
*create connection --> Connection Interface
*create statement --> Statement Interface
*execute the querry --> st.executeQuerry()
*process the results
*close
*/

public class connection{
	
	public connection(){
		String url = "jdbc:mysql://localhost:3306/billing";
		String uname = "root";
		String password = "devang";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,password);
			Statement st = con.createStatement();

			st.close();
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		new connection();
	}
}