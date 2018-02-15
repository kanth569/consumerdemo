package com.java.consumer.interceptor;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.consumer.controller.BusinessFunctionController;
import com.java.consumer.exception.ConsumerException;

@ControllerAdvice(basePackages={"com.java.consumer.*"})
public class RestExceptionHandler extends JavaRestExceptionHandler {

	private static final Marker NOTIFY_ADMIN = MarkerFactory.getMarker("NOTIFY_ADMIN");

	@ExceptionHandler(TypeMismatchException.class)
	@ResponseBody
	ResponseEntity<ResponseInfo> handleNumberFormatException(TypeMismatchException ex) {

		logException(ex);

		ResponseInfo error = new ResponseInfo(String.valueOf("1070"), "Invalid id field");
		return new ResponseEntity<ResponseInfo>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(ConsumerException.class)
	@ResponseBody
	ResponseEntity<ResponseInfo> handleNumberFormatException(ConsumerException ex) {

		logException(ex);

		ResponseInfo error = new ResponseInfo(String.valueOf("404"), "Entity Not Found");
		return new ResponseEntity<ResponseInfo>(error, HttpStatus.NOT_FOUND);
	}

}
