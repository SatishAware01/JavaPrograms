package com.javaPrograms.strings;

public class CallerClass {
	public static void main(String args[])
	{
		MainClass obj1 = new MainClass();

		ChildClass obj2 = new ChildClass();

		MainClass obj3 = new ChildClass();

		System.out.println("MainClass obj1 = new MainClass() \n output :");
		obj1.m1();
		obj1.m2();
		obj1.m3();

		System.out.println("ChildClass obj2 = new ChildClass() \n output :");
		obj2.m1();
		obj2.m2();
		obj2.m3();
		obj2.m4();
		obj2.m5();

		System.out.println("MainClass obj3 = new ChildClass() /n Output:");
		obj3.m1();
		obj3.m2();
		obj3.m3();


	}

}
