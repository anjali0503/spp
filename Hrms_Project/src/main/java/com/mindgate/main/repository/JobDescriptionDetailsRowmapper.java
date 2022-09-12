package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;
import com.mindgate.main.domain.ProjectDetails;

public class JobDescriptionDetailsRowmapper implements RowMapper<JobDescriptionDetails> {

	@Override
	public JobDescriptionDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		int jobId = rs.getInt("job_id");
		String skill1 = rs.getString("skill_1");
		String skill2 = rs.getString("skill_2");
		String skill3 = rs.getString("skill_3");
		String jobStatus = rs.getString("job_status");
		int RequiredCandidate = rs.getInt("Required_candidate");

		ProjectDetails projectDetails = new ProjectDetails();

		projectDetails.setProjectId(rs.getString("PROJECT_ID"));
		projectDetails.setProjectName(rs.getString("PROJECT_NAME"));
		projectDetails.setProjectCost(rs.getInt("PROJECT_COST"));
		EmployeeDetails employeeDetails = new EmployeeDetails();

		employeeDetails.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
		employeeDetails.setEname(rs.getString("ENAME"));
		employeeDetails.setSalary(rs.getInt("SALARY"));
		
		employeeDetails.setDesignation(rs.getString("DESIGNATION"));

		employeeDetails.setLoginId(rs.getInt("LOGIN_ID"));

		employeeDetails.setMGR(rs.getInt("MGR"));
		employeeDetails.setSkill1(rs.getString("SKILL_1"));
		employeeDetails.setSkill2(rs.getString("SKILL_2"));

		employeeDetails.setSkill3(rs.getString("SKILL_3"));
		employeeDetails.setStatus(rs.getString("STATUS"));
		
	JobDescriptionDetails jobDescriptionDetails = new JobDescriptionDetails(jobId, skill1, skill2, skill3,
			jobStatus, RequiredCandidate, employeeDetails,
			projectDetails);
					
		return jobDescriptionDetails;
	}

}
