package com.java.assignmentsix.one;

public class Timer extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread("Timer");
		for (int i = 0; i < Long.SIZE; i++) {
			System.out.println(t.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
