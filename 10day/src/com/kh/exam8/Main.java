package com.kh.exam8;

public class Main {

	public static void main(String[] args) {
		
		// ���ǵ� ���� Ŭ���� �ҷ�����
		RemoteControll rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		
		// �͸� �������̽�(�͸� ���� Ŭ����) ����
		RemoteControll rc2 = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("TV�� �Ѵ�");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV�� ����");
			}
		};
		rc2.turnOn();
		rc2.turnOff();
		
		
	}

}
