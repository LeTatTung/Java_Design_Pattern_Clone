// hoc theo java design pattern tutorial

package com.letattung.filterpattern;

public class Person {

	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name, String gender, String maritalStatus) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getMaritalStatus(){
		return maritalStatus;
	}
}
