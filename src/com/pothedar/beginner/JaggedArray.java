package com.pothedar.beginner;


public class JaggedArray {
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{2,3,4,5,6,7,8},
				{3,4,5}};
		for(int j[] : a) {
			for(int i : j) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		}

}
