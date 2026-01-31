package com.arora.example.ShalloAndDeepCopy;

public class EmployeeShalloCopy implements Cloneable {

	private String name;
	private int age;
	private Company company;

	public EmployeeShalloCopy(String name, int age, Company company) {
		this.name = name;
		this.age = age;
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
		
//		In shalloCopy only the object’s reference is copied not the entire object itself.

		Company c1 = new Company("ABC_COMPANY");
		EmployeeShalloCopy e1 = new EmployeeShalloCopy("Deepak", 30, c1);

		System.out.println("Employee  e1 company name = " + e1.getCompany().getName());

		EmployeeShalloCopy e2 = (EmployeeShalloCopy) e1.clone();
		System.out.println("Employee  e2 company name = " + e2.getCompany().getName());

		System.out.println("************************");

		e2.getCompany().setName("XYZ_COMPANY");
		System.out.println("Employee  e1 company name = " + e1.getCompany().getName());
		System.out.println("Employee  e2 company name = " + e2.getCompany().getName());

	}

}
