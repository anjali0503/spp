package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.JobDescriptionDetails;
import com.mindgate.main.service.JobDescriptionDetailsServiceInterface;
import com.mindgate.main.service.LoginDetailsServiceInterface;

@CrossOrigin("*")
@RestController
@RequestMapping("jobdescriptionapi")
public class JobDescriptionDetailsController {
	@Autowired
	private JobDescriptionDetailsServiceInterface jobDescriptionDetailsService;

	@RequestMapping(value = "getall", method = RequestMethod.GET)
	public List<JobDescriptionDetails> getAllDescription() {
		return jobDescriptionDetailsService.getAllDescription();

	}

	@RequestMapping(value = "getbyemployeeid/{employeeId}", method = RequestMethod.GET)
	public List<JobDescriptionDetails> getJobDescriptionByemployeeId(@PathVariable int employeeId) {
		return jobDescriptionDetailsService.getJobDescriptionByemployeeId(employeeId);
	}

	@RequestMapping(value="addJob",method=RequestMethod.POST)
	public boolean addJobDescription(@RequestBody JobDescriptionDetails jobDescriptionDetails) {
		System.out.println(jobDescriptionDetails);
		return jobDescriptionDetailsService.addJobDescription(jobDescriptionDetails);
	}
	
	@RequestMapping(value = "getpendingrequests/{projectId}", method = RequestMethod.GET)
	public List<JobDescriptionDetails> getJobDescriptionByProjectId(@PathVariable String projectId){
		return jobDescriptionDetailsService.getJobDescriptionByProjectId(projectId);
	}


}

