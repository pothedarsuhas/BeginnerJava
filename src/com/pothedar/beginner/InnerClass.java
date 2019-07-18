package com.pothedar.beginner;

class Outer{
	int a;
	void show() {
		System.out.println("This is an outer class");
	}
	
	class Inner{
		void show() {
			System.out.println("This is inner class");
		}
	}
	
	static class InnerStatic{
		void show() {
			System.out.println("This is inner static method");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.show();
		
		Outer.Inner i = o.new Inner();
		i.show();
		
		Outer.InnerStatic in = new Outer.InnerStatic(); //here no object is needed to invoke this, although you can use object too 
		in.show();
		
	}
	
}
