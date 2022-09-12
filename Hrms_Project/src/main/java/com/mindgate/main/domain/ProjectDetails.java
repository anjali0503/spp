package com.mindgate.main.domain;

import java.util.Objects;

public class ProjectDetails {

	private String projectId;
	private String projectName;
	private int projectCost;

	public ProjectDetails() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDetails(String projectId, String projectName, int projectCost) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(int projectCost) {
		this.projectCost = projectCost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectCost, projectId, projectName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectDetails other = (ProjectDetails) obj;
		return projectCost == other.projectCost && Objects.equals(projectId, other.projectId)
				&& Objects.equals(projectName, other.projectName);
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", projectCost="
				+ projectCost + "]";
	}

}
