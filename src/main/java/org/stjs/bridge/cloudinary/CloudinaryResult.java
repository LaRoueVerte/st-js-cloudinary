/*
    ST-JS-Cloudinary, a ST-JS bridge for cloudinary_js
    (c) 2015 La Roue Verte
     
	This file is part of ST-JS-Cloudinary.

    ST-JS-Cloudinary is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or any later version.

    ST-JS-Cloudinary is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with ST-JS-Cloudinary.  If not, see <http://www.gnu.org/licenses/>
 */
package org.stjs.bridge.cloudinary;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class CloudinaryResult {

	public String public_id;
	public Long version;
	public String signature;
	public Integer width;
	public Integer height;
	public String format;
	public String resource_type;
	public String created_at;
	public Long bytes;
	public String type;
	public String url;
	public String secure_url;
	public String path;

}
