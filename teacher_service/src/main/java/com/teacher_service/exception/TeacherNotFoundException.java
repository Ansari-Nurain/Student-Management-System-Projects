package com.teacher_service.exception;

public class TeacherNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TeacherNotFoundException(String message) {

	
		super(message);
	}

	public TeacherNotFoundException() {

		super("Teacher not found");
	}
}
