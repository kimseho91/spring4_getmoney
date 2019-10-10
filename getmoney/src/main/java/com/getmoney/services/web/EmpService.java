package com.getmoney.services.web;

import com.getmoney.domains.web.EmpBean;

public interface EmpService  {
	public EmpBean login(EmpBean param);
	
	public boolean join(EmpBean param);
	
	

}
