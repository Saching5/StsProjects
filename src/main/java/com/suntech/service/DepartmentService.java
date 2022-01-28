package com.suntech.service;

import java.util.List;

import com.suntech.model.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department department);
	public Department editDepartment(Department department,Integer departmentid);
	public Department deleteDepartment(Integer departmentid);
	public Department find(Integer departmentid);
	public List<Department> findAll();
	
}
