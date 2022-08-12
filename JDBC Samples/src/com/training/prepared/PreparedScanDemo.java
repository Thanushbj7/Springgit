package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedScanDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/traildb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		
 try{
	 connection= DriverManager.getConnection(url,username,password);
	 String sql="insert into food values(?,?,?,?)";
	 preparedStatement=connection.prepareStatement(sql);
	  scanner=new Scanner(System.in);
	 for(int i=0;i<1;i++) {
		 System.out.println("Enter food name");
		 String name=scanner.next();
		 System.out.println("Enter food Id");
		 int foodId=scanner.nextInt();
		 System.out.println("Enter food type");
		 String type=scanner.next();
		 System.out.println("Enter cost");
		 float cost=scanner.nextFloat();
		 
		 preparedStatement.setString(1, name);
		 preparedStatement.setInt(2, foodId);
		 preparedStatement.setString(3, type);
		 preparedStatement.setFloat(4, cost);
		 
		 
	 }
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

