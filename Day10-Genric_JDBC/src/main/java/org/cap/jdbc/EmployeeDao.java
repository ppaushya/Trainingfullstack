package org.cap.jdbc;

import java.util.List;

public interface EmployeeDao {
	
	public void createEmployee(Employee employee);
	public void deleteEmployee(int employeeId);
	
	public List<Employee>  getAllEmployees();
	public Employee findEmployee(int empId1);
	

}
