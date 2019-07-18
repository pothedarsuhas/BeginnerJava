package com.pothedar.beginner;

interface VincentVanGogh{
	void paint();
	public static void color() {  // static methods are allowed in the interface
		System.out.println("Blue");
	}
}

interface LeonardoDaVinci{
	void paint();
	}

class Painter implements VincentVanGogh, LeonardoDaVinci{ //this is a multilevel implementation problem hence implement the method to get rid of it
	public void brush() {
		System.out.println("Painter brushes");
	}
	@Override
	public void paint() {
		System.out.println("A painter paints");
	}
}

public class KillingMultilevelImplementationProblem {
	public static void main(String[] args) {
		Painter p = new Painter();
		p.paint();
		VincentVanGogh.color();
	}

}
