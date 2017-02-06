// hoc theo java design pattern tutorial

package com.letattung.filterpattern1;

import java.util.ArrayList;

public class CriteriaSingle implements Criteria{

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> singlePersons = new ArrayList<>();
		
		for (Person person : persons){
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}
