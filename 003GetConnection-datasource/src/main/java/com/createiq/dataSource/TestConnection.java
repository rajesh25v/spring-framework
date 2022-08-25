package com.createiq.dataSource;

import java.beans.PropertyVetoException;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestConnection {

	
	public static void main(String[] args) throws PropertyVetoException {
		
				BasicDataSource basicDataSource=new BasicDataSource();
		
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/tutorials");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("9963");
		
		try {
			System.out.println(basicDataSource.getConnection());
			basicDataSource.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
		System.out.println("---2----c3po--------------");
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		
		cpds.setDriverClass("com.mysql.jdbc.Driver");
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/tutorials");
		cpds.setUser("root");
		cpds.setPassword("9963");
	
		try {
			System.out.println(cpds.getConnection());
			cpds.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("---------------3------------");
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/tutorials");
		dataSource.setUsername("root");
		dataSource.setPassword("9963");
		
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
