package com.lnsft.SpringBootCRUD.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Entity
@Table(name="emp")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name; 
	public Employee() {
		super();
		
	}
	public Employee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	

}
