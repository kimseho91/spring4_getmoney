package com.getmoney.web.mappers;

import org.springframework.stereotype.Repository;

import com.getmoney.web.domains.EmpDTO;

@Repository
public interface EmpMapper {
	
	public boolean insertEmpBean(EmpDTO param);
	
	public EmpDTO selectbyLoginData(EmpDTO param);
	
	
}
