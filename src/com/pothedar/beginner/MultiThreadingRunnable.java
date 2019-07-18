package com.pothedar.beginner;

class Work implements Runnable{ // Runnable interface does not contain start method
	@Override 
	public void run()  {
		for(int i=0; i<5;i++) {
			System.out.println("WORKER");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Help implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("HELPER");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MultiThreadingRunnable {
	public static void main(String[] args)  {
		Runnable w = new Work();
		Runnable h = new Help();
		
		Thread t1 = new Thread(w); //pass the object you want to run into the thread constructor
		Thread t2 = new Thread(h);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Hey Suhas");
		
		
	}
}
