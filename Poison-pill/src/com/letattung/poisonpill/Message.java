/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/poison-pill
 */
package com.letattung.poisonpill;

import java.util.Map;

public interface Message {

	Message POISON_PILL = new Message() {
		
		@Override
		public void addHeader(Headers header, String value){
			throw poison();
		}
		
		private RuntimeException poison(){
			return new UnsupportedOperationException("Poison");
		}

		@Override
		public String getHeader(Headers header) {
			throw poison();
		}

		@Override
		public Map<Headers, String> getHeaders() {
			throw poison();
		}

		@Override
		public void setBody(String body) {
			throw poison();
		}

		@Override
		public String getBody() {
			throw poison();
		}
	};

	void addHeader(Headers header, String value);
	
	String getHeader(Headers header);
	
	Map<Headers, String> getHeaders();
	
	void setBody(String body);
	
	String getBody();
}
