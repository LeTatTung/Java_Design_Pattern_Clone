/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle.pattern.tieredversion;

import com.letattung.featuretoggle.pattern.Service;
import com.letattung.featuretoggle.user.User;
import com.letattung.featuretoggle.user.UserGroup;

public class TieredFeatureToggleVersion implements Service{

	@Override
	public String getWelcomeMessage(User user) {
		if (UserGroup.isPaid(user)){
			return "You're amazing " + user + ". Thanks for paying for this awesome software.";
		}
		return "I suppose you can use this software.";
	}

	@Override
	public boolean isEnhanced() {
		return true;
	}

}
