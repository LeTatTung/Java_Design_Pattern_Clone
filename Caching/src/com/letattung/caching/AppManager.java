/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

import java.text.ParseException;

public final class AppManager {

	private static CachingPolicy cachingPolicy;
	/*
	 * Developer/Tester is able to choose whether the application should use MongoDB as its underlying
	 * data storage or a simple Java data structure to (temporarily) store the data/objects during runtime
	 */
	public static void intDb(boolean useMongo){
		if(useMongo){
			try{
			DbManager.connect();	
			}catch(ParseException e){
				e.printStackTrace();
			}
		}else{
			DbManager.createVitualDb();
		}
	}
	
	//initialize caching policy
	public static void initCachingPolicy(CachingPolicy policy){
		cachingPolicy = policy;
		if(cachingPolicy == CachingPolicy.BEHIND){
			Runtime.getRuntime().addShutdownHook(new Thread(CacheStore::flushCache));
		}
	}
	
	public static void intCacheCapacity(int capacity){
		CacheStore.intCapacity(capacity);
	} 
	
	// find user account
	public static UserAccount find(String userId){
		
		if(cachingPolicy == CachingPolicy.THROUGH || cachingPolicy == CachingPolicy.AROUND){
			return CacheStore.readThrough(userId);
		}else if(cachingPolicy == CachingPolicy.BEHIND){
			return CacheStore.readThroughWithWriteBackPolicy(userId);
		}else if(cachingPolicy == CachingPolicy.ASIDE){
			return findAside(userId);
		}
		return null;
	}
	
	//save user account
	public static void save(UserAccount userAccount){
		if (cachingPolicy == CachingPolicy.THROUGH) {
		      CacheStore.writeThrough(userAccount);
		    } else if (cachingPolicy == CachingPolicy.AROUND) {
		      CacheStore.writeAround(userAccount);
		    } else if (cachingPolicy == CachingPolicy.BEHIND) {
		      CacheStore.writeBehind(userAccount);
		    } else if (cachingPolicy == CachingPolicy.ASIDE) {
		      saveAside(userAccount);
		    }
	}
	
	public static String printCacheContent(){
		return CacheStore.print();
	}
	//Cache-Aside save user account helper
	private static void saveAside(UserAccount userAccount){
		DbManager.updateDb(userAccount);
		CacheStore.invalidate(userAccount.getUserId());
	}
	
	// Cache-Aside find user account helper
	private static UserAccount findAside(String userId){
		
		UserAccount userAccount = CacheStore.get(userId);
		if(userAccount != null){
			return userAccount;
		}
		
		userAccount = DbManager.readFromDb(userId);
		if(userAccount != null){
			CacheStore.set(userId, userAccount);
		}
		return userAccount;
	}
}
