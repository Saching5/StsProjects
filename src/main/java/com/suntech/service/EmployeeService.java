package com.suntech.service;

import java.util.List;

import com.suntech.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee editEmployee(Employee Employee,Integer employeeid);
	public Employee deleteEmployee(Integer employeeid);
	public Employee find(Integer employeeid);
	public List<Employee> findAll();
	
}
