package com.mindgate.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.repository.LoginDetailsRepositoryInterface;


@Service
public class LoginDetailsService implements LoginDetailsServiceInterface {
   @Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepository;


   @Override
	public LoginDetails getUser(LoginDetails loginDetails) {
		
		return loginDetailsRepository.getUser(loginDetails) ;
	}




	
	
	

	
}
