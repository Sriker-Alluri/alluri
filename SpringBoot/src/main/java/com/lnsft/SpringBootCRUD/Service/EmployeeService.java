package com.lnsft.SpringBootCRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsft.SpringBootCRUD.Entity.Employee;
import com.lnsft.SpringBootCRUD.Repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee=employeeRepository.save(employee);
		return savedEmployee;
		
		
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
		
	}
	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).get();
	}
	@Override
	public void deleteEmployeeById(Long id) {
	employeeRepository.deleteById(id);
		
	}
	@Override
	public List<Employee> getEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}
	@Override
	public void deleteEmployeeByName(String name) {
		employeeRepository.deleteByName(name);
		
	}
	@Override
     public void deleteAllEmployees() {
		
		employeeRepository.deleteAll();
		
	}
	

}
