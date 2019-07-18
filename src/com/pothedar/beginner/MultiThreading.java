package com.pothedar.beginner;

class Worker extends Thread{
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

class Helper extends Thread{
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

public class MultiThreading {
	public static void main(String[] args)  {
		Worker w = new Worker();
		Helper h = new Helper();
		
		w.start();
		h.start();
	}
}
