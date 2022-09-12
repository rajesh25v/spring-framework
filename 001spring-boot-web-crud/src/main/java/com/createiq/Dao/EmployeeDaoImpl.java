package com.createiq.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Employee employee) {
	jdbcTemplate.update("insert into emp001 values(?,?,?)",new Object[] {employee.getEid(),employee.getEname(),employee.getEsal()}); 
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll() {
	jdbcTemplate.query("select*from emp001",new BeanPropertyRowMapper(Employee.class));
		return null;
	}

}
