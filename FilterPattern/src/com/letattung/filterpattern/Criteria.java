// hoc theo java design pattern tutorial

package com.letattung.filterpattern;

import java.util.ArrayList;

public interface Criteria {

	public ArrayList<Person> meetCriteria (ArrayList<Person> persons);
}
