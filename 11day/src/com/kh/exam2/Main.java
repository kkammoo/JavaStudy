package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		// �̸��� �ִ� ����Ŭ������ ���
		RemoteControll rc = new Tv();
		rc.turnOff();
		((Tv)rc).turnOn(); // ���� ����ȯ�� �̿�
		
		
		// �͸� ����Ŭ���� ���
		RemoteControll rc2 = new RemoteControll() {
			@Override
			public void turnOff() {
				System.out.println("Tv�� ����2");
				turnOn();
			}
			// �͸� ����Ŭ���� ���ο��� ���Ӱ� ���ǵ� �ʵ� Ȥ�� �޼ҵ�� ���ο����� ��� �����ϴ�.
			private void turnOn() {
				System.out.println("Tv�� �Ѵ�2");
			}
		};
		rc2.turnOff();
//		rc2.turnOn(); ��� �ٱ����� �ش� �޼ҵ带 �ҷ��� �� ����.
	}
}
