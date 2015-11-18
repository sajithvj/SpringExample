package com.exp.lifeline.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "lfl_test")
public class Employee implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "lfl_test_id")
	private Integer testId;
	
	@Column(name = "lfl_test_name")
	private String testName;

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	

	/*@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ",empName=" + empName + ",empCode=" + empCode + ",empEmail=" + empEmail + ",empPassword=" + empPassword + ",empDesignation=" + empDesignation + ",empContact=" + empContact + ",empRole=" + empRole + ",joiningDate=" + joiningDate + ",standardDate=" + standardDate + ",trainingPeriod=" + trainingPeriod + ",resetStatus=" + resetStatus + "]";
	}
*/}