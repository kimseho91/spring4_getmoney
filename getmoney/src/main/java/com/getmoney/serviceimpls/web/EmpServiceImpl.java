package com.getmoney.serviceimpls.web;


import com.getmoney.domains.web.EmpBean;
import com.getmoney.services.web.EmpService;


public class EmpServiceImpl implements EmpService {
	private static EmpServiceImpl instance = new EmpServiceImpl();
	public static EmpServiceImpl getInstance() {return instance;}
	private EmpServiceImpl() {}
	
	

	@Override
	public EmpBean login(EmpBean param) {
		
	return null;
	}

	@Override
	public boolean join(EmpBean param) {
		System.out.println("서비스 도착");
		return true;
	}

}
