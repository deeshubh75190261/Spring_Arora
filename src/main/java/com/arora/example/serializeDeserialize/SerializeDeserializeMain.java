package com.arora.example.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeDeserializeMain {

	public static void main(String[] args) {

		Employee emp = new Employee("Deepak", 29, 45000);

		String filePath = "E:\\Projects\\SerialDeserial.txt";

//		Serialization Start

		try {

			System.out.println("Serialization Start");

			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutput oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);

			fos.close();
			oos.close();

			System.out.println("Employee object is serialized :" + emp);
			System.out.println("Serialization End");

		} catch (IOException e) {
			System.out.println(e);
		}

//		 De-serialization Start

		try {

			System.out.println("De-serialization Start");

			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee seriEmp = (Employee) ois.readObject();

			System.out.println("Employee object is De-serialized :" + seriEmp);
			System.out.println("De-serialization End");

			fis.close();
			ois.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
