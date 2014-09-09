package com.hawk.commons.logging.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;


public class LogJunitTest {
	private Log logger;

	@Before
	public void setup() {
//		logger=LogFactory.getLog(getClass());
//		logger=LogFactory.getLog(Class.class.getName());
//		logger=LogFactory.getLog(LogJunitTest.class);
//		logger=LogFactory.getLog(Log.class.getName());
		logger=LogFactory.getLog("");
		
		PropertyConfigurator.configure("src/main/resources/conf/log4j.properties");
	}

	@Test
	public void testLog() {
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