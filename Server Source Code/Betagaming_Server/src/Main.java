import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
	
	public static void main(String[] args){
		
		try {
			System.out.println("Loading Driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Done!\n");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Connecting Database...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/betagaming","root","root");
			System.out.println("Done!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
