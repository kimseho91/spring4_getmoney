package com.getmoney.web.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.getmoney.web.domains.CustomerDTO;
import com.getmoney.web.serviceimpls.CustomerServiceImpl;

@Controller
@RequestMapping("/customer/*")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired Map<String , Object> map;
	@Autowired CustomerDTO cus;
	@Autowired CustomerServiceImpl customerService;

	@PostMapping("/join")
	public @ResponseBody  Map<?,?> join(@RequestBody CustomerDTO param) {
		logger.info("AJAX가 보낸 아이디와 비번{}",param.getMid() +", "+param.getMpw()+", "+param.getMname());
		cus.setMid(param.getMid());
		cus.setMpw(param.getMpw());
		cus.setMname(param.getMname());
		customerService.join(cus);
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("mid", param.getMid());
		map2.put("mpw", param.getMpw());
		map2.put("mname", param.getMname());
		map2.put("email", param.getEmail());
		map2.put("phonenum", param.getPhonenum());
		map2.put("birth", param.getBirth());
		map2.put("tooja", param.getTooja());
		map2.put("registerDate", param.getRegister_date());
		map2.put("tier", param.getTier());
		logger.info("map2에 담긴 사용자 정보 {}",param.toString());
		return map2;
	}
	@PostMapping("/login")
	public @ResponseBody CustomerDTO login(@RequestBody CustomerDTO param){
		logger.info("로그인 AJAX가 보낸 아이디와 비번{}",param.getMid() +", "+param.getMpw());
		cus.setMid(param.getMid());
		cus.setMpw(param.getMpw());
		logger.info("바티스 가기전 cus에 담긴 사용자 정보 : {}",cus.getMid()+", "+cus.getMpw());
		cus = customerService.login(cus);
		logger.info("바티스 후 cus에 담긴 사용자 정보 : {}",cus.toString());
		return cus;
	}
}
