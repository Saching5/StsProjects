package com.suntech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suntech.model.Department;
import com.suntech.service.DepartmentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody() Department  department) {
		
	return departmentService.addDepartment(department);
	
	}
	@GetMapping("/department")
	public List<Department> getDepartments()
	{
		return departmentService.findAll();
	}
	
	@GetMapping("/department/{departmentid}")
	public Department getDepartment(@PathVariable() Integer departmentid)
	{
		return departmentService.find(departmentid);
	}
	
	@DeleteMapping("/department/{departmentid}")
	public Department deleteDepartment(@PathVariable() Integer departmentid)
	{
		return departmentService.deleteDepartment(departmentid);
	}
	
	@PutMapping("/Department/{departmentid}")
	public Department modifyDepartment(@RequestBody() Department  department, @PathVariable() Integer departmentid)
	{
		 department.setDepartmentid(departmentid);
		 return departmentService.editDepartment(department,departmentid);
		
	}
	
	}

	


