package com.web.bran.daoimpls;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.web.bran.daos.EmpDao;
import com.web.bran.domains.EmpBean;
import com.web.bran.factory.DatabaseFactory;
import com.web.bran.pool.Constants;

public class EmpDaoImpl implements EmpDao {

	private static EmpDaoImpl instance = new EmpDaoImpl();
	public static EmpDaoImpl getInstance() {return instance;}
	private EmpDaoImpl() {}
	
		
	@Override
	public boolean insertEmpBean(EmpBean param) {
		boolean flag = false;
		System.out.println("dao 들어옴");
		String sql = "INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)\r\n" + 
				" VALUES(?,?,?,?,?,?,?,?)";
		System.out.println("!!! " +param.toString());
		
		try {
			System.out.println("adasd1 " +sql);
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getEmpno());
			stmt.setString(2, param.getEname());
			stmt.setString(3, param.getJob());
			stmt.setString(4, param.getMgr());
			stmt.setString(5, param.getHiredate());
			stmt.setString(6, param.getSal());
			stmt.setString(7, param.getComm());
			stmt.setString(8, param.getDeptno());
			int rs = stmt.executeUpdate();
			System.out.println("dao rs = "+rs);
		
			if(rs==1) {
				flag = true;
			};

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return flag;
	}
	

	@Override
	public EmpBean selectbyLoginData(EmpBean param) {
		EmpBean emp = null;
		String sql = "SELECT * FROM EMP \r\n " + 
				" WHERE DEPTNO LIKE ? AND ENAME LIKE ? AND EMPNO LIKE ? ";
		System.out.println("Daoimple"+ param.getDeptno());
		System.out.println("Daoimple"+ param.getEname());
		System.out.println("Daoimple"+ param.getEmpno());
		System.out.println("DAO"+sql);
		
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getDeptno());
			stmt.setString(2, param.getEname());
			stmt.setString(3, param.getEmpno());
			
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				emp = new EmpBean();
				
				emp.setComm(rs.getString("COMM"));
				emp.setDeptno(rs.getString("DEPTNO"));
				emp.setEmpno(rs.getString("EMPNO"));
				emp.setEname(rs.getString("ENAME"));
				emp.setHiredate(rs.getString("HIREDATE"));
				emp.setJob(rs.getString("JOB"));
				emp.setMgr(rs.getString("MGR"));
				emp.setSal(rs.getString("SAL"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return emp;
	}
	

}
