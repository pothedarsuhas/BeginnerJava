package com.pothedar.beginner;

final class X{		// a final class cant be extended
	public final void show() {		// a final method cant be overridden 
		System.out.println("this is class X");
	}
}

//class Y extends X{
////	@Override
////	public void show() {
////		System.out.println("this is class Y");
////	}
//	
//	public void see() {
//		System.out.println("this is in class Y");
//	}
//}


public class Final {
	
	public static void main(String[] args) {
//		Y y = new Y();
		final int i =1;
//		i = 2;	//a final variable cant be changed
		System.out.println(i);
	}
}
