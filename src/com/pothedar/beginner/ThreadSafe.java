package com.pothedar.beginner;

class Counter implements Runnable{
	int count = 0;
	
	public synchronized void run() { //synchronized and the thread.join() ensures the thread safety
		for(int i=0;i<=999;i++) {
			count = count+1;
		}
	}
	
	public int getCount() {
		return count;
	}
}

public class ThreadSafe {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		//Thread.sleep(10); //this gives checked exception which always forces us to add the exception handling code
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.getCount());
		
	}
}
