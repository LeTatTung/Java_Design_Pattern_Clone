/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public enum Weekday {
	MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY(
	"Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");
	
	private String description;
	
	private Weekday(String description) {
		this.description = description;
	}
	
	public String toString(){
		return description;
	}
}
