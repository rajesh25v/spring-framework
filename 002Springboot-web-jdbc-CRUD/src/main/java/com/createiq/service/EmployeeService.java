package com.createiq.service;

import java.util.List;

import com.createiq.Dao.Employee;

public interface EmployeeService {
	
public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer id);
	
	public List<Employee>   findAll();
	

}
