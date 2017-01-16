/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/factory-kit
 */
package com.letattung.factorykit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		WeaponFactory factory = WeaponFactory.factory(builder ->{
			builder.add(WeaponType.AXE, Axe::new);
			builder.add(WeaponType.BOW, Bow::new);
			builder.add(WeaponType.SPEAR, Spear::new);
			builder.add(WeaponType.SWORD, Sword::new);
		});
		
		Weapon axe = factory.create(WeaponType.AXE);
		LOGGER.info(axe.toString());
		
		Weapon bow = factory.create(WeaponType.BOW);
		LOGGER.info(bow.toString());
		
		Weapon spear = factory.create(WeaponType.SPEAR);
		LOGGER.info(spear.toString());
		
		Weapon sword = factory.create(WeaponType.SWORD);
		LOGGER.info(sword.toString());
	}
}
