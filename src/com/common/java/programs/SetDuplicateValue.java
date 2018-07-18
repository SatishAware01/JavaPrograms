package com.common.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class SetDuplicateValue {

	public static void main(String[] args) {


		HashSet<String> hs = new HashSet();

		hs.add("Satish");
		hs.add("Satish");

		ArrayList<String> al = new ArrayList(10);
		System.out.println("Size of Arraylist : "+al.size());

		al.add("Satish Aw");
		al.add("Satish Aware");
		al.add("pune");
		al.add("Mumbai");
		System.out.println("Insertion order : "+al);

		Vector<String> vect = new Vector();
		vect.add("A");
		System.out.println("Default Capacity of Vector : "+vect.capacity());
	}

}
