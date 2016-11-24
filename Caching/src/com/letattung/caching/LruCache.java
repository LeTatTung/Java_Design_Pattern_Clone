/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LruCache {

	private static final Logger LOGGER = LoggerFactory.getLogger(LruCache.class);
	
	class Node{
		String userId;
		UserAccount userAccount;
		Node previous;
		Node next;
		
		public Node(String userId, UserAccount userAccount) {
			// TODO Auto-generated constructor stub
			this.userId = userId;
			this.userAccount = userAccount;
		}
	}
	int capacity;
	Map <String, Node> cache = new HashMap<>();
	Node head;
	Node end;
	public LruCache(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
	}
	// get user account
	public UserAccount get(String userId){
		if(cache.containsKey(userId)){
			Node node = cache.get(userId);
			remove(node);
			setHead(node);
			return node.userAccount;
		}
		return null;
	}
	// remove node from linked list
	public void remove(Node node){
		if(node.previous != null){
			node.previous.next = node.next;
		}else{
			head = node.next;
		}
		if(node.next != null){
			node.next.previous = node.previous;
		}else{
			end = node.previous;
		}
	}
	//move node to the front of the list
	public void setHead(Node node){
		node.next = head;
		node.previous = null;
		if(head != null){
			head.previous = node;
		}
		head = node;
		if(end == null){
			end = head;
		}
	}
	//set user account
	public void set(String userId, UserAccount userAccount){
		
		if(cache.containsKey(userId)){
			Node old = cache.get(userId);
			old.userAccount = userAccount;
			remove(old);
			setHead(old);
		}else{
			Node newNode = new Node(userId, userAccount);
		      if (cache.size() >= capacity) {
		        LOGGER.info("# Cache is FULL! Removing {} from cache...", end.userId);
		        cache.remove(end.userId); // remove LRU data from cache.
		        remove(end);
		        setHead(newNode);
		      } else {
		        setHead(newNode);
		      }
		    cache.put(userId, newNode);	
		}
	}
	// invalidate cache for user
	public void invalidate(String userId){
		Node toBeRemoved = cache.remove(userId);
	    if (toBeRemoved != null) {
		      LOGGER.info("# {} has been updated! Removing older version from cache...", userId);
		      remove(toBeRemoved);
		   }
	}
	public boolean isFull(){
		return cache.size() >= capacity;
	}
	public UserAccount getLruData(){
		return end.userAccount;
	}
	public boolean contains(String userId) {
	    return cache.containsKey(userId);
	  }
	// clear cache
	public void clear(){
		head = null;
		end = null;
		cache.clear();
	}
	//return cache data in list form
	public ArrayList<UserAccount> getCacheDataInListForm() {
	    ArrayList<UserAccount> listOfCacheData = new ArrayList<>();
	    Node temp = head;
	    while (temp != null) {
	      listOfCacheData.add(temp.userAccount);
	      temp = temp.next;
	    }
	    return listOfCacheData;
	  }
	// set cache capacity
	public void setCapacity(int newCapacity){
		if(capacity  > newCapacity){
			clear();
		}else{
			this.capacity = newCapacity;
		}
	}
}
