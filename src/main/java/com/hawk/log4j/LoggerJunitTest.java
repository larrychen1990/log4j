package com.hawk.log4j;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

public class LoggerJunitTest {
	private Logger logger;

	@Before
	public void setup() {
//		logger = Logger.getLogger(getClass());
//		logger = Logger.getLogger(Class.class.getName());
//		logger = Logger.getLogger(LoggerJunitTest.class);
		logger = Logger.getLogger(Log.class.getName());
		
		
		PropertyConfigurator.configure("src/main/resources/conf/log4j.properties");
//		PropertyConfigurator.configure("src/main/resources/conf/log4j.xml");
	}

	@Test
	public void testLogger() {
		track();
	}

	private void track() {
		logger.fatal("this is fatal logger.");
		logger.error("this is error logger.");
		logger.warn("this is warn logger.");
		logger.info("this is info logger.");
		logger.debug("this is debug logger.");
	}

}