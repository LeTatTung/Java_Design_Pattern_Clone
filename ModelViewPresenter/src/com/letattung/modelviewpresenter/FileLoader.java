/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/model-view-presenter
 */
package com.letattung.modelviewpresenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileLoader {

	private boolean loader;
	private String fileName;
	
	public String loadData(){
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File(this.fileName)));
			StringBuilder sb = new StringBuilder();
			String line;
			
			while((line = br.readLine()) != null){
				sb.append(line).append('\n');
			}
			this.loader = true;
			br.close();
			
			return sb.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void setFileName(String fileName){
		this.fileName = fileName;
	}
	
	public String getFileName(){
		return this.fileName;
	}
	
	public boolean fileExists(){
		return new File(this.fileName).exists();
	}
	
	public boolean isLoaded(){
		return this.loader;
	}
}
