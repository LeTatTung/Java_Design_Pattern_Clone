/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/servant
 */
package com.letattung.servant;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	static Servant jenkins = new Servant("Jenkins");
	static Servant travis = new Servant("Travis");
	
	public static void main(String [] args){
		scenario(jenkins, 1);
		scenario(travis, 0);
	}
	
	public static void scenario(Servant servant, int compliment){
		King k = new King();
		Queen q = new Queen();
		
		List<Royalty> guests = new ArrayList<>();
		guests.add(q);
		guests.add(k);
		servant.feed(k);
	    servant.feed(q);
	    // serve drinks
	    servant.giveWine(k);
	    servant.giveWine(q);
	    // compliment
	    servant.giveCompliments(guests.get(compliment));

	    // outcome of the night
	    for (Royalty r : guests) {
	      r.changeMood();
	    }
	    if (servant.checkIfYouWillBeHanged(guests)){
	    	LOGGER.info("{} will live another day", servant.name);
	    }else {
	    	LOGGER.info("Poor {}. His days are numbered", servant.name);
	    }
	}
}