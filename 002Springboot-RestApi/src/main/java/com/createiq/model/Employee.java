package com.createiq.model;

import org.springframework.data.annotation.Id;

public class Employee {

	@Id
	int eid;
	
	String ename;
	double sal;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + eid + ", name=" + ename + ", sal=" + sal + "]";
	}

	public int getId() {
		return eid;
	}

	public void setId(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return ename;
	}

	public void setName(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
