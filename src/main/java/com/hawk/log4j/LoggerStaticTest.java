package com.hawk.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import sun.rmi.runtime.Log;

public class LoggerStaticTest {
	private static Logger logger =
	// Logger.getLogger(Log.class.getName());
	// Logger.getLogger(LoggerStaticTest.class);
	Logger.getLogger("");

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