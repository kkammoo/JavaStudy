package com.kh.exam2;

public class ThreadB extends Thread {

	public ThreadB() {}

	public ThreadB(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 11; i <= 20; i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
