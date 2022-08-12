package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreUpdateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/traildb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
 try{
	connection=DriverManager.getConnection(url,username,password);
	String name="idly";
	String type="nonveg";
	String sql="update food set type=? where name=?";
	preparedStatement=connection.prepareStatement(sql);
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, type);
//	preparedStatement.setString(1, "idly");
//	preparedStatement.setInt(2, 30);
//	preparedStatement.setFloat(3, 200);
//	preparedStatement.setString(4, "veg");
	preparedStatement.execute();
	
	
} catch (SQLException e) {
	e.printStackTrace();
}finally {
		try {
			if(connection!=null)
				connection.close();
		if(preparedStatement!=null) 
			preparedStatement.close();
		}
		catch (SQLException e) {
			e.printStackTrace();

}
}
	}

}
