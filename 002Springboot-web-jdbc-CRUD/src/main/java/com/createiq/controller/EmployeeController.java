package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.Dao.Employee;
import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpl;

@Controller("employeeController")
public class EmployeeController {

	@Autowired(required = false)
	private EmployeeService employeeservice;

	@RequestMapping("/all")
	public ModelAndView allemp() {
		List<Employee> employee = employeeservice.findAll();
		return new ModelAndView("all", "employee", employee);

	}
	@RequestMapping("/addEmp")
	public String showAdd() {
		return "addEmp";
		
	}

}
