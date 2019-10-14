package com.web.getmoney.serviceimpls;


import org.springframework.stereotype.Service;

import com.web.getmoney.domains.EmpDTO;
import com.web.getmoney.services.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	private static EmpServiceImpl instance = new EmpServiceImpl();
	public static EmpServiceImpl getInstance() {return instance;}
	private EmpServiceImpl() {}

	@Override
	public EmpDTO login(EmpDTO param) {
		
	return null;
	}

	@Override
	public boolean join(EmpDTO param) {
		System.out.println("서비스 도착");
		return true;
	}

}
