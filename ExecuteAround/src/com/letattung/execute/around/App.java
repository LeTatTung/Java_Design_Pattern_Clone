/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/execute-around
 */
package com.letattung.execute.around;

import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String [] args)throws IOException{
		new SimpleFileWriter("test.txt", new FileWriterAction() {
			
			@Override
			public void writeFile(FileWriter writer) throws IOException {
				writer.write("Hello");
				writer.append(" ");
				writer.append("world !");		
			}
		});
	}
}
