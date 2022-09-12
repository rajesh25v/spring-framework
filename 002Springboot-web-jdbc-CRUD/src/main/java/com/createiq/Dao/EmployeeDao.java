package com.createiq.Dao;

import java.util.List;

public interface EmployeeDao {
	
	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer id);
	
	public List<Employee>   findAll();
	

}
