package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<Users, Integer> {
	
	@Query(value = "select * from users where uemail=?1 or uname=?2",nativeQuery = true)
	Users validate(String uemail, String uname);
	

}
