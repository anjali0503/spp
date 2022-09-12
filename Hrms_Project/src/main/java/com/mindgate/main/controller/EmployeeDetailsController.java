package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;
import com.mindgate.main.service.EmployeeDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("employeedetailsapi")
public class EmployeeDetailsController {
	@Autowired
	private EmployeeDetailsServiceInterface  employeeDetailsService;
	
	@RequestMapping(value = "getbyid/{loginId}", method = RequestMethod.GET)
	public EmployeeDetails getEmployeeByLoginId(@PathVariable int loginId) {
		return employeeDetailsService.getEmployeeByLoginId(loginId) ;
	}
	
	@RequestMapping(value = "checkemployeelist", method = RequestMethod.GET)
	public List<EmployeeDetails> getEmployee(){
	
		return employeeDetailsService.getEmployee();
	}
	
}
