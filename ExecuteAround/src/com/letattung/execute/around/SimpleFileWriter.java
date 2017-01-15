/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/execute-around
 */
package com.letattung.execute.around;

import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {

	public SimpleFileWriter(String fileName, FileWriterAction action) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		try{
			action.writeFile(writer);
		}finally{
			writer.close();
		}
	}
}
