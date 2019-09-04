package com.rs.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface EmpDAO 
{
	public int getEmpCount();
	public <EmployeeBo> List<EmployeeBo> getEmployeeDetailsByDesg(String desg); 

}
