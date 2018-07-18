package com.common.java.programs;

public class StringReversal {

public static void main(String[] args) {
		String str ="Satish Aware Pune";
		String fullString="";
		String revWord="";
		String temp="";
		String arr[] =str.split(" ");
		for(int i=0; i<=arr.length-1;i++)
		{
			revWord="";
			temp = arr[i];
			for(int j= temp.length()-1;j>=0;j--)
			{
				revWord = revWord + temp.charAt(j);
			}
			fullString= fullString + " " + revWord;
		}
		System.out.println("Reverse Word = " + fullString);
	}
}
