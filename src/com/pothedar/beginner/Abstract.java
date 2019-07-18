package com.pothedar.beginner;

abstract class Human{ //abstract classes can have method declarations and definitions as well but cant create objects
	public abstract void eat();
	public void walk() {
		System.out.println("humans can walk");
	}
}

class man extends Human{
	public void eat()  // if the method is not implemented in the subclass the subclass becomes abstract too
	{
		System.out.println("Man can eat");
	}
}

class woman extends Human{
	public void eat() {
		System.out.println("woman eats less");
	}
}

public class Abstract {
	public static void main(String[] args) {
		man m = new man();
		m.eat();
		woman w = new woman();
		w.eat();
//		Human h = new Human(); // cannot create object for an abstract class, only can extend and provide implementations and use it
	}
}
