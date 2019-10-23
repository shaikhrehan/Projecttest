package com.rs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.rs.bo.EmployeeBO;

@Component
public class EmpDAOImp implements EmpDAO {
	
	
	 private static final String GET_EMP_COUNT = "SELECT COUNT(*)FROM EMP";
	 private static final String GET_EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB=:desg";
	
	@Autowired
	private NamedParameterJdbcTemplate njt;

	public int getEmpCount() {
		int count = 0;
		count = (int)njt.queryForObject(GET_EMP_COUNT,new HashMap(),Integer.class);
		return count;
	}

	public List<EmployeeBO> getEmployeeDetailsByDesg(String desg) {
	
		List<EmployeeBO> listBO = null;
		Map<String,Object>paramMap=null;
		paramMap=new HashMap();
		paramMap.put("desg",desg);
		listBO = new ArrayList<EmployeeBO>();
		njt.query(GET_EMP_DETAILS_BY_DESG, paramMap,new EmpRowCallbackHandler(listBO));
		return listBO;
		
		

	}

	private static class EmpRowCallbackHandler implements RowCallbackHandler {
		private List<EmployeeBO> listBO = null;

		public EmpRowCallbackHandler(List<EmployeeBO> listBO) {
			this.listBO = listBO;

		}

		@Override
		public void processRow(ResultSet rs) throws SQLException {
			System.out.println("ProcessRow(-)");
			EmployeeBO bo = null;
			bo = new EmployeeBO();
			bo.setEmpno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			listBO.add(bo);
		}
		
	}

}
