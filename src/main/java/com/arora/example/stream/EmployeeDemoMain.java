package com.arora.example.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemoMain {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		Date jdram = format.parse("01-01-2000");
		Date jdSita = format.parse("15-05-1995");
		Date jdVishnu = format.parse("10-12-1998");
		Date jdMahesh = format.parse("20-03-1990");
		Date jdRadha = format.parse("12-06-2001");

		List<EmployeeDemo> list = Arrays.asList(new EmployeeDemo("Ram", 50000.0, jdram, "M"),
				new EmployeeDemo("Sita", 40000.0, jdSita, "F"), new EmployeeDemo("Vishnu", 20000.0, jdVishnu, "M"),
				new EmployeeDemo("Mahesh", 70000.0, jdMahesh, "M"), new EmployeeDemo("Radha", 5000.0, jdRadha, "F"));

//		Find out highest salary

		EmployeeDemo highestEmployee = list.stream().max((a, b) -> Double.compare(a.getSalary(), b.getSalary())).get();
		System.out.println("Highest employee : " + highestEmployee);

		System.out.println("-------------------------------------");

		EmployeeDemo highestEmployee1 = list.stream().max(Comparator.comparing(EmployeeDemo::getSalary)).get();
		System.out.println("Highest employee : " + highestEmployee1);

		System.out.println("-------------------------------------");

		EmployeeDemo highestEmployee2 = list.stream().max(Comparator.comparingDouble(EmployeeDemo::getSalary)).get();
		System.out.println("Highest employee : " + highestEmployee2);

		System.out.println("\n**************************************************************************");

		List<EmployeeDemo> sortedList = list.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		System.out.println("\n**************************************************************************");

		List<EmployeeDemo> sortedList1 = list.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
				.skip(1).collect(Collectors.toList());
		sortedList1.forEach(System.out::println);

		System.out.println("\n**************************************************************************");

		EmployeeDemo secondHighestSalary = list.stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
				.skip(1).findFirst().get();
		System.out.println("Second highest salaried : " + secondHighestSalary);

		System.out.println("\n**************************************************************************");

		Optional<EmployeeDemo> secondHighestSalary1 = list.stream()
				.sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst();
		if (secondHighestSalary1.isPresent()) {
			System.out.println("Optional Second highest salaried : " + secondHighestSalary1);

		}

//		Or
		System.out.println("-------------------------------------");

		secondHighestSalary1.ifPresent(System.out::println);
		System.out.println(secondHighestSalary1.get());

		System.out.println("\n**************************************************************************");

//		Most senior from joining date

		Optional<EmployeeDemo> seionrOnJoiningDate = list.stream()
				.min((a, b) -> a.getJoiningDate().compareTo(b.getJoiningDate()));
		seionrOnJoiningDate.ifPresent(System.out::println);

		System.out.println("-------------------------------------");

		Optional<EmployeeDemo> seionrOnJoiningDate1 = list.stream()
				.min(Comparator.comparing(EmployeeDemo::getJoiningDate));
		seionrOnJoiningDate1.ifPresent(System.out::println);

		System.out.println("\n**************************************************************************");

		Map<String, Long> genderCount = list.stream()
				.collect(Collectors.groupingBy(EmployeeDemo::getGender, Collectors.counting()));
		System.out.println(genderCount);

		System.out.println("\n**************************************************************************");

//		Find out in gender highest salaried employee 

		Map<String, Optional<EmployeeDemo>> highestSalariedEmp = list.stream().collect(Collectors
				.groupingBy(EmployeeDemo::getGender, Collectors.maxBy(Comparator.comparing(emp->emp.getSalary()))));
		System.out.println(highestSalariedEmp);
		
		System.out.println("\n**************************************************************************");

		highestSalariedEmp.forEach((a, b) -> System.out.println("Gender : " + a + "  Employee : " + b.get()));

	}

}
