/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/mute-idiom
 */
package com.letattung.mute;

@FunctionalInterface
public interface CheckedRunnable {

	void run() throws Exception;
}
