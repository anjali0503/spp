package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;
@Repository
public class EmployeeDetailsRepository implements EmployeeDetailsRepositoryInterface{

	private final static String GET_EMPLOYEE_BY_LOGIN_ID ="SELECT * FROM EMPLOYEE_DETAILS WHERE LOGIN_ID=?";
	private final static String CHECK_EMPLOYEE_LIST="select a.Employee_Id,a.Ename,a.Salary,a.Project_Id,a.Designation,a.Login_Id,a.MGR,a.Skill_1,a.Skill_2,a.Skill_3,a.Status  from employee_details a,job_description_details b where b.project_id=1003 and .skill_1=a.skill_1 and b.skill_2=a.skill_2 and b.skill_3=a.skill_3";
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeDetails getEmployeeByLoginId(int loginId) {
		EmployeeDetails employeeDetails=jdbcTemplate.queryForObject(GET_EMPLOYEE_BY_LOGIN_ID, new EmployeeDetailsRowMapper(),loginId);
		
		return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}


	



}
