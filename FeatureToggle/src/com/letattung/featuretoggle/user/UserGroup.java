/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle.user;

import java.util.ArrayList;

public class UserGroup {

	private static ArrayList<User> freeGroup = new ArrayList<>();
	private static ArrayList<User> paidGroup = new ArrayList<>();
	
	
	public static void addUserToFreeGroup(final User user) throws IllegalArgumentException{
		if (paidGroup.contains(user)){
			throw new IllegalArgumentException("User all ready member of paid group.");
		}
		if (!freeGroup.contains(user)){
			freeGroup.add(user);
		}
	}
	
	public static void addUserToPaidGroup(final User user) throws IllegalArgumentException{
		if (freeGroup.contains(user)){
			throw new IllegalArgumentException("User all ready member of free group.");
		}
		if (!paidGroup.contains(user)){
			paidGroup.add(user);
		}
	}
	
	public static boolean isPaid(User user){
		return paidGroup.contains(user);
	}
}
