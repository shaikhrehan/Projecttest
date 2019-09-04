package com.rs.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rs.dto.EmployeeDTO;


@Component
public interface EmpService {
	public int findEmpCount();

	public List<EmployeeDTO> findEmployeeByDesg(String desg);

}
