package com.getmoney.web.services;

import org.springframework.stereotype.Component;

import com.getmoney.web.domains.CustomerDTO;

@Component
public interface CustomerService  {
	
	public CustomerDTO login(CustomerDTO param);
	
	public boolean join(CustomerDTO param);
	
	public int countCustomers();
	

}
