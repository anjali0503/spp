package com.mindgate.main.domain;

import java.util.Objects;

public class ApplicantDetails {
	
	private int applicantId;
	private String applicantName;
	private String qualification;
	private String skill1;
	private String skill2;
	private String skill3;
	private int contact;
	private int documentId;
	private int jobId;
	
	public ApplicantDetails() {
		// TODO Auto-generated constructor stub
	}

	public ApplicantDetails(int applicantId, String applicantName, String qualification, String skill1, String skill2,
			String skill3, int contact, int documentId, int jobId) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.qualification = qualification;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
		this.contact = contact;
		this.documentId = documentId;
		this.jobId = jobId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantId, applicantName, contact, documentId, jobId, qualification, skill1, skill2,
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
		ApplicantDetails other = (ApplicantDetails) obj;
		return applicantId == other.applicantId && Objects.equals(applicantName, other.applicantName)
				&& contact == other.contact && documentId == other.documentId && jobId == other.jobId
				&& Objects.equals(qualification, other.qualification) && Objects.equals(skill1, other.skill1)
				&& Objects.equals(skill2, other.skill2) && Objects.equals(skill3, other.skill3);
	}

	@Override
	public String toString() {
		return "ApplicantDetails [applicantId=" + applicantId + ", applicantName=" + applicantName + ", qualification="
				+ qualification + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3=" + skill3 + ", contact="
				+ contact + ", documentId=" + documentId + ", jobId=" + jobId + "]";
	}
	
	
	

}
