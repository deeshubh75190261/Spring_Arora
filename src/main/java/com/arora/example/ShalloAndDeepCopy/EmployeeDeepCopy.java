package com.arora.example.ShalloAndDeepCopy;

public class EmployeeDeepCopy implements Cloneable {

	private String name;
	private int age;
	private Company company;

	public EmployeeDeepCopy(String name, int age, Company company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}

//	TODO Use Copy Constractor
	public EmployeeDeepCopy(EmployeeDeepCopy e) {
		this.name = e.name;
		this.age = e.age;
		Company company = new Company(e.getCompany().getName());
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Company c1 = new Company("ABC_COMPANY");
		EmployeeDeepCopy e1 = new EmployeeDeepCopy("Deepak", 30, c1);

		System.out.println("Employee  e1 company name = " + e1.getCompany().getName());

		EmployeeDeepCopy e2 = new EmployeeDeepCopy(e1);
		System.out.println("Employee  e2 company name = " + e2.getCompany().getName());

		System.out.println("************************");

		e2.getCompany().setName("XYZ_COMPANY");
		System.out.println("Employee  e1 company name = " + e1.getCompany().getName());
		System.out.println("Employee  e2 company name = " + e2.getCompany().getName());

	}

}
