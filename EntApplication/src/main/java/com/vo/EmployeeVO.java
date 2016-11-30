package com.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVO {

	@XmlElement
	private int id;
	@XmlElement
	private String name;
	@XmlElement
	private String dept;
	@XmlElement
	private String isActive;
	@XmlElement
	private String address;
	@XmlElement
	private String empType;
	@XmlElement
	private long sal;
	@XmlElement
	private String joinDate;
	@XmlElement
	private String releveDate;
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getDept() {
		return dept;
	}
	public final void setDept(String dept) {
		this.dept = dept;
	}
	public final String getIsActive() {
		return isActive;
	}
	public final void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public final String getEmpType() {
		return empType;
	}
	public final void setEmpType(String empType) {
		this.empType = empType;
	}
	public final long getSal() {
		return sal;
	}
	public final void setSal(long sal) {
		this.sal = sal;
	}
	public final String getJoinDate() {
		return joinDate;
	}
	public final void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public final String getReleveDate() {
		return releveDate;
	}
	public final void setReleveDate(String releveDate) {
		this.releveDate = releveDate;
	}
	
	
}
