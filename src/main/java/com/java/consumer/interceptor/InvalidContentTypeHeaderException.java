package com.java.consumer.interceptor;

import java.util.List;

import org.springframework.http.MediaType;

public class InvalidContentTypeHeaderException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6672402390113142287L;
	
	private List<MediaType> supportedMediaTypes;
	
	public InvalidContentTypeHeaderException(List<MediaType> supportedMediaTypes) {
		super();
		this.supportedMediaTypes = supportedMediaTypes;
	}

	public List<MediaType> getSupportedMediaTypes() {
		return supportedMediaTypes;
	}


}
