package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;

public interface JobDescriptionDetailsRepositoryInterface {
	public List<JobDescriptionDetails> getAllDescription();

	public List<JobDescriptionDetails> getJobDescriptionByemployeeId(int employeeId);
	
	public boolean addJobDescription(JobDescriptionDetails jobDescriptionDetails);

	public List<JobDescriptionDetails> getJobDescriptionByProjectId(String projectId);
	

}
