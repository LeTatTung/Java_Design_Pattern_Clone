/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/execute-around
 */
package com.letattung.execute.around;

import java.io.FileWriter;
import java.io.IOException;

public interface FileWriterAction {

	void writeFile(FileWriter writer) throws IOException;
}
