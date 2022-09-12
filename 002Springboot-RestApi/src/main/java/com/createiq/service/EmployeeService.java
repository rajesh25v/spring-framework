package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {

public void add(Employee employee);

	public void update(Employee employee);

	public void deleteById(Integer eid);

	public List<Employee> findAll();

	public Employee findById(Integer eid);

}
