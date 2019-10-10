package com.web.bran.serviceimpls;

import com.web.bran.daoimpls.EmpDaoImpl;
import com.web.bran.domains.EmpBean;
import com.web.bran.services.EmpService;


public class EmpServiceImpl implements EmpService {
	private static EmpServiceImpl instance = new EmpServiceImpl();
	public static EmpServiceImpl getInstance() {return instance;}
	private EmpServiceImpl() {}
	
	

	@Override
	public EmpBean login(EmpBean param) {
		
	return EmpDaoImpl.getInstance().selectbyLoginData(param);
	}

	@Override
	public boolean join(EmpBean param) {
		System.out.println("서비스 도착");
		return EmpDaoImpl.getInstance().insertEmpBean(param);
	}

}
