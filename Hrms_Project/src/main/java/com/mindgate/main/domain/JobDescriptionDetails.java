package com.mindgate.main.domain;

import java.util.Objects;

public class JobDescriptionDetails {
	private int jobId;

	private String skill1;

	private String skill2;
	private String skill3;
	private String jobStatus;
	private int RequiredCandidate;
	private EmployeeDetails employeeDetails;
	private ProjectDetails projectDetails;

	public JobDescriptionDetails() {
		// TODO Auto-generated constructor stub
	}

	public JobDescriptionDetails(int jobId, String skill1, String skill2, String skill3, String jobStatus,
			int requiredCandidate, EmployeeDetails employeeDetails, ProjectDetails projectDetails) {
		super();
		this.jobId = jobId;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.jobStatus = jobStatus;
		RequiredCandidate = requiredCandidate;
		this.employeeDetails = employeeDetails;
		this.projectDetails = projectDetails;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public int getRequiredCandidate() {
		return RequiredCandidate;
	}

	public void setRequiredCandidate(int requiredCandidate) {
		RequiredCandidate = requiredCandidate;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	@Override
	public int hashCode() {
		return Objects.hash(RequiredCandidate, employeeDetails, jobId, jobStatus, projectDetails, skill1, skill2,
				skill3);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobDescriptionDetails other = (JobDescriptionDetails) obj;
		return RequiredCandidate == other.RequiredCandidate && Objects.equals(employeeDetails, other.employeeDetails)
				&& jobId == other.jobId && Objects.equals(jobStatus, other.jobStatus)
				&& Objects.equals(projectDetails, other.projectDetails) && Objects.equals(skill1, other.skill1)
				&& Objects.equals(skill2, other.skill2) && Objects.equals(skill3, other.skill3);
	}

	@Override
	public String toString() {
		return "JobDescriptionDetails [jobId=" + jobId + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3="
				+ skill3 + ", jobStatus=" + jobStatus + ", RequiredCandidate=" + RequiredCandidate
				+ ", employeeDetails=" + employeeDetails + ", projectDetails=" + projectDetails + "]";
	}
	

}
