package com.common.java.programs;

public class MySingleton {
	static MySingleton instance = null;
    public int x = 10;
    // private constructor can't be accessed outside the class
    private MySingleton() {  }
    static public MySingleton getInstance()
    {
        if (instance == null)
             instance = new MySingleton();
        return instance;
    }

	public static void main(String[] args) {
		MySingleton a = MySingleton.getInstance();
	       MySingleton b = MySingleton.getInstance();
	       a.x = a.x + 10;
	       System.out.println("Hash Value of a = " + a.hashCode());
	       System.out.println("Hash Value of b = " + b.hashCode());
	       System.out.println("Value of a.x = " + a.x);
	       System.out.println("Value of b.x = " + b.x);
	}
}
