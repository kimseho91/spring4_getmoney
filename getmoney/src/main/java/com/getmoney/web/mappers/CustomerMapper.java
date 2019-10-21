package com.getmoney.web.mappers;

import org.springframework.stereotype.Repository;
import com.getmoney.web.domains.CustomerDTO;

@Repository
public interface CustomerMapper {
	
	public void insertCusDTO(CustomerDTO param);
	public CustomerDTO selectbyLoginData(CustomerDTO param);
	
}
