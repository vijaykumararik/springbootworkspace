package com.ty.restapi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.restapi.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//jpa repository is interface it will conatins all methods with that we can do crud oparation
	//simplejparepository is implementation class of jpa repository
	
}
