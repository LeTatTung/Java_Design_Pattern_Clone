package com.letattung.async.method.invocation;

import java.util.Optional;

public interface AsyncCallback<T> {
	
	void onComplete(T value, Optional<Exception> ex);
}
