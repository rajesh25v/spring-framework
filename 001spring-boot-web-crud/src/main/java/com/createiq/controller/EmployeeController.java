package com.createiq.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RequestMapping("/")
public class EmployeeController {
	
//	@RequestMapping("allEmp")
//	public ModelAndView showAll() {
//		
//		List<Employee> emp=EmployeeService.findAll();
//		return new ModelAndView("allEmp","employees",emp);
//	}
	
	@RequestMapping(value = "saveEmp", method = RequestMethod.POST)
	public String saveEmp(Employee employee) {
		return null;
		
	}
	
	@RequestMapping("addEmp")
	public String showAddEmp() {
		return "addEmp";
	}


}
