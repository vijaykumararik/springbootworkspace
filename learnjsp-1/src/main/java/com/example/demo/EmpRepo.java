package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee, Integer>  {

//	@Query(value = "select * from users where uemail=?1 or uname=?2",nativeQuery = true)
//	Employee validate(String uemail, String uname);


}
