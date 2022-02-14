package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		// 1~10까지 출력하는 단일 흐름 생성 : 첫 번째 for문이 끝나고 두 번째 for문이 시작.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// 멀티 스레드
		Runnable taskA = new TaskA();
		Thread	threadA = new Thread(taskA);
		threadA.start();

		Runnable taskB = new TaskB();
		Thread threadB = new Thread(taskB);
		threadB.start();
		
		
		// 익명 객체 생성
		Thread threadC = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 31; i <= 40; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadC.start();
		
		// 객체 생성 없이
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 41; i <= 50; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		// 람다 표현식, 함수형 프로그래밍
		// Thread의 매개변수는 Runnable 객체가 오고, Runnable에는 run() 메소드만 있기 때문에 생략해도 인식한다.
		new Thread(()->{
			for (int i = 51; i <= 60; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
