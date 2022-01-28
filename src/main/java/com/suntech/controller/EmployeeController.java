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

import com.suntech.model.Employee;
import com.suntech.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody() Employee employee) {
		
	return employeeService.addEmployee(employee);
	
	}
	@GetMapping("/employee")
	public List<Employee> getEmployees()
	{
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{employeeid}")
	public Employee getEmployee(@PathVariable() Integer employeeid)
	{
		return employeeService.find(employeeid);
	}
	
	@DeleteMapping("/employee/{employeeid}")
	public Employee deleteEmployee(@PathVariable() Integer employeeid)
	{
		return employeeService.deleteEmployee(employeeid);
	}
	
	@PutMapping("/Employee/{Employeeid}")
	public Employee modifyEmployee(@RequestBody() Employee  employee, @PathVariable() Integer employeeid)
	{
		 employee.setemployeeid(employeeid);
		 return employeeService.editEmployee(employee,employeeid);
		
	}
	
	}

	


