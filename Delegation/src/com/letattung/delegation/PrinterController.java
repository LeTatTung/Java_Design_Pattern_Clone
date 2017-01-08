/*
 * hoc theo java design pattern cua iluwatar
 * tai https://github.com/iluwatar/java-design-patterns/tree/master/delegation
 */
package com.letattung.delegation;

public class PrinterController implements Printer{

	private final Printer printer;
	
	public PrinterController(Printer printer) {
		this.printer = printer;
	}
	@Override
	public void print(String message) {
		printer.print(message);
	}

}
