/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/monad
 */
package com.letattung.src;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		User user = new User("Le Tat Tung", 22, Sex.MALE, "letattungtb@gmail.com");
		LOGGER.info(Validator.of(user).validate(User::getName, Objects::nonNull, "name is null")
		        .validate(User::getName, name -> !name.isEmpty(), "name is empty")
		        .validate(User::getEmail, email -> !email.contains("@"), "email doesn't containt '@'")
		        .validate(User::getAge, age -> age > 20 && age < 30, "age isn't between...").get().toString());
	}
}
