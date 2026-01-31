package com.arora.example.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		// Formatting a date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(formatter);
		System.out.println("Formatted Date: " + formattedDate);

		// Parsing a date
		LocalDate parsedDate = LocalDate.parse("14-12-2024", formatter);
		System.out.println("Parsed Date: " + parsedDate);

		System.out.println("**********************************");

		LocalDate date1 = LocalDate.now(); // Current date
		LocalTime time1 = LocalTime.now(); // Current time
		LocalDateTime dateTime1 = LocalDateTime.now(); // Current date and time

		System.out.println("Date: " + date1);
		System.out.println("Time: " + time1);
		System.out.println("DateTime: " + dateTime1);

		System.out.println("**********************************");

		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plusWeeks(1); // Add 1 week
		LocalDate previousMonth = today.minusMonths(1); // Subtract 1 month

		System.out.println("Today: " + today);
		System.out.println("Next Week: " + nextWeek);
		System.out.println("Previous Month: " + previousMonth);

		System.out.println("**********************************");

	}

}
