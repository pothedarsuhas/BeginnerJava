package com.pothedar.beginner;

public class ExceptionHandling  {
	public static void main(String[] args) {
		int p = 7;
		int q = 0;
		try {
		float r = p/q;
		System.out.println(r);
		}
		catch(Exception e) {
			System.out.println("This is an exception");
		}
		finally {
			System.out.println("all resources need to be closed here");
		}
//		float r =p/q;
//		System.out.println(r);
		
	}
}


//to be continued