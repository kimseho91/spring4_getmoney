package com.getmoney.factory.web;

import com.getmoney.enums.web.DB;

public class DatabaseFactory {

	public static Database createDatabase(String vendor) {
		
		Database db = null;
				
		switch(DB.valueOf(vendor)) {
		case ORACLE:
			db = new Oracle();
			break;
		}
		
		return db;
		
	}
}
