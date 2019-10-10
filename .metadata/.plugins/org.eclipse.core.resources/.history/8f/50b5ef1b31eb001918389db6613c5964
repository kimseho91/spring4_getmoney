package com.web.bran.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import com.web.bran.enums.DBDriver;
import com.web.bran.enums.DBUrl;
import com.web.bran.pool.Constants;

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
