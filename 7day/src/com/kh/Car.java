package com.kh;

public class Car {
	// �ʵ�
	private static int count; // Ŭ����(����) ��� �ʵ�
	private int count2;
	private String color; 		// ��ü(�ν��Ͻ�) ��� �ʵ�
	
	//������
	public Car() {
		count++;
		count2++;
	}
	
	public Car(String color) {
		this.color = color;
		count++;
		count2++;
	}
	
	// �޼ҵ�
	public void run() { // �ν��Ͻ� ��� �޼ҵ�
		System.out.println("�޸���");
	}
	
	// �޼ҵ� static ���� ����
	public static int getCount() { 
		return count;
	// �ʵ忡 count�� static���� ���ǵǾ� �ֱ� ������ �̸� �ҷ����� ���ؼ� �޼ҽ��� static�� ����Ѵ�.
	}
	
	public int getCount2() {
		return count2;
	}
	
}
