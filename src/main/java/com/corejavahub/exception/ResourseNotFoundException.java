package com.corejavahub.exception;

public class ResourseNotFoundException extends RuntimeException {

	public ResourseNotFoundException(String message) {

		super(message);
	}

	public ResourseNotFoundException() {

		super("Resourse Not Found On Server...");
	}
}
