// hoc theo java design pattern tutorial

package com.letattung.filterpattern1;

import java.util.ArrayList;

public class CriteriaFemale implements Criteria{

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> femalePersons = new ArrayList<>();
		
		for (Person person : persons){
			if (person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
