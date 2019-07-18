package com.pothedar.beginner;

class A{
	A() {
		System.out.println("this is constructor A()");
	}
	A(int i){
		System.out.println("this is constructor A(int i)");
	}
	void archimedis() {
		System.out.println("this is archimedes");
	}
}

class B extends A{
	B(){
		System.out.println("this is a constructor B()");
	}
	B(int i){
		super(i); // this will call the parameterized constructor, if we dont specify, default gets called
		super.archimedis(); // super can be used to invoke things from parent class as well
		System.out.println("this is a constructor B (int i)");
	}
}

public class Inheritance {
	public static void main(String[] args) {
//		B b = new B(2);

	}
}
