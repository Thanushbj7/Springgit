import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/traildb";
		String username="root";
		String password="root";
		Connection connection=null;
		Statement statement=null;
		
 try{
	 connection= DriverManager.getConnection(url,username,password);
	 statement=connection.createStatement();
	String sql="update policy set type='Vehicle'where policy_id=10";
	boolean result=statement.execute(sql);
	System.out.println("Table updated"+result);
} catch (SQLException e) {
	e.printStackTrace();
}finally {
		try {
			if(connection!=null)
				connection.close();
		if(statement!=null) 
			statement.close();
		}
		catch (SQLException e) {
			e.printStackTrace();

}
}
	}
	}


