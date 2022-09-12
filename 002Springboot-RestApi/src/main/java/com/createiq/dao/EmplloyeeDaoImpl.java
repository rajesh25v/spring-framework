package com.createiq.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

import ch.qos.logback.core.subst.Token.Type;

@Repository
public class EmplloyeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP004 VALUES(?,?,?)",new Object[] { employee.getId(),employee.getName(),employee.getSal()});
		
	}

	@Override
	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP004 SET ENAME=?,SAL=? WHERE EID=?",new Object[] { employee.getName(),employee.getSal(),employee.getId()});
		
		
	}

	@Override
	public void deleteById(Integer id) {
		jdbcTemplate.update("DELETE FROM EMP004 WHERE EID=? ",new Object[] {id});
		
		
	}

	@Override
	public List<Employee> findAll() {
	
		return jdbcTemplate.query("SELECT*FROM EMP004", new BeanPropertyRowMapper(Employee.class));
	
	}

	@Override
	public Employee findById(Integer eid) {
		System.out.println("dao emp id :------------------- "+eid);
		//new int[]{Types.INTEGER}, Employee.class ( it used for single retun value.
		return (Employee) jdbcTemplate.queryForObject("select*from emp004 where Eid=?",new Object[] {eid},new int[] {Types.INTEGER} ,new BeanPropertyRowMapper(Employee.class));
	}

}
