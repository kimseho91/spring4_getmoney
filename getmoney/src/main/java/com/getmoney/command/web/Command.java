package com.getmoney.command.web;

import javax.servlet.http.HttpServletRequest;

import com.getmoney.pool.web.Constants;

import lombok.Data;

@Data
	public class Command implements Order{
	
	    protected String action, domain, folder, page, view;
	    protected HttpServletRequest request;
	    @Override
	    public void execute() {
	    	System.out.println("command 도착");
	        this.view = String.format(Constants.DOUBLE_PATH,"facade",
	               "main");
	        System.out.println(this.view);

}
}