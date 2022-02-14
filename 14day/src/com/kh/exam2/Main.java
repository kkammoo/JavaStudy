package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		// 이름 있는 클래스 이용
		ThreadA threadA = new ThreadA("A");
		ThreadB threadB = new ThreadB("B");
		
		threadA.start();
		threadB.start();
		
		
		// 익명 클래스 이용
		Thread threadC = new Thread("C") {
			@Override
			public void run() {
				for (int i = 21; i <= 30; i++) {
					System.out.println(getName() + ": " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		threadC.start();
		
		// 람다 표현식
		new Thread("D") {
			@Override
			public void run() {
				for (int i = 31; i <= 40; i++) {
					System.out.println(getName() + ": " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		// 메인 스레드 이름 가져오기
		System.out.println(Thread.currentThread().getName() + ": 메인스레드");
		
		
		
	} // end of main

} // end of class