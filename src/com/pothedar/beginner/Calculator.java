package com.pothedar.beginner;

public class Calculator {
	
//	there is a default constructor here
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public double div(int a, int b) {
		return a%b;
	}
	public double exp(int a, int b) {
		return Math.pow(a, b);
	}
	
}