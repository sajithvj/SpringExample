package com.exp.lifeline.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.exp.lifeline.dao.LoginDAO;
import com.exp.lifeline.entity.Employee;
import com.exp.lifeline.service.LoginService;

@WebService(endpointInterface = "com.exp.lifeline.service.LoginService")
public class LoginServiceImpl implements LoginService {

	private LoginDAO loginDAO;

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public List<Employee> searchEmployee(int employeeCode) {
		List<Employee> empDetails = loginDAO.searchEmployee(employeeCode);
		return empDetails;
	}

}
