package com.atguigu.log4j;

import org.apache.log4j.Logger;

public class UserDao {
	// private Logger logger = LoggerFactory.getLogger(this.getClass()); //
	// slf4j logback
	// com.atguigu.dao.UserDao

	private static final Logger logger = Logger.getLogger(UserDao.class);// log4j

	public static void main(String[] args) {
		// logger.debug("hello 0316-----debug");
		// logger.info("hello 0316-----info");
		// logger.warn("hello 0316-----warn");
		// logger.error("hello 0316-----error");
		int age = 0;
		try {
			logger.debug("11111");
			age = 10 / 0;
			logger.debug("22222");
		} catch (Exception e) {
			logger.error(e, e.getCause());
		}
	}
}
