package com.web.getmoney.dao;

import com.web.getmoney.domains.EmpBean;

public interface EmpDao {
	
	public boolean insertEmpBean(EmpBean param);
	
	public EmpBean selectbyLoginData(EmpBean param);
	
	
}
