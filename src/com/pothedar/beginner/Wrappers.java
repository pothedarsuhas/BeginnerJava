package com.pothedar.beginner;

public class Wrappers {
	public static void main(String[] args) {
	Integer i = 2; //this is autboxed and auto unboxed, the old methods for setting and getting are deprecated
	 
	 System.out.println(i);
	 
	 String s = "123";
	 int j = Integer.parseInt(s); //parsing automatically to other object type
	 System.out.println(j);
			 
}
}
