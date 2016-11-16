/*
 *  Copyright (c) 2014 Ilkka Seppälä
 *  link github clone: https://github.com/iluwatar/java-design-patterns
 *  le tat tung chi la thang hoc hoi cong nghe
 */
package com.letattung.async.method.invocation;

import java.util.Optional;

public interface AsyncCallback<T> {
	
	void onComplete(T value, Optional<Exception> ex);
}
