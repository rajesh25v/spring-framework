package com.createiq.dao;

import com.createiq.model.Employee;
import com.createiq.template.CreateIqTemplate;

public class EmployeeDAOImpl implements EmployeeDAO {

	private CreateIqTemplate createIqTemplate;

	public void setCreateIqTemplate(CreateIqTemplate createIqTemplate) {
		this.createIqTemplate = createIqTemplate;
	}

	public void add(Employee employee) {
		createIqTemplate.excuteUpdate("INSERT INTO EMP009 VALUES(?,?)",
				new Object[] { employee.getEid(), employee.getEname() });
	}

	public void update(Employee employee) {

		createIqTemplate.excuteUpdate("UPDATE EMP009 SET ENAME = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEid() });

	}

	public void deleteById(Integer eid) {

		createIqTemplate.excuteUpdate("DELET FROM EMP009 WHERE EID = ?", new Object[] { eid });
	}

}
