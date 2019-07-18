package com.pothedar.beginner;

public class StaticVsMain {
	
	public static void main(String[] args) {
		System.out.println("I think static is the hero");
	}
	
	static {
		System.out.println("Hello heroes");
	}
	
	// no matter what the order of the static, main blocks are the static is executed first, even if they are reversed
	// interesting thing is that the static block can execute on its own even in the presence of the main since, this becomes alive
	// once the class is loaded
	//another thing to notice is that static block trumps over main even though both the methods/blocks are static
}
