package com.createiq.dao;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeDao {
	
	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);
	
	public List<Employee>   findAll();

	public Employee findById(Integer eid);
	

}
