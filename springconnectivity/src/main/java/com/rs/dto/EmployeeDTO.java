package com.rs.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable 
{
	private int empno;
	private String ename;
	private String job;
	private String salary;
	
	public EmployeeDTO() {}
	
	public EmployeeDTO(int empno, String ename, String job, String salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}
	public int getEmpno()
	{
		return empno;
	}
	public void setEmpno(int empno)
	{
		this.empno = empno;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	}
	public String getJob() 
	{
		return job;
	}
	public void setJob(String job) 
	{
		this.job = job;
	}
	public String  getSalary()
	{
		return salary;
	}
	public void setSalary(String salary) 
	{
		this.salary = salary;
	}
	
	

}
