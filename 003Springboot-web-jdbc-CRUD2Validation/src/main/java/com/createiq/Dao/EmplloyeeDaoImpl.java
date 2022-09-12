package com.createiq.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmplloyeeDaoImpl implements EmployeeDao{

	@Autowired(required = false)
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP004 VALUES(?,?,?)",new Object[] { employee.getId(),employee.getName(),employee.getSal()});
		
	}

	@Override
	public void update(Employee employee) {
	
		
	}

	@Override
	public void deleteById(Integer id) {
	
		
	}

	@Override
	public List<Employee> findAll() {
	
		return jdbcTemplate.query("SELECT*FROM EMP004", new BeanPropertyRowMapper(Employee.class));
	
	}

}
