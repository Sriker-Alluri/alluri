package com.lnsft.SpringBootValidation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	 private int userid;
	 private String name;
	 private String email;
	 private String mobile;
	 private String gender;
	 private int age;
	 private String nationality;

}
