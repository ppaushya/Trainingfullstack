package org.capgemini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		
		/*Connection connection=null;*/
		
		//load driver class
		try(Connection connection=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin")) {	
			Class.forName("com.mysql.jdbc.Driver");
			
			//connection establishment
			
			
			String sql="create table employee2(empid int primary key, firstName varchar(25) not null,"
					+ "lastName varchar(25),salary numeric(8,2),empdoj date)";
			
			Statement statement=connection.createStatement();
			
			boolean flag=statement.execute(sql);
			if(!flag)
				System.out.println("Table created Successfully!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}/*finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		
		
	}

}
