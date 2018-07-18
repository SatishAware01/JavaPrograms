package com.javaPrograms.strings;

public class CompareToStringObjects {

	public static void main(String[] aa) {
		String s1="hello";
		String s2="hello";
		String s3=s2;
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

		System.out.println(" == output : "+(s1==s2)); //True
		System.out.println(" == output : "+(s1==s3)); // true

		System.out.println(" Equals output : "+(s1.equals(s3)));//True
		System.out.println(" Equals output : "+(s1.equals(s4))); //False
	}

}
