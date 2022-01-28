package com.suntech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntech.model.Department;
import com.suntech.model.Employee;
import com.suntech.repository.DepartmentRepository;
import com.suntech.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;


	public Employee addEmployee(Employee employee) {

		employeeRepository.save(employee);
		Department department=departmentRepository.findById(employee.getDepartment().getDepartmentid()).get();
		employee.setDepartment(department);
		return employee;
	}


	public Employee editEmployee(Employee Employee, Integer employeeid) {

		employeeRepository.save(Employee);
		return null;
	}


	public Employee deleteEmployee(Integer employeeid) {
		Employee employee=employeeRepository.findById(employeeid).get();
		employeeRepository.delete(employee);
		return employee;
	}

	
	public Employee find(Integer employeeid) {

		return employeeRepository.findById(employeeid).get(); 
	}

	
	public List<Employee> findAll() {

		return (List<Employee>) employeeRepository.findAll();
	}

}
