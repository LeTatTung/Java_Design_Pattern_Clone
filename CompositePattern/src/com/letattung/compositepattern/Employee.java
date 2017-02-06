// hoc theo java design pattern tutorial

package com.letattung.compositepattern;

import java.util.ArrayList;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private ArrayList<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<>();
	}
	
	public void add(Employee e){
		subordinates.add(e);
	}
	
	public void remove(Employee e){
		subordinates.remove(e);
	}
	
	public ArrayList<Employee> getSubordinates(){
		return subordinates;
	}
	
	public String toString(){
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
	}
}
