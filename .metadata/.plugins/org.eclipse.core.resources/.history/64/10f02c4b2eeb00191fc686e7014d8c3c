package com.web.bran.command;

import javax.servlet.http.HttpServletRequest;
import com.web.bran.enums.Action;

public class Commander {
	  public static Command direct(HttpServletRequest request) {
	      System.out.println("commander 도착");  
		  
		    Command cmd = null;
	        System.out.println("commander : "+request.getParameter("action"));
	        switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
	        
	        case LOGIN : cmd = new LoginCommand(request); break;
	        case CREATE : cmd = new CreateCommand(request); break;
	        case MOVE : cmd = new MoveCommand(request); break;
	        }
	        return cmd;
	    }

}
