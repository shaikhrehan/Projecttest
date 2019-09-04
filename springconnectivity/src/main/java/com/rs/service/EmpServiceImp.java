package com.rs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rs.bo.EmployeeBO;
import com.rs.dao.EmpDAO;
import com.rs.dto.EmployeeDTO;

@Service(value="empService")
public class EmpServiceImp implements EmpService
{
	@Autowired
	private EmpDAO dao;
	
	@Override
	public int findEmpCount()
	{
		int count=0;
		count=dao.getEmpCount();
		return count;
	}
	@Override
	public List<EmployeeDTO> findEmployeeByDesg(String desg)
	{
		List<EmployeeDTO>listDTO=null;
		List<EmployeeBO> listBO=null;
		EmployeeDTO dto=null;
		
		listBO=dao.getEmployeeDetailsByDesg(desg);
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO)
		{
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
			
		}
		return listDTO;
	}

}
