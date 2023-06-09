package com.ty.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.restapi.dto.Customer;
import com.ty.restapi.repositary.CustomerDao;
import com.ty.restapi.response.ResponceStucture;

@Service
public class CustomerService {
 
	@Autowired CustomerDao customerDao;

	public ResponceStucture<?> customerpersist(Customer customer) {
		
		Customer cust =customerDao.customerpersist(customer);
		ResponceStucture<Customer> responceStucture=new ResponceStucture<>();
		responceStucture.setData(cust);
		responceStucture.setHttpStatus(HttpStatus.CREATED);
		
		return responceStucture ;
	}
	
	public ResponceStucture<?> findallcustomers(){
		List<Customer> customers=customerDao.findallcustomers();
		ResponceStucture<List<Customer>> responceStucture=new ResponceStucture<>();
		responceStucture.setData(customers);
		responceStucture.setHttpStatus(HttpStatus.FOUND);
		return responceStucture;
	}

	public ResponceStucture<?> getbyid(Integer id) {
		Customer customer=customerDao.getbyid(id);

		ResponceStucture<Customer> responceStucture=new ResponceStucture<>();
		responceStucture.setData(customer);
		responceStucture.setHttpStatus(HttpStatus.FOUND);
		return responceStucture;
		
	}

	
	public ResponceStucture<?>deletecustomer(Integer id){
		Customer customer=customerDao.delete(id);
		ResponceStucture<Customer> responceStucture=new ResponceStucture<>();
		responceStucture.setData(customer);
		responceStucture.setHttpStatus(HttpStatus.OK);
		return responceStucture;
	}
	
	
	
	
	
	
	
}
