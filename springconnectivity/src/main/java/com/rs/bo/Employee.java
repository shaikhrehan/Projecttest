package com.rs.bo;

public class Employee {
	private int empNo;
	private String name, job, salary;
	
	
	public Employee(int empNo, String name, String job, String salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
