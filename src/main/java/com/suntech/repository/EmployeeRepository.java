package com.suntech.repository;

import org.springframework.data.repository.CrudRepository;

import com.suntech.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
