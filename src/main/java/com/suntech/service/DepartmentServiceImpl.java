package com.suntech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntech.model.Department;
import com.suntech.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department addDepartment(Department department) {

		departmentRepository.save(department);
		return department;
	}


	public Department editDepartment(Department Department, Integer departmentid) {

		departmentRepository.save(Department);
		return null;
	}


	public Department deleteDepartment(Integer departmentid) {
		Department department=departmentRepository.findById(departmentid).get();
		departmentRepository.delete(department);
		return department;
	}

	
	public Department find(Integer departmentid) {

		return departmentRepository.findById(departmentid).get(); 
	}

	
	public List<Department> findAll() {

		return (List<Department>) departmentRepository.findAll();
	}

}
