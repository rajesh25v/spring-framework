package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.Dao.Employee;
import com.createiq.Dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired(required = false)
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
	public void deleteById(Integer id) {
		employeeDao.deleteById(id);
		
	}

	@Override
	public List<Employee> findAll() {
		employeeDao.findAll();
		return null;
	}

}
