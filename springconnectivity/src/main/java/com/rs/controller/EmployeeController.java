package com.rs.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rs.bo.EmployeeBO;
import com.rs.dto.EmployeeDTO;

@RestController
public class EmployeeController 
{
	@RequestMapping("/welcome")
	public String welcomeEmployee()
	{
		return "Hello Employee";
	}
	
	@RequestMapping("/Employee")
	public List<EmployeeDTO> getAllEmployees()
	{
		return (Arrays.asList(
				 new Employee(1,"Rehan","Manager","20000"),
				 new Employee(2,"Aqib","Clerk","10000"),
				 new Employee(3,"Billal","Assistant","8000")));
	}

}
