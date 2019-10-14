package com.getmoney.web.services;

import org.springframework.stereotype.Component;

import com.getmoney.web.domains.EmpDTO;

@Component
public interface EmpService  {
	
	public EmpDTO login(EmpDTO param);
	
	public boolean join(EmpDTO param);
	
	

}
