package com.ty.restapi.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.restapi.dto.Customer;

@Repository
//help to write persistant logic
public class CustomerDao {
  
	@Autowired
	CustomerRepository customerRepository;
	//simple jpa repository object--> is injected here in customerRepository becouse 
	//it is interface 
	
	public Customer customerpersist(Customer customer) {
		Customer cust=customerRepository.save(customer);
		return cust;
	}
	public List<Customer> findallcustomers(){
		return customerRepository.findAll();
	}

}
