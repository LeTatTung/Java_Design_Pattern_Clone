/*
 * hoc theo project java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/double-dispatch
 */
package com.letattung.doubledispatch;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
	
		ArrayList<GameObject> objects = new ArrayList<>();
		
		objects.add(new FlamingAsteroid(0, 0, 5, 5));
		objects.add(new Meteoroid(10, 10, 15, 15));
		objects.add(new SpaceStationMir(1, 1, 2, 2));
		objects.add(new SpaceStationIss(10, 10, 20, 20));
		
		objects.stream().forEach(o -> LOGGER.info(o.toString()));
	    LOGGER.info("");
	    
	    objects.stream().forEach(o1 -> objects.stream().forEach(o2 -> {
	        if (o1 != o2 && o1.intersectsWith(o2)) {
	          o1.collision(o2);
	        }
	       }));
	    LOGGER.info("");
	    
	    objects.stream().forEach(o -> LOGGER.info(o.toString()));
	    LOGGER.info("");
	}
}
