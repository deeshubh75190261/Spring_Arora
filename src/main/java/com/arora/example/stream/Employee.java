package com.arora.example.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Employee {

	int employeeId;
	String employeeName;
	int age;
	String gender;
	String deptId;
	int yearOfJoining;
	double salary;

	public Employee(int employeeId, String employeeName, int age, String gender, String deptId, int yearOfJoining,
			double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.age = age;
		this.gender = gender;
		this.deptId = deptId;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDeptId() {
		return deptId;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee Id : " + employeeId + ", Employee Name : " + employeeName + ", age : " + age + ", Gender : "
				+ gender + ", Department : " + deptId + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// With method reference
//		Map<String, List<Employee>> employeeGroupByGender = employeeList.stream()
//				.collect(Collectors.groupingBy(Employee::getGender));

		// Without method reference

		Map<String, List<Employee>> employeeGroupByGender = employeeList.stream()
				.collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.toList()));
		employeeGroupByGender.forEach((key, value) -> System.out.println(key + " - " + value));

		System.out.println("*****************************************************************************************");

//		1. Find count the male and female employees present in the organization?
		Map<String, Long> employeeGroupByGender1 = employeeList.stream()
				.collect(Collectors.groupingBy(employee -> employee.getGender(), Collectors.counting()));
		employeeGroupByGender1.forEach((key, value) -> System.out.println(key + " - " + value));

		System.out.println("*****************************************************************************************");

//		2. Write a program to print the names of all departments in the organization.

		List<String> departments = employeeList.stream().map(emp -> emp.getDeptId()).distinct()
				.collect(Collectors.toList());

		departments.forEach(System.out::println);
		System.out.println("*****************************************************************************************");

//		3. Find the average age of Male and Female Employees.

		Map<String, Double> employees = employeeList.stream().collect(
				Collectors.groupingBy(employee -> employee.getGender(), Collectors.averagingInt(emp -> emp.getAge())));

		employees.forEach((k, v) -> System.out.println(k + " - " + v));
		System.out.println("*****************************************************************************************");

//		4. Get the Names of employees who joined after 2015.

		List<Employee> empList = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.collect(Collectors.toList());

		empList.forEach(System.out::println);
		System.out.println("*****************************************************************************************");

//		5. Count the number of employees in each department.

		Map<String, Long> employee = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.deptId, Collectors.counting()));

		employee.forEach((k, v) -> System.out.println(k + " - " + v));
		System.out.println("*****************************************************************************************");

//		6. Find out the average salary of each department.

		Map<String, Double> employeeAvgSalary = employeeList.stream().collect(
				Collectors.groupingBy(emp -> emp.getDeptId(), Collectors.averagingDouble(emp -> emp.getSalary())));

		employeeAvgSalary.forEach((k, v) -> System.out.println(k + " - " + v));
		System.out.println("*****************************************************************************************");

//		7. Find out the oldest employee, his/her age and department?

		Employee emp = employeeList.stream().max(Comparator.comparing(employeee -> employeee.getAge())).get();
		Employee emp2 = employeeList.stream().max((a, b) -> Integer.compare(a.getAge(), b.getAge())).get();
		System.out.println(emp2);

		System.out.println("Employee Name : " + emp.getEmployeeName());
		System.out.println("Age : " + emp.getAge());
		System.out.println("Department : " + emp.getDeptId());
		System.out.println("*****************************************************************************************");

//		8. Find out the average and total salary of the organization?

		DoubleSummaryStatistics summary = employeeList.stream()
				.collect(Collectors.summarizingDouble(empp -> empp.getSalary()));

		System.out.println("Total salary : " + summary.getSum());
		System.out.println("Avarage salary : " + summary.getAverage());
		System.out.println("*****************************************************************************************");

//		9. List down the employees of each department.

		Map<String, List<Employee>> employees1 = employeeList.stream()
				.collect(Collectors.groupingBy(empl -> empl.getDeptId()));

		employees1.forEach((k, v) -> System.out.println(k + " - " + v));
		System.out
				.println("**************************************gg***************************************************");

//		10. Find out the highest experienced employees in the organization.

		Employee highExp = employeeList.stream().sorted(Comparator.comparingInt(empp -> empp.getYearOfJoining()))
				.findFirst().get();
		System.out.println("Highest experienced employee is : " + highExp);
		System.out.println("*****************************************************************************************");

//		11. Find out the second highest salary.

		Employee highSal = employeeList.stream()
				.sorted(Comparator.comparingDouble(empp -> ((Employee) empp).getSalary()).reversed()).skip(1)
				.findFirst().get();
		System.out.println("Highest second salary employee is : " + highSal);
		System.out.println("*****************************************************************************************");

//		12. Find out the highest salary of all departments in organization?

		Map<String, Employee> topEmployees = employeeList.stream()
				.collect(Collectors.toMap(employ -> employ.getDeptId(), e -> e,
						BinaryOperator.maxBy(Comparator.comparingDouble(empl -> empl.getSalary()))));

		topEmployees.forEach((k, v) -> System.out.println(k + " - " + v));
		System.out.println("*****************************************************************************************");

//		13. Sort stream of objects by multiple fields.

//		Comparator<Employee> compareByName = Comparator.comparing(Employee::getEmployeeName)
//				.thenComparing(Employee::getSalary);
//
//		System.out.println("compareByName " + compareByName);

//		List<Employee> sortedEmployees1 = employeeList.stream()
//				.sorted(Comparator.comparing(Employee::getEmployeeName).thenComparing(Employee::getSalary))
//				.collect(Collectors.toList());
//
//		System.out.println("sortedEmployees1 " + sortedEmployees1);

		List<Employee> sortedEmployees = employeeList.stream()
				.sorted(Comparator.comparing((Employee emp1) -> emp1.getEmployeeName())
						.thenComparing((Employee emp1) -> emp1.getSalary()))
				.collect(Collectors.toList());

//		14. Sort stream of objects by single field.

//		List<Employee> sortedEmployees1 = employeeList.stream()
//				.sorted(Comparator.comparing((Employee emp2) -> emp2.getEmployeeName())).collect(Collectors.toList());
//
//		System.out.println("sortedEmployees1 " + sortedEmployees1);

		System.out.println("sortedEmployees " + sortedEmployees + "\n");

		sortedEmployees.forEach(System.out::println);

		System.out.println("*****************************************************************************************");

		Optional<String> optional = Optional.ofNullable(null);

		System.out.println(optional);

		System.out.println("*****************************************************************************************");

		Map<String, Optional<Employee>> departmenaltExperiencedPeople = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.maxBy((a, b) -> Integer.compare(a.getYearOfJoining(), b.getYearOfJoining()))));

		departmenaltExperiencedPeople
				.forEach((k, v) -> System.out.println("Depart : " + k + "\nEmployee : " + v.get() + "\n"));

		System.out.println("*****************************************************************************************");

		Map<String, Optional<Employee>> secHighEmpInDept = employeeList.stream()
				.collect(Collectors.groupingBy(empp -> empp.getDeptId(),
						Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
								.sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst())));
		secHighEmpInDept.forEach((k, v) -> System.out.println("Depart : " + k + "\nEmployee : " + v.get() + "\n"));
	}

}
