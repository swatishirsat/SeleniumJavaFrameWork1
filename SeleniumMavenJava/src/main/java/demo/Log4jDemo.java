package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		System.out.println("\n  Hello World... \n");
		
		logger.info("This is an Information Message");
		logger.error("This is an error Message");
		logger.warn("This is a warning Message");
		logger.fatal("This is a Fatal Message");
		
		System.out.println("log4j Message Completed");
	}

}
