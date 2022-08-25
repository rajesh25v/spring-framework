package com.createiq.dataSource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConnectionWithSpring {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("spring.xml");
		
		DataSource dataSourceDbcp=(DataSource) applicationContext1.getBean("dbcpDS");
		
		try {
			System.out.println(dataSourceDbcp.getConnection());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	//	DataSource d3po=(DataSource) applicationContext.getBean("d3cpDS");
//		try {
//			System.out.println(d3po.getConnection());
//		} catch (SQLException e1) {
//			
//			e1.printStackTrace();
//		}
		
	
	}

}
