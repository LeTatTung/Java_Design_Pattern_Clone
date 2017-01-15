/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle.pattern;

import com.letattung.featuretoggle.user.User;

public interface Service {

	String getWelcomeMessage(User user);
	boolean isEnhanced();
}
