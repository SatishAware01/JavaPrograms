package com.javaPrograms.strings;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add(null);
		cars.add(null);
		cars.add(null);
		cars.add(null);

		cars.add("Satish");
		cars.add("");
		cars.add("");
		cars.add("Aware");
		cars.add(null);
		cars.add("");

		cars.remove("");
		cars.remove(null);
		System.out.println("Added null and blank many times in HashSet : "+cars);
	}

}
