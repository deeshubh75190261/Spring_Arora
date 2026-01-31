package com.arora.example.exception;

public class CustomExceptionMain {

	public static void handleException() {
		throw new CustomException("kjhbfjksdb");
	}

	public static void main(String[] args) {

		try {
			handleException();
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

}
