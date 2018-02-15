package com.java.consumer.interceptor;

import java.util.List;

import org.springframework.http.MediaType;

public class InvalidAcceptHeaderException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4997792645549005504L;
	
	private List<MediaType> supportedMediaTypes;
	
	public InvalidAcceptHeaderException(List<MediaType> mediaTypes){
		super("Accept header does not match");
		this.supportedMediaTypes = mediaTypes;
	}

	public List<MediaType> getSupportedMediaTypes() {
		return supportedMediaTypes;
	}


}
