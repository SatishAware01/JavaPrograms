package com.common.java.programs;
import java.util.HashMap;
import java.util.Map;
public class HashMapDuplicateKey {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap();
		hm.put("Name","Satish");
		hm.put("Name","Aware");// IF duplicate key, override the latest one.
		hm.put("Roll","06");
		hm.put("Address","Pune");//Duplicate values are allowed.
		hm.put("","Pune");
		hm.put("","Maharashtra");
		//hm.put("Address","");Address will Blank
System.out.println(hm);

for(Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
}

	}
}
