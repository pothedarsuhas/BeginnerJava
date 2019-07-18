package com.pothedar.beginner;

interface Gogh{ //in interface only abstract methods are allowed, body must not be specified
	void paint(); //by default these methods are public abstract even if we do not specify them explicitly
	void show() ;
//	{
//		System.out.println("this is an interface");
//	}
	public default void defaultMethod() {  //default methods can be used inside the interface in any number
		System.out.println("this is a default method and can be used inside the interface");
	}
	public default void defaultMethod2() {  //default methods can be used inside the interface in any number
		System.out.println("this is a default method and can be used inside the interface");
	}
}

class Davinci{
	void paint() {
		System.out.println("Boy davinci is a painter boy");
	}
}


class Vincent extends Davinci implements Gogh {
	@Override
	public void paint() {
		super.paint();
		System.out.println("The vincent van gogh paints");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("implementation of the method show");
	}
	
}


public class Interface {
	public static void main(String[] args) {
		Gogh v = new Vincent();  //we can use the reference of the interface and the constructor of the base class
		v.paint();
		v.show();
		v.defaultMethod();
		v.defaultMethod2();
		
		Vincent vin = new Vincent();
		vin.paint();
		
		Davinci d = new Vincent();
		d.paint();
	}
	
}
