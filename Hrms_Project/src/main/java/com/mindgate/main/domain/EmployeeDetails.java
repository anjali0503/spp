package com.mindgate.main.domain;

import java.util.Objects;

public class EmployeeDetails {

	private int EmployeeId;
	private String Ename;
	private int Salary;
	private ProjectDetails projectDetails;
	private String Designation;
	private int LoginId;
	private int MGR;
	private String Skill1;
	private String Skill2;
	private String Skill3;
	private String Status;

	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String ename, int salary, ProjectDetails projectDetails, String designation,
			int loginId, int mGR, String skill1, String skill2, String skill3, String status) {
		super();
		EmployeeId = employeeId;
		Ename = ename;
		Salary = salary;
		this.projectDetails = projectDetails;
		Designation = designation;
		LoginId = loginId;
		MGR = mGR;
		Skill1 = skill1;
		Skill2 = skill2;
		Skill3 = skill3;
		Status = status;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public ProjectDetails getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(ProjectDetails projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int getLoginId() {
		return LoginId;
	}

	public void setLoginId(int loginId) {
		LoginId = loginId;
	}

	public int getMGR() {
		return MGR;
	}

	public void setMGR(int mGR) {
		MGR = mGR;
	}

	public String getSkill1() {
		return Skill1;
	}

	public void setSkill1(String skill1) {
		Skill1 = skill1;
	}

	public String getSkill2() {
		return Skill2;
	}

	public void setSkill2(String skill2) {
		Skill2 = skill2;
	}

	public String getSkill3() {
		return Skill3;
	}

	public void setSkill3(String skill3) {
		Skill3 = skill3;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Designation, EmployeeId, Ename, LoginId, MGR, Salary, Skill1, Skill2, Skill3, Status,
				projectDetails);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		return Objects.equals(Designation, other.Designation) && EmployeeId == other.EmployeeId
				&& Objects.equals(Ename, other.Ename) && LoginId == other.LoginId && MGR == other.MGR
				&& Salary == other.Salary && Objects.equals(Skill1, other.Skill1)
				&& Objects.equals(Skill2, other.Skill2) && Objects.equals(Skill3, other.Skill3)
				&& Objects.equals(Status, other.Status) && Objects.equals(projectDetails, other.projectDetails);
	}

	@Override
	public String toString() {
		return "EmployeeDetails [EmployeeId=" + EmployeeId + ", Ename=" + Ename + ", Salary=" + Salary
				+ ", projectDetails=" + projectDetails + ", Designation=" + Designation + ", LoginId=" + LoginId
				+ ", MGR=" + MGR + ", Skill1=" + Skill1 + ", Skill2=" + Skill2 + ", Skill3=" + Skill3 + ", Status="
				+ Status + "]";
	}
	
	
}
