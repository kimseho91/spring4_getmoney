package com.web.bran.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bran.command.Receiver;
import com.web.bran.command.Sender;
import com.web.bran.enums.Action;

@WebServlet("/emp.do")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("empcontroller 도착");
	
		
		Receiver.init(request);
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())){
			case CREATE : request.setAttribute("page", "login");
				break;
			default:break;
		}
		
		
		Sender.forward(request, response);
	}	
	

}
