package com.exp.lifeline.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.exp.lifeline.dao.LoginDAO;
import com.exp.lifeline.entity.Employee;

public class LoginHibernateDAO extends HibernateDaoSupport implements LoginDAO 
{
	@SuppressWarnings("unchecked")
	public List<Employee> searchEmployee(int employeeCode) 
	{

		try 
		{
			List<Employee> empDetails = getHibernateTemplate().find("from Employee where testId = ?", employeeCode);
			return empDetails;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
		
}
