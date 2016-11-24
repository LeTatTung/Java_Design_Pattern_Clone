/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

public enum CachingPolicy {

	THROUGH("through"), AROUND("around"), BEHIND("behind"), ASIDE("aside");

	private String policy;
	
	private CachingPolicy(String policy){
		this.policy = policy;
	}
	public String getPolicy(){
		return policy;
	}
}
