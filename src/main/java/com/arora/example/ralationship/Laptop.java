package com.arora.example.ralationship;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JPA_LAPTOP")
public class Laptop {

	@Id
	private int laptopId;
	private String modelNumber;
	private String brand;

	@OneToOne
	@JoinColumn(name = "studentId")
	private Student student;
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelNumber=" + modelNumber + ", brand=" + brand + "]";
	}

}