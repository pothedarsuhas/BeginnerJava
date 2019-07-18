package com.pothedar.beginner;


class TestForOverload{
	
	public void print() {
		System.out.println("test for overload");
	}
	public void print(String str) {
		System.out.println("Overload succeeded "+str);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		TestForOverload t = new TestForOverload();
		t.print();
		t.print("Suhas!");
	}
}
