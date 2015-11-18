package com.exp.lifeline.dao;

import java.util.List;

import com.exp.lifeline.entity.Employee;


public interface LoginDAO {
	
	public List<Employee> searchEmployee(int employeeCode);
	
}
