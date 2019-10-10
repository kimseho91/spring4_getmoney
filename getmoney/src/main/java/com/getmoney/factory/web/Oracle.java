package com.getmoney.factory.web;

import java.sql.Connection;
import java.sql.DriverManager;

import com.getmoney.enums.web.DBDriver;
import com.getmoney.enums.web.DBUrl;
import com.getmoney.pool.web.Constants;

public class Oracle implements Database {

	@Override
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString()
											   ,Constants.USERNAME
											   ,Constants.PASSWORD);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		return conn;
	}
		
	
}
