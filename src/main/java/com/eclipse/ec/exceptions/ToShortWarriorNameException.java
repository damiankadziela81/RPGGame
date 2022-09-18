package com.eclipse.ec.exceptions;

public class ToShortWarriorNameException extends RuntimeException {
	
	private static final String ERROR_MESSAGE = "Name is too short";
	
	public ToShortWarriorNameException() {
		super(ERROR_MESSAGE);
	}

}
