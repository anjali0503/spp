package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.service.LoginDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("loginapi")
public class LoginDetailsController {

	@Autowired
	private LoginDetailsServiceInterface loginDetailsService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public LoginDetails getUser(@RequestBody LoginDetails loginDetails) {
		System.out.println(loginDetails);

		return loginDetailsService.getUser(loginDetails);
	}
}

