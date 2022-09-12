package com.mindgate.main.domain;

import java.util.Objects;

public class InterviewerDetails {

	private int interviewId;
	private int applicantId;
	private int employeeId; 
	private String status; 
	private int round1;
	private int round2;
	private int round3;
	
	public InterviewerDetails() {
		// TODO Auto-generated constructor stub
	}

	public InterviewerDetails(int interviewId, int applicantId, int employeeId, String status, int round1, int round2,
			int round3) {
		super();
		this.interviewId = interviewId;
		this.applicantId = applicantId;
		this.employeeId = employeeId;
		this.status = status;
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRound1() {
		return round1;
	}

	public void setRound1(int round1) {
		this.round1 = round1;
	}

	public int getRound2() {
		return round2;
	}

	public void setRound2(int round2) {
		this.round2 = round2;
	}

	public int getRound3() {
		return round3;
	}

	public void setRound3(int round3) {
		this.round3 = round3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantId, employeeId, interviewId, round1, round2, round3, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewerDetails other = (InterviewerDetails) obj;
		return applicantId == other.applicantId && employeeId == other.employeeId && interviewId == other.interviewId
				&& round1 == other.round1 && round2 == other.round2 && round3 == other.round3
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "InterviewerDetails [interviewId=" + interviewId + ", applicantId=" + applicantId + ", employeeId="
				+ employeeId + ", status=" + status + ", round1=" + round1 + ", round2=" + round2 + ", round3=" + round3
				+ "]";
	}
	
}
