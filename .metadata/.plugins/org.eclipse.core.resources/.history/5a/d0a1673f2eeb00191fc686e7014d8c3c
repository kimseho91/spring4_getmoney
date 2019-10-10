package com.web.bran.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	
	public static Command cmd = new Command();
    public static void init(HttpServletRequest request) {
    	System.out.println("Receiver 도착");
        cmd = Commander.direct(request);
    }

}
