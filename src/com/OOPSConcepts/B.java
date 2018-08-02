package com.OOPSConcepts;

public class B extends A{
	public static void main(String args[])
	{

	A a = new A();
	a.i=20;
	System.out.println("syso1 : "+A.i);
	a.i = 30;
	A b = a;
	System.out.println("syso2 : "+A.i);
	System.out.println("syso3 : "+a.i);

	b.i=50;

	System.out.println("after clone A: "+a.i);
	System.out.println("after clone B: "+b.i);

	}

}
