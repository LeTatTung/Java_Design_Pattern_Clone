// hoc theo java design pattern tutorial

package com.letattung.filterpattern;

import java.util.ArrayList;

public class CriteriaPatternDemo {

	public static void main(String [] args){
		ArrayList<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Le Tat Tung", "Male", "Single"));
		persons.add(new Person("Nguyen Huu Tien", "Male", "Married"));
		persons.add(new Person("Cao Van Minh", "Female", "Single"));
		persons.add(new Person("Vu Thu Hien", "Female", "Single"));
		persons.add(new Person("Dieu Linh", "Female", "Single"));
		persons.add(new Person("Tran Minh Hai", "Male", "Married"));
		
		Criteria male = new CriteriaMale();
	    Criteria female = new CriteriaFemale();
	    Criteria single = new CriteriaSingle();
	    Criteria singleMale = new AndCriteria(single, male);
	    Criteria singleOrFemale = new OrCriteria(single, female);

	    System.out.println("Males: ");
	    printPersons(male.meetCriteria(persons));

	    System.out.println("\nFemales: ");
	    printPersons(female.meetCriteria(persons));

	    System.out.println("\nSingle Males: ");
	    printPersons(singleMale.meetCriteria(persons));

	    System.out.println("\nSingle Or Females: ");
	    printPersons(singleOrFemale.meetCriteria(persons));
	}
	
	public static void printPersons(ArrayList<Person> persons){
		for (Person person : persons){
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}
}
