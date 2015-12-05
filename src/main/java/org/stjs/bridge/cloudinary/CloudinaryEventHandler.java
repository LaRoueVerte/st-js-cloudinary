package org.stjs.bridge.cloudinary;

import org.stjs.javascript.annotation.JavascriptFunction;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.Event;

@SyntheticType
@JavascriptFunction
public interface CloudinaryEventHandler {
	public boolean onEvent(Event ev, CloudinaryResponse data);
}
