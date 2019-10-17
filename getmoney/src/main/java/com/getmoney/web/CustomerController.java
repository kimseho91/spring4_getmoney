package com.getmoney.web;

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
	@Autowired CustomerServiceImpl customerService;
	
	@GetMapping("/count")
	public String count(Model model) {
		int count = customerService.countCustomers();
		model.addAttribute("count",count);
		return "home";
	}
	
	@GetMapping("/info")
	public String findCustomerId(@RequestParam("mid") String mid,
			@RequestParam("mpw") String mpw) {
		return "index";
		// test
	}
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody CustomerDTO customer) {
		logger.info("AJAX가 보낸 아이디 와 비번 {}",customer.getMid()+", "+customer.getMpw());
		HashMap<String,String> map = new HashMap<>();
		map.put("mid", customer.getMid());
		map.put("mpw", customer.getMpw());
		logger.info("map에 담긴 아이디 와 비번 {}",map.get("mid")+", "+map.get("mpw"));
		return map;
	}
}
