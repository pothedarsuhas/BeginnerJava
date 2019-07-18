package com.pothedar.beginner;

class TestForVariableLengthArguments{
	void add(int ... i ) {
		int sum = 0;
		for (int j: i) 
			sum = sum + j;
		System.out.println(sum);
	}
}

public class VariableLengthArguments {
	public static void main(String[] args) {
		TestForVariableLengthArguments t = new TestForVariableLengthArguments();
		t.add(1,2,3,4,5,6,7,8,9);
	}
}
