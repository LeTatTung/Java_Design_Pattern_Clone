/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reader-writer-lock
 */
package com.letattung.rwl;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class ReaderWriterLock implements ReadWriteLock{

	private Object readerMutex = new Object();
	private int currentReaderCount;
	private Set<Object> globalMutex = new HashSet<>();
	
	private ReadLock readLock = new ReadLock();
	private WriteLock writeLock = new WriteLock();
	
	@Override
	public Lock readLock() {
		return readLock;
	}

	@Override
	public Lock writeLock() {
		return writeLock;
	}
	
	private boolean doesWriterOwnThisLock(){
		return globalMutex.contains(writeLock);
	}
	
	private boolean doesReaderOwnThisLock(){
		return globalMutex.contains(readLock);
	}
	
	private boolean isLockFree(){
		return globalMutex.isEmpty();
	}
	
	private static void waitUninterruptibly(Object object){
		try{
			object.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	private class ReadLock implements Lock{

		@Override
		public void lock() {
			synchronized (readerMutex) {
				currentReaderCount ++;
				if (currentReaderCount == 1){
					synchronized (globalMutex) {
						while (true){
							if (isLockFree() || doesReaderOwnThisLock()){
								globalMutex.add(this);
								break;
							}else {
								waitUninterruptibly(globalMutex);
							}
						}
					}
				}
			}
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean tryLock() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit) throws InterruptedException{
			throw new UnsupportedOperationException();
		}

		@Override
		public void unlock() {
			synchronized (readerMutex) {
				currentReaderCount -- ;
				if (currentReaderCount == 0){
					synchronized (globalMutex) {
						globalMutex.remove(this);
						globalMutex.notifyAll();
					}
				}
			}
		}

		@Override
		public Condition newCondition() {
			throw new UnsupportedOperationException();
		}
		
	}
	
	private class WriteLock implements Lock{

		@Override
		public void lock() {
			synchronized (globalMutex) {
				while (true){
					if (isLockFree()){
						globalMutex.add(this);
						break;
					}else if (doesWriterOwnThisLock()){
						waitUninterruptibly(globalMutex);
					}else if (doesReaderOwnThisLock()){
						waitUninterruptibly(globalMutex);
					}else {
						throw new AssertionError("it should never reach here");
					}
				}
			}
		}

		@Override
		public void lockInterruptibly() throws InterruptedException {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean tryLock() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
			throw new UnsupportedOperationException();
		}

		@Override
		public void unlock() {
			synchronized (globalMutex) {
				globalMutex.remove(this);
				globalMutex.notifyAll();
			}
		}

		@Override
		public Condition newCondition() {
			throw new UnsupportedOperationException();
		}
		
	}
}
