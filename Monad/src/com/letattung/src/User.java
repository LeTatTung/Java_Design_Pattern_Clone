/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/monad
 */
package com.letattung.src;

public class User {

	private String name;
	private int age;
	private Sex sex;
	private String email;
	
	public User(String name, int age, Sex sex, String email) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public Sex getSex(){
		return sex;
	}
	
	public String getEmail(){
		return email;
	}
}
