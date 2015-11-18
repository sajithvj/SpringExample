package com.exp.lifeline.service;

import java.util.List;

import javax.jws.WebService;

import com.exp.lifeline.entity.Employee;

@WebService
public interface LoginService {
	
	public List<Employee> searchEmployee(int employeeCode);
	
}
