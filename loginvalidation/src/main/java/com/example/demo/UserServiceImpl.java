package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
   @Autowired
	UserRepo repo;
	@Override
	public Users login(String data, String password) {
		Users u1=repo.validate(data, data);
		if(u1!=null) {
			if(u1.getUpassword().equals(password)) {
				return u1;
			}else {
				throw new InvalidCredentialsException();
			}
		}
		else {
			throw new InvalidCredentialsException();
		}
		
	}

}
