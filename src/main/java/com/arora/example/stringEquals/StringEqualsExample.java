package com.arora.example.stringEquals;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = "hello";

		// Comparing string content
		System.out.println(str1.equals(str2));    // true - same content
		System.out.println(str1 == str2); 	     // true (same reference from String Pool)
		System.out.println(str1.equals(str3));  // true - same content, different object
		System.out.println(str1.equals(str4)); // false - case-sensitive comparison
		System.out.println("Check : " + (str1 == str3)); // false - because of operator(==) refers reference

		System.out.println("********************************************");

		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println("Hashcode of sb1 : " + sb1.hashCode());

		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("Hashcode of sb2 : " + sb2.hashCode());

		System.out.println("String buffer : " + (sb1.equals(sb2)));

		System.out.println("********************************************");

		String s1 = new String("Deepak");
		String s2 = new String("Deepak");

		System.out.println("String object : " + s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println("Hashcode of s1 : " + s1.hashCode() + " " + "Hashcode of s2 : " + s2.hashCode());

		System.out.println("********************************************");

		String st1 = "Hello"; // Stored in String Pool
		String st2 = "Hello"; // Reuses "Hello" from String Pool

		String st3 = new String("Hello"); // Creates a new object in Heap

		// Comparisons
		System.out.println(st1 == st2); // true (same reference from String Pool)
		System.out.println(st1 == st3); // false (different references)
		System.out.println(st1.equals(st3)); // true (same content)

		System.out.println("Hashcode of st1 : " + st1.hashCode() + " " + "Hashcode of st3 : " + st3.hashCode());

		System.out.println("********************************************");

		String imt = " xgy hsd ";
		System.out.println("IMT : " + imt.length());
		System.out.println("Hashcode of imt : " + imt.hashCode());
		imt = imt.trim();
		System.out.println("IMT : " + imt.length());
		System.out.println("IMT : " + imt);
		System.out.println("Hashcode of imt : " + imt.hashCode());

		System.out.println("********************************************");

		String name = "Deepak";
		String sName = " Patil";

		String fName = name + sName;

		System.out.println("Full Name : " + fName);

		fName = name.concat(sName);

		System.out.println("Full Name : " + fName);

	}

}
