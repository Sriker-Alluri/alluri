package com.lnsft.SpringBootValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lnsft.SpringBootValidation.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserid(int id);

	
}
