/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/hexagonal
 */
package com.letattung.hexagonal.mongo;

import java.io.FileInputStream;
import java.util.Properties;

public class MongoConnectionPropertiesLoader {

	private static final String DEFAULT_HOST = "localhost";
	private static final int DEFAULT_PORT = 27017;
	
	public static void load(){
		String host = DEFAULT_HOST;
		int port = DEFAULT_PORT;
		String path = System.getProperty("hexagonal.properties.path");
		Properties properties = new Properties();
		
		if (path != null){
			try(FileInputStream fin = new FileInputStream(path)){
				properties.load(fin);
				host = properties.getProperty("mongo-host");
				port = Integer.parseInt(properties.getProperty("mongo-port"));
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.setProperty("mongo-host", host);
		System.setProperty("mongo-port", String.format("%d", port));
	}
}
