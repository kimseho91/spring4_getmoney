package scom.getmoney.dao.web;

import com.getmoney.domains.web.EmpBean;

public interface EmpDao {
	
	public boolean insertEmpBean(EmpBean param);
	
	public EmpBean selectbyLoginData(EmpBean param);
	
	
}
