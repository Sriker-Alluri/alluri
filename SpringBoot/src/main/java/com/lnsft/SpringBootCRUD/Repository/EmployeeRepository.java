package com.lnsft.SpringBootCRUD.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;

import com.lnsft.SpringBootCRUD.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByName(String name);

   // @Query(value = "DELETE FROM Employee employee WHERE employee.name = :name")     // it will delete all the record with specific name
    	  //String deleteByName(@PathVariable("name") String name);


	Employee deleteByName(String name);

	

}
