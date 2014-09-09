package com.hawk.commons.logging.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;

public class LogStaticTest {
	private static Log logger =
	// LogFactory.getLog(LogStaticTest.class);
	LogFactory.getLog(Log.class.getName());

	public static void main(String[] args) {
		PropertyConfigurator
				.configure("src/main/resources/conf/log4j.properties");

		logger.fatal("this is fatal log.");
		logger.error("this is error log.");
		logger.warn("this is warn log.");
		logger.info("this is info log.");
		logger.debug("this is debug log.");
	}

}