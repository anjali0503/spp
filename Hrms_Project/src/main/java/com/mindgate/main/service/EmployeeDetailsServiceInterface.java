package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.EmployeeDetails;

public interface EmployeeDetailsServiceInterface {

	public EmployeeDetails getEmployeeByLoginId(int loginId);
	public List<EmployeeDetails> getEmployee();


}
