package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.JobDescriptionDetails;
import com.mindgate.main.domain.LoginDetails;
import com.mindgate.main.repository.JobDescriptionDetailsRepositoryInterface;

@Service
public class JobDescriptionDetailsService implements JobDescriptionDetailsServiceInterface {

	@Autowired
	private JobDescriptionDetailsRepositoryInterface repositoryInterface;

	@Override
	public List<JobDescriptionDetails> getAllDescription() {

		return repositoryInterface.getAllDescription();
	}

	@Override
	public List<JobDescriptionDetails> getJobDescriptionByemployeeId(int employeeId) {

		return repositoryInterface.getJobDescriptionByemployeeId(employeeId);
	}

	@Override
	public boolean addJobDescription(JobDescriptionDetails jobDescriptionDetails) {
		// TODO Auto-generated method stub
		return repositoryInterface.addJobDescription(jobDescriptionDetails);
	}

	@Override
	public List<JobDescriptionDetails> getJobDescriptionByProjectId(String projectId) {
		// TODO Auto-generated method stub
		return repositoryInterface.getJobDescriptionByProjectId(projectId);
	}

	
}
