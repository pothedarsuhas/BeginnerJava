package com.pothedar.beginner;

class ObjectUsage{
	@Override
	public String toString() {
		return "ObjectUsage [a=" + a + ", b=" + b + "]";
	}
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}

public class ThisKeyword {
	public static void main(String[] args) {
		ObjectUsage o = new ObjectUsage();
		o.setA(10);
		o.setB(20);
		System.out.println(o.toString());
	}

	
}
//	java is designed in such a way that you can have only one public class with the main method,
//  just for the sake of organizing