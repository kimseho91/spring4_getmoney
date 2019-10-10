package com.web.bran.factory;

import com.web.bran.enums.DB;

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
