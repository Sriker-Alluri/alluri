package com.lnsft.SpringBootCRUD.Service;

import java.util.List;

import com.lnsft.SpringBootCRUD.Entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Long id);

	public void deleteEmployeeById(Long id);

	public List<Employee> getEmployeeByName(String name);

	public void deleteEmployeeByName(String name);

	public void deleteAllEmployees();
	

} 
