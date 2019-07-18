package com.pothedar.beginner;

class TestForStatic{
	static int a; //when final keyword is used with static, it functions like a constant. Hence new keyword is not useful here
	
	static {		// static block can be used to init static members, this becomes active once class is loaded
		a = 3;
	}
	
	static {
		System.out.println("now static blocks follow sequence since there are more than one static blocks");
	}
	
	public void change() {
		a++;
	}
	
	public int getA() {
		return a;
	}
	
	public static String alpha() {
		return ("this is a static method and can be accessed with class name");
	}
}

public class StaticMembers {
	public static void main(String[] args) {
//		TestForStatic t = new TestForStatic(); // static variables are initialized at the time of loading the class
//		
//		TestForStatic t2 = new TestForStatic();
//		t.change();
//		System.out.println(t.getA()); 
//		t2.change();
//		System.out.println(t.getA()); // static variable belongs to a class and not to an object hence this behavior
//		of reusing the same variable
		// static members can be accessed with object as well as class names
		
//		System.out.println(TestForStatic.a);
		System.out.println(TestForStatic.alpha());
		
		//static members/methods can be used to save memory
		
		
		
		
		
	}
}
