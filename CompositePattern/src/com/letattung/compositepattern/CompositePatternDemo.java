// hoc theo java design pattern tutorial

package com.letattung.compositepattern;

public class CompositePatternDemo {

	public static void main(String [] args){
		
		Employee CEO = new Employee("Le Tat Tung", "CEO", 1);
		
		Employee headSales = new Employee("Nguyen Huu Tien", "Head Sales", 20000);
		Employee headMarketing = new Employee("Tran Minh Hai", "Head Marketing", 20000);
		
		Employee salesExecutive1 = new Employee("Cao Van Minh", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Nguyen Dinh Manh", "Sales", 10000);
		
		Employee clerk1 = new Employee("Nguyen Van Minh", "Sales", 10000);
		Employee clerk2 = new Employee("Vu Hang Nga", "Sales", 10000);

		CEO.add(headMarketing);
		CEO.add(headSales);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		// in ra tat ca cac nhan vien cua cong ty
		System.out.println(CEO.toString());
		for(Employee headEmployee : CEO.getSubordinates()){
			System.out.println(headEmployee.toString());
			
			for(Employee employee : headEmployee.getSubordinates()){
				System.out.println(employee.toString());
			}
		}
	}
}
