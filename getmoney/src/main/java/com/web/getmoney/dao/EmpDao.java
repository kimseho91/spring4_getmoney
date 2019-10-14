package com.web.getmoney.dao;

import org.springframework.stereotype.Repository;
import com.web.getmoney.domains.EmpDTO;

@Repository
public interface EmpDao {
	
	public boolean insertEmpBean(EmpDTO param);
	
	public EmpDTO selectbyLoginData(EmpDTO param);
	
	
}
