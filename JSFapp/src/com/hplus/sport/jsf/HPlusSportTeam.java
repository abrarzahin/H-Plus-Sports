package com.hplus.sport.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="team",eager= true)
@SessionScoped
public class HPlusSportTeam {
	
	private Employee employee;
	private List<Employee> employeeList= new ArrayList<Employee>();
	
	
	public HPlusSportTeam() {
		
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

}
