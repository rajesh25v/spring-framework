package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.controller.EmployeeNotFound;
import com.createiq.dao.EmployeeDao;
import com.createiq.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void add(Employee employee) {
		employeeDao.add(employee);

	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);

	}

	@Override
	public void deleteById(Integer eid) {
		employeeDao.deleteById(eid);

	}

	@Override
	public List<Employee> findAll() {

		return employeeDao.findAll();

	}

	@Override
	public Employee findById(Integer eid) {
		System.out.println(employeeDao.findById(eid));
		
		if(employeeDao.findById(eid) != null) {
			return employeeDao.findById(eid);
	}
}