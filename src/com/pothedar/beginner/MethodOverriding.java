package com.pothedar.beginner;

class A1{
	void show() {
		System.out.println("this is show from parent");
	}
}

class B1 extends A1{
	@Override
	void show() {
		System.out.println("This is show from child B"); // this is method overriding
	}
}

class C extends A1{
	void show() {
		System.out.println("This is show from child C");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		A1 b = new B1();
		b = new C(); //This is dynamic method dispatch, because this is assigned during the runtime
		b.show();
	}
}
