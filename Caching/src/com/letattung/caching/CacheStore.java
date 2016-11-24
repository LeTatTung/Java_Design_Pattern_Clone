/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheStore {

	private static final Logger LOGGER = LoggerFactory.getLogger(CacheStore.class);
	static LruCache cache;
	private CacheStore(){
		
	}
	// int cache capacity
	public static void intCapacity(int capacity){
		if(cache == null){
			cache = new LruCache(capacity);
		}else{
			cache.setCapacity(capacity);
		}
	}
	 //Get user account using read-through cache
	 public static UserAccount readThrough(String userId){
		if(cache.contains(userId)){
			LOGGER.info("#Cache Hit#");
			return cache.get(userId);
		} 
		LOGGER.info("# Cache Miss!");
	    UserAccount userAccount = DbManager.readFromDb(userId);
	    cache.set(userId, userAccount);
	    return userAccount;
	 }
	 
	 //get user account using write-though cache
	 public static void writeThrough(UserAccount userAccount){
		 if(cache.contains(userAccount.getUserId())){
			 DbManager.updateDb(userAccount);
		 }else{
			 DbManager.writeToDb(userAccount);
		 }
		 cache.set(userAccount.getUserId(), userAccount);
	 }
	 
	 //get user account using write-around cache
	 public static void writeAround(UserAccount userAccount){
		 if(cache.contains(userAccount.getUserId())){
			 DbManager.updateDb(userAccount);
			 cache.invalidate(userAccount.getUserId());
		 }else{
			 DbManager.writeToDb(userAccount);
		 }
	 }
	 
	 //Get user account using read-through cache with write-back policy
	 public static UserAccount readThroughWithWriteBackPolicy(String userId){
		 if(cache.contains(userId)){
			System.out.println("# Cache Hit!");
			return cache.get(userId);
		 }
		 System.out.println("# Cache Miss!");
		 UserAccount userAccount = DbManager.readFromDb(userId);
		 if(cache.isFull()){
			 System.out.println("# Cache is FULL! Writing LRU data to DB...");
			 UserAccount toBeWrittenToDb = cache.getLruData();
			 DbManager.upsertDb(toBeWrittenToDb);
		 }
		 cache.set(userId, userAccount);
		 return userAccount;
	 }
	 
	 //set user account 
	 public static void writeBehind(UserAccount userAccount){
		 if(cache.isFull() && !cache.contains(userAccount.getUserId())){
			 System.out.println("# Cache is FULL! Writing LRU data to DB...");
			 UserAccount toBeWrittenToDb = cache.getLruData();
			 DbManager.upsertDb(toBeWrittenToDb);
		 }
		 cache.set(userAccount.getUserId(), userAccount);
	 }
	 
	 // clears cache
	 public static void clearCache(){
		 if(cache != null){
			 cache.clear();
		 }
	 }
	 
	 // Writes remaining content in the cache into the DB.
	 public static void flushCache(){
		 
		 System.out.println("# flushCache...");
		 if(null == cache){
			 return;
		 }
		 List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
		 for(UserAccount  userAccount : listOfUserAccounts){
			 DbManager.updateDb(userAccount);
		 }
	 }
	 
	 // print user account
	 public static String print(){
		 
		 List<UserAccount> listOfUserAccounts = cache.getCacheDataInListForm();
		 StringBuilder sb = new StringBuilder();
		 sb.append("\n--CACHE CONTENT--\n");
		 for(UserAccount userAccount : listOfUserAccounts){
			 sb.append(userAccount.toString()+ "\n");
		 }
		 sb.append("----\n");
		 return sb.toString();
	 }
	 
	 // Delegate to backing cache store
	 public static UserAccount get(String userId){
		 return cache.get(userId);
	 }
	 
	 //Delegate to backing cache store
	 public static void set(String userId, UserAccount userAccount){
		 cache.set(userId, userAccount);
	 }
	 
	 //Delegate to backing cache store
	 public static void invalidate(String userId){
		 cache.invalidate(userId);
	 }
}
