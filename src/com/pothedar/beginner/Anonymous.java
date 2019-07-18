package com.pothedar.beginner;

class Parent{
	void show() {
		System.out.println("this is parent class");
	}
}

//class Child extends Parent{
//	@Override
//	void show() {
//		System.out.println("this is a child class");
//	}
//}

interface Par{ //  this is called functional interface since it has only one abstract method definition
	void show();
}

public class Anonymous {
	public static void main(String[] args) {
//	Child c = new Child();
//	c.show();
		
		Parent p = new Parent()
				{			//this is the anonymous class and is used only once instead of the Child class
					public void show() {
						// TODO Auto-generated method stub
						System.out.println("This is from the anonymous class");
					}
				};
		p.show(); //this is the after method override
		
		Par par = ()->System.out.println("This is from the anonymous class from the interface implementation"); // this is the example of a lambda function
		par.show(); //This is from the anonymous class from the interface implementation
		
}
}


//there are 3 type of interfaces

//1 normal -- means n number of abstract method declarations can be done
//2 functional -- means only one abstract declaration, labda functions can be used here only
//3 marker -- means no abstract method declaration
// all the above can have n number of default methods and static methods