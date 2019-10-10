package com.web.bran.command;

import javax.servlet.http.HttpServletRequest;

import com.web.bran.domains.EmpBean;
import com.web.bran.serviceimpls.EmpServiceImpl;

public class CreateCommand extends Command{
	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain(domain);
		execute();
	}
	@Override
	public void execute() {
		System.out.println("createcommand");
		EmpBean param = new EmpBean();
		param.setEmpno(request.getParameter("empno"));
		param.setEname(request.getParameter("ename"));
		param.setJob(request.getParameter("job"));
		param.setMgr(request.getParameter("mgr"));
		param.setHiredate(request.getParameter("hiredate"));
		param.setSal(request.getParameter("sal"));
		param.setComm(request.getParameter("comm"));
		param.setDeptno(request.getParameter("deptno"));
		if(EmpServiceImpl.getInstance().join(param)) {
//			EmpServiceImpl.getInstance().join(param);
			System.out.println("회원가입 성공");
			super.execute();
		}else{
			System.out.println("가입실패");
		};
	}
	
}
