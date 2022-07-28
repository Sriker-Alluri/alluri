package com.lnsft.SpringBootCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnsft.SpringBootCRUD.Entity.Employee;
import com.lnsft.SpringBootCRUD.Service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@PostMapping({"/save"})
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
	
		Employee savedEmployee=employeeServiceInterface.addEmployee(employee); 
		return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED); 
	
	
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		List<Employee> listOfAllEmployees= employeeServiceInterface.getAllEmployees();
		return new ResponseEntity<List<Employee>>(listOfAllEmployees,HttpStatus.OK);
	
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
		
		Employee employeeRetrieved= employeeServiceInterface.getEmployeeById(id);
		return new ResponseEntity<Employee>(employeeRetrieved,HttpStatus.OK);
	
	}
	
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") Long id){
		
		employeeServiceInterface.deleteEmployeeById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	
	}
	
	@GetMapping("/em/{name}")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("name") String name){
		
	List<Employee> employeeRetrieved= employeeServiceInterface.getEmployeeByName(name);
		return new ResponseEntity<List<Employee>>(employeeRetrieved,HttpStatus.OK);
	
	}
	

	
	@DeleteMapping("/all")
	public void deleteAllEmployees(){
		
		employeeServiceInterface.deleteAllEmployees();
		
	
	}
	
	@DeleteMapping("/mp/{name}")
	public void deleteEmployeeByName( String name){
		
		employeeServiceInterface.deleteEmployeeByName(name);
		
	}



}
