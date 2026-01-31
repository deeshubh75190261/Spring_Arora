package com.arora.example.serializeDeserialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", age= " + age + ", salary= " + salary + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(age);
//		out.writeUTF(name);
		out.writeInt(salary);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		age = in.readInt();
//		name = in.readUTF();
		salary = in.readInt();
	}

}
