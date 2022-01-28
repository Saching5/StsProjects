package com.suntech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	private Integer employeeid;
	@Column(name="employeename")
	private String employeename;
	
	@ManyToOne
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee() {
		
	}

	public Employee(String employeename) {
		
		this.employeename = employeename;
	}

	public Integer getemployeeid() {
		return employeeid;
	}

	public void setemployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getemployeename() {
		return employeename;
	}

	public void setemployeename(String employeename) {
		this.employeename = employeename;
	}

	@Override
	public String toString() {
		return "employee [employeeid=" + employeeid + ", employeename=" + employeename + "]";
	}

	
}
