package com.createiq.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.createiq.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP009 VALUES(?,?)",
				new Object[] { employee.getEid(), employee.getEname() });
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP009 SET ENAME = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEid() });

	}

	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELET FROM EMP009 WHERE EID = ?", new Object[] { eid });
	}

}
