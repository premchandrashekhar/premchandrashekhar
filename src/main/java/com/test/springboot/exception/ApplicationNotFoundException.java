package com.test.springboot.exception;

import java.util.HashMap;
import java.util.Map;

public class ApplicationNotFoundException extends RuntimeException /* implements GraphQLError */ {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6644848332858604997L;
	
	private Map<String, Object> extensions = new HashMap<>();

	public ApplicationNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println("##############################################################");
	}

	public ApplicationNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ApplicationNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ApplicationNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ApplicationNotFoundException(String message, long id) {
		// TODO Auto-generated constructor stub
		super(message);
		extensions.put("invalidApplicationId", id);
	}

	/*
	 * @Override public List<SourceLocation> getLocations() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public ErrorClassification getErrorType() { // TODO Auto-generated
	 * method stub return null; }
	 */

}
