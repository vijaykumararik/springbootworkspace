package com.ty.restapi.repositary;

import java.util.List;
import com.ty.restapi.exception.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ty.restapi.dto.Customer;

@Repository
//help to write persistent logic
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
		
		List<Customer> optional=customerRepository.findAll();
		if(optional!=null) {
			return optional;
		}
		throw new EmptyDataBaseException("Data base is Empty");
	}
	public Customer getbyid(Integer id) {
		Optional<Customer> optional=customerRepository.findById(id);
		if(optional.isPresent()) {
		return  optional.get();
		}else {
			throw new CustomerIdNotFoundException("Customer id is not Found");
		}
	}
	public Customer delete(Integer id) {
		Optional<Customer> optional=customerRepository.findById(id);
		if(optional.isPresent()) {
			 
			customerRepository.deleteById(id);
			return optional.get();
		}
	    throw new CustomerIdNotFoundException("Customer id is not avalable");
	}
	
	
	

}
