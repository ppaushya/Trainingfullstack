package org.cap.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void createEmployee(Employee employee) {
		String sql="insert into employee values(?,?,?,?,?)";
		/*String sql="insert into employee values("+employee.getEmpId()+"'"+employee.getFirstName()+"','"
				+ employee.getLastName()+"',"+employee.getSalary()+",'"+employee.getEmpdoj()+"')";*/
		
		try(Connection conn=getDbConnection()) {
		//	Statement statement=conn.createStatement();
			
			PreparedStatement statement=conn.prepareStatement(sql);
			statement.setInt(1, employee.getEmpId());
			statement.setString(2, employee.getFirstName());
			statement.setString(3, employee.getLastName());
			statement.setDouble(4, employee.getSalary());
			statement.setDate(5,java.sql.Date.valueOf(employee.getEmpdoj()));
			
			
			
			//int count=statement.executeUpdate(sql);
			int count=statement.executeUpdate();
			
			if(count>0)
				System.out.println("Insertion done!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	private Connection getDbConnection() {
		Connection connection=null;
		try{	
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/mydb", "root", "India123");
			return connection;
		}catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}


	@Override
	public void deleteEmployee(int employeeId) {
		String sql="delete from employee where empid=?";
		try(Connection conn=getDbConnection()) {
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, employeeId);
			
			int count=pst.executeUpdate();
			if(count>0)
				System.out.println("Deletion Done!");
			else
				System.out.println("Deletion Error!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
	public List<Employee> findEmployee(int empId) {
		List<Employee> employees=new ArrayList<>();
		String sql="select * from employee where empid=?";
		
		try(Connection conn=getDbConnection()){
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, empId);
			ResultSet resultSet= pst.executeQuery();
			while(resultSet.next()) {
				Employee employee=new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setEmpdoj(resultSet.getDate(5).toLocalDate());
				employees.add(employee);
				
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		
		String sql="select * from employee";
		try(Connection conn=getDbConnection()) {
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet resultSet= pst.executeQuery();
			while(resultSet.next()) {
				Employee employee=new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setEmpdoj(resultSet.getDate(5).toLocalDate());
				employees.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return employees;
	}

}
