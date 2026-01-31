package com.arora.example.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorMain {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(4, "Dave", 25, 28000));
		empList.add(new Employee(20, "Mike", 20, 10000));
		empList.add(new Employee(15, "Stark", 25, 4500));
		empList.add(new Employee(9, "Abhi", 32, 5000));
		empList.add(new Employee(1, "Lisa", 40, 19000));

		Collections.sort(empList);
		empList.forEach(System.out::println);
		System.out.println("*********************************************************");
		Collections.sort(empList, new NameComparator());
		empList.forEach(System.out::println);
		System.out.println("*********************************************************");
		Collections.sort(empList, new SalaryComparator());
		empList.forEach(System.out::println);
		System.out.println("*********************************************************");
		Collections.sort(empList, new NameAgeComparator());
		empList.forEach(System.out::println);

	}

}
