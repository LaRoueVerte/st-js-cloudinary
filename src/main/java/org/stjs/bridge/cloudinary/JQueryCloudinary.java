package org.stjs.bridge.cloudinary;

import org.stjs.javascript.jquery.JQueryCore;

public interface JQueryCloudinary <FullJQuery extends JQueryCore<?>> {

	public void unsigned_cloudinary_upload(String uploadPreset, CloudinaryOptions options);
	
	public void bind(String event, CloudinaryEventHandler handler);

}
