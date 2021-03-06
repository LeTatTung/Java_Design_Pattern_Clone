// hoc theo java design pattern tutorial

package com.letattung.dao;

public class DaoPatternDemo {

	public static void main(String [] args){
		
		StudentDao studentDao = new StudentDaoImpl();
		
		//print all students
		for (Student student : studentDao.getAllStudents()){
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		//update student
		Student student = studentDao.getStudent(0);
		student.setName("hai");
		studentDao.updateStudent(student);
		
		studentDao.getStudent(0);
	    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   
	}
}
