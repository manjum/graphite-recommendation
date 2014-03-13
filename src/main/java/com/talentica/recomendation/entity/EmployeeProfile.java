package com.talentica.recomendation.entity;
import com.talentica.graphite.api.index.ClassNode;
import com.talentica.graphite.api.index.ObjectNode;
import com.talentica.graphite.api.index.PropertyNode;


@ClassNode
public class EmployeeProfile extends ObjectNode{

	@PropertyNode(rank=1)
	private String department;

	@PropertyNode(rank=2)
	private String team;

	@PropertyNode(rank=3)
	private String college;

	@PropertyNode(rank=4)
	private String hometown;

	@PropertyNode(rank=5)
	private String technicalInterest;


	@PropertyNode(rank=6)
	private String personlInterest;

	public EmployeeProfile(String name) {
		super(name);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getTechnicalInterest() {
		return technicalInterest;
	}

	public void setTechnicalInterest(String technicalInterest) {
		this.technicalInterest = technicalInterest;
	}

	public String getPersonlInterest() {
		return personlInterest;
	}

	public void setPersonlInterest(String personlInterest) {
		this.personlInterest = personlInterest;
	}
}
