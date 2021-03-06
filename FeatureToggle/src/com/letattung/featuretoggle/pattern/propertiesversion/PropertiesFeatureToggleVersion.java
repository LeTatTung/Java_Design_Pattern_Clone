/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle.pattern.propertiesversion;

import java.util.Properties;

import com.letattung.featuretoggle.pattern.Service;
import com.letattung.featuretoggle.user.User;

public class PropertiesFeatureToggleVersion implements Service{

	private boolean isEnhanced;

	public PropertiesFeatureToggleVersion(final Properties properties) {
		if (properties == null){
			throw new IllegalArgumentException("No Properties Provided.");
		}else{
			try{
				isEnhanced = (boolean)properties.get("enhancedWelcome");
			}catch(Exception e){
				throw new IllegalArgumentException("Invalid Enhancement Settings Provided.");
			}
		}
	}
	@Override
	public String getWelcomeMessage(final User user) {
		if (isEnhanced()){
			return "Welcome " + user + ". You're using the enhanced welcome message.";
		}
		return "Welcome to the application.";
	}

	@Override
	public boolean isEnhanced() {
		return isEnhanced;
	}
	
}
