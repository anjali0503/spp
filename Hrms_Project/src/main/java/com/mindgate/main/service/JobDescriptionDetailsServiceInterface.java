package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;
import com.mindgate.main.domain.LoginDetails;

public interface JobDescriptionDetailsServiceInterface {

	public List<JobDescriptionDetails> getAllDescription();

	public List<JobDescriptionDetails> getJobDescriptionByemployeeId(int employeeId);
	
	public boolean addJobDescription(JobDescriptionDetails jobDescriptionDetails);

	public List<JobDescriptionDetails> getJobDescriptionByProjectId(String projectId);
	
	

}
