package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {

	public EmployeeDetails getEmployeeByLoginId(int loginId);

	public List<EmployeeDetails> getEmployee();

}
