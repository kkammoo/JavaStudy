package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		// 1~10���� ����ϴ� ���� �帧 ���� : ù ��° for���� ������ �� ��° for���� ����.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// ��Ƽ ������
		Runnable taskA = new TaskA();
		Thread	threadA = new Thread(taskA);
		threadA.start();

		Runnable taskB = new TaskB();
		Thread threadB = new Thread(taskB);
		threadB.start();
		
		
		// �͸� ��ü ����
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
		
		// ��ü ���� ����
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
		
		// ���� ǥ����, �Լ��� ���α׷���
		// Thread�� �Ű������� Runnable ��ü�� ����, Runnable���� run() �޼ҵ常 �ֱ� ������ �����ص� �ν��Ѵ�.
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
