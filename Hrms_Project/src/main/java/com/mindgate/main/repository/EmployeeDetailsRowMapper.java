package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.ProjectDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		   int EmployeeId=rs.getInt("EMPLOYEE_ID") ;
		    String  Ename=rs.getString("ENAME") ;
		  int  Salary=rs.getInt("SALARY") ;
		    String   ProjectId =rs.getString("PROJECT_ID");
		    String  Designation=rs.getString("DESIGNATION") ;
		     int  LoginId =rs.getInt("LOGIN_ID");
		     int  MGR=rs.getInt("MGR") ;
		    String  Skill1=rs.getString("SKILL_1") ;
		    String   Skill2=rs.getString("SKILL_2") ;
		   String    Skill3=rs.getString("SKILL_3") ;
		    String  Status=rs.getString("STATUS") ;
		    ProjectDetails projectDetails=new ProjectDetails();
		    projectDetails.setProjectId(ProjectId);
		   EmployeeDetails employeeDetails =new EmployeeDetails(EmployeeId, Ename, Salary, projectDetails, Designation, LoginId, MGR, Skill1, Skill2, Skill3, Status);
		return employeeDetails;
	}
	

	

}
