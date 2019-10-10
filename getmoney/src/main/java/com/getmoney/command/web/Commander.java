package com.getmoney.command.web;

import javax.servlet.http.HttpServletRequest;

import com.getmoney.enums.web.Action;

public class Commander {
	  public static Command direct(HttpServletRequest request) {
	      System.out.println("commander 도착");  
		  
		    Command cmd = null;
	        System.out.println("commander : "+request.getParameter("action"));
	        switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
	        
	        case LOGIN : cmd = null; break;
	        case CREATE : cmd = null; break;
	        case MOVE : cmd = null; break;
	        }
	        return cmd;
	    }

}
