package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);
	

	public List<Employee> findAll();

}
