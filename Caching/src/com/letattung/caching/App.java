/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		// VirtualDB (instead of MongoDB) was used in running the JUnit tests
        // and the App class to avoid Maven compilation errors. Set flag to
        // true to run the tests with MongoDB (provided that MongoDB is
        // installed and socket connection is open).
		AppManager.intDb(false);
		
		AppManager.intCacheCapacity(3);
		App app = new App();
		app.useCacheAsideStategy();
		app.useReadAndWriteThroughStrategy();
		app.useReadThroughAndWriteBehindStrategy();
		app.useReadThroughAndWriteAroundStrategy();
	}
	
	//Read-through and write-through
	public void useReadAndWriteThroughStrategy(){
		LOGGER.info("# CachingPolicy.THROUGH");
	    AppManager.initCachingPolicy(CachingPolicy.THROUGH);

	    UserAccount userAccount1 = new UserAccount("001", "Le Tat Tung", "Anh ay thich an thit ga.");

	    AppManager.save(userAccount1);
	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("001");
	    AppManager.find("001");	
	}
	
	//Read-through and write-around
	public void useReadThroughAndWriteAroundStrategy(){
		LOGGER.info("# CachingPolicy.AROUND");
	    AppManager.initCachingPolicy(CachingPolicy.AROUND);

	    UserAccount userAccount2 = new UserAccount("002", "Vinh", "Co ay la mot nguoi tot.");

	    AppManager.save(userAccount2);
	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("002");
	    LOGGER.info(AppManager.printCacheContent());
	    userAccount2 = AppManager.find("002");
	    userAccount2.setUserName("Mai Xuan Vinh");
	    AppManager.save(userAccount2);
	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("002");
	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("002");
	}
	//Read-through and write-behind
	public void useReadThroughAndWriteBehindStrategy(){
		 LOGGER.info("# CachingPolicy.BEHIND");
		 AppManager.initCachingPolicy(CachingPolicy.BEHIND);

		 UserAccount userAccount3 = new UserAccount("003", "Nguyen Huu Tien", "Anh ay cuc ky gioi.");
		 UserAccount userAccount4 = new UserAccount("004", "Nguyen Dinh Manh", "Nguoi ba nhat Hedspi.");
		 UserAccount userAccount5 = new UserAccount("005", "Le Thi Mai", "Co ay that la kinh khung.");

		 AppManager.save(userAccount3);
		 AppManager.save(userAccount4);
		 AppManager.save(userAccount5);
		 LOGGER.info(AppManager.printCacheContent());
		 AppManager.find("003");
		 LOGGER.info(AppManager.printCacheContent());
		 UserAccount userAccount6 = new UserAccount("006", "Yasha", "She is an only child.");
		 AppManager.save(userAccount6);
		 LOGGER.info(AppManager.printCacheContent());
		 AppManager.find("004");
		 LOGGER.info(AppManager.printCacheContent());
	}
	//Cache-Aside
	public void useCacheAsideStategy(){
		LOGGER.info("# CachingPolicy.ASIDE");
	    AppManager.initCachingPolicy(CachingPolicy.ASIDE);
	    LOGGER.info(AppManager.printCacheContent());

		UserAccount userAccount3 = new UserAccount("003", "Nguyen Huu Tien", "Anh ay cuc ky gioi.");
		UserAccount userAccount4 = new UserAccount("004", "Nguyen Dinh Manh", "Nguoi ba nhat Hedspi.");
		UserAccount userAccount5 = new UserAccount("005", "Le Thi Mai", "Co ay that la kinh khung.");

	    AppManager.save(userAccount3);
	    AppManager.save(userAccount4);
	    AppManager.save(userAccount5);

	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("003");
	    LOGGER.info(AppManager.printCacheContent());
	    AppManager.find("004");
	    LOGGER.info(AppManager.printCacheContent());
	}
}
