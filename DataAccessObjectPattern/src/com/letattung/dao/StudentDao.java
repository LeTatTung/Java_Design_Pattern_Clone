// hoc theo java design pattern tutorial

package com.letattung.dao;

import java.util.ArrayList;

public interface StudentDao {

	public ArrayList<Student> getAllStudents();
	public Student getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
