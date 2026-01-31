package com.arora.example.exception;

@SuppressWarnings("serial")
public class CustomException extends RuntimeException {

	CustomException(String message) {
		super(message);
	}

	CustomException() {
		super("Invalid Input Provided.....");
	}

}
