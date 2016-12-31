// hoc theo java design pattern tutorial

package com.letattung.MVCpattern1;

public class MVCPatternDemo {

	public static void main(String [] args){
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Nguyen Huu Tien");
		controller.setStudentRollNo("10");
		controller.updateView();
	}
	private static Student retriveStudentFromDatabase(){
		Student student = new Student();
		
		student.setName("Le Tat Tung");
		student.setRollNo("1");
		
		return student;
	}
}
