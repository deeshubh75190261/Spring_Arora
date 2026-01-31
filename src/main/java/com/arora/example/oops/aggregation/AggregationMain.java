package com.arora.example.oops.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationMain {

	public static class Department {

		private String dName;

		Department(String dName) {
			this.dName = dName;
		}

//		public void setDname(String dname) {
//			this.dName = dname;
//		}

		public String getDName() {
			return dName;
		}
	}

	public static class University {

		private String universityName;
		private List<Department> departments;

		University(String universityName) {
			this.universityName = universityName;
			this.departments = new ArrayList<>();
		}

		public void addDepartments(Department department) {
			departments.add(department);
		}

		public List<Department> getDepartment() {

			return departments;
		}

		public String getUniversityName() {
			return universityName;
		}

	}

	public static void main(String[] args) {

		Department math = new Department("maths");
		Department cs = new Department("cs");

		University university = new University("Shivaji University");

		university.addDepartments(cs);
		university.addDepartments(math);

		System.out.println("University name : " + university.getUniversityName());

		System.out.println("Size : " + university.getDepartment().size());

	}

}
