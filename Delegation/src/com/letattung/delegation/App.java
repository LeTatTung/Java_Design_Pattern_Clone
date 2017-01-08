/*
 * hoc theo java design pattern cua iluwatar
 * tai https://github.com/iluwatar/java-design-patterns/tree/master/delegation
 */
package com.letattung.delegation;

public class App {

	public static final String MESSAGE_TO_PRINT = "hello world";
	
	public static void main(String [] args){
		
		PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
		PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());
		PrinterController hpPrinterController = new PrinterController(new HpPrinter());
		
		canonPrinterController.print(MESSAGE_TO_PRINT);
		epsonPrinterController.print(MESSAGE_TO_PRINT);
		hpPrinterController.print(MESSAGE_TO_PRINT);
	}
}
