// hoc theo java design pattern tutorial

package com.letattung.filterpattern1;

import java.util.ArrayList;

public class AndCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		// TODO Auto-generated constructor stub
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
