package com.getmoney.web.serviceimpls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.mappers.CustomerMapper;
import com.getmoney.web.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired CustomerMapper customerMapper;

	@Override
	public CustomerDTO login(CustomerDTO param) {
		
	return null;
	}

	@Override
	public boolean join(CustomerDTO param) {
		return true;
	}

	@Override
	public int countCustomers() {
		return customerMapper.countCustomers();
	}

}
