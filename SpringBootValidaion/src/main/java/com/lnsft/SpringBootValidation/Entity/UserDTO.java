package com.lnsft.SpringBootValidation.Entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDTO {
	
	@NotNull(message = "User shouldn't be null" )
	 private String name;
	@Email(message = "invali email")
	 private String email;
	@NotNull
	 private String mobile;
	 private String gender;
	 @Min(18)
	 @Max(60)
	 private int age;
	 @NotBlank
	 private String nationality;


}
