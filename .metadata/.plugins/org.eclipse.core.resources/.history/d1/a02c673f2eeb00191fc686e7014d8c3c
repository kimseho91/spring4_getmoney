package com.web.bran.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bran.domains.EmpBean;
import com.web.bran.serviceimpls.EmpServiceImpl;

public class LoginCommand extends Command{
	 public LoginCommand(HttpServletRequest request) {
		 System.out.println("logincommand 도착");
	        setRequest(request);
	        setDomain(request.getServletPath()
	                .substring(1,request.getServletPath().indexOf(".")));
//	        setFolder(request.getParameter("folder"));
	        setAction(request.getParameter("action"));
	        execute();
	    }
	    @Override
	    public void execute() {
	        String empno = request.getParameter("empno");
	        String ename = request.getParameter("ename");
	        String deptno = request.getParameter("deptno");
	        EmpBean e = new EmpBean();
	        e.setEmpno(request.getParameter("empno"));
	        e.setEname(request.getParameter("ename"));
	        e.setDeptno(request.getParameter("deptno"));
	        e = EmpServiceImpl.getInstance().login(e);
	        System.out.println("login = " +e);
	        String a = (e.getEmpno()==null) ? "login" : request.getParameter("page");
//	        String b = (e.getEmpno()==null) ? "facade" : request.getParameter("domain");
	        request.setAttribute("page", a);
//	        request.setAttribute("domain",b);
	        request.setAttribute("facade", e);
	        super.execute();
	    }

}
