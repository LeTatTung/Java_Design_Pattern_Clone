// hoc theo java design pattern tutorial

package com.letattung.chainofresponsibilitypattern1;

public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers(){
		
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogeer(fileLogger);
		fileLogger.setNextLogeer(consoleLogger);
		
		return errorLogger;
	}
	public static void main(String [] args){
		
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
	}
}
