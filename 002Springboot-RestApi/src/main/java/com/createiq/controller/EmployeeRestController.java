package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/findAll")
	public List<Employee> findAll() {

		return employeeservice.findAll();
	}

	@GetMapping("/findById/{eid}")
	public Employee findById(@PathVariable("eid") Integer eid) {

		return employeeservice.findById(eid);
	}

	@DeleteMapping("/delete/{eid}")
	public String delete(@PathVariable("eid") Integer eid) {

		employeeservice.deleteById(eid);
		return "deleted successfully id:  " + eid;
	}

	@PostMapping(value = "/add")
	public String save(@RequestBody Employee employee) {
		employeeservice.add(employee);
		return "record inserted success";

	}

	@PutMapping(value = "/update")
	public String update(@RequestBody Employee employee) {
		employeeservice.update(employee);
		return "record updated success";

	}

}
