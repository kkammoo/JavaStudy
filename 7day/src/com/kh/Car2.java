package com.kh;

public class Car2 {
	// �ʵ�
	int maxSpeed;				// ��ü(�ν��Ͻ�) ��� �ʵ� : ��ü�� ������ �ҷ��� �� �ִ�.
	static int count;		// Ŭ����(����) ��� �ʵ� : ��ü�� ������ �ʾƵ� �ҷ��� �� �ִ�.
	int count2;
	
	//������
	public Car2() {
		count++;
		count2++;
	}
	
	// �޼ҵ�
	int getMaxSpeed() { // ��ü(�ν��Ͻ�) ��� �޼ҵ�
		return maxSpeed;
	}
	
	static int getCount() { // Ŭ����(����) ��� �޼ҵ�
		return count;
	}
	
	int getCount2() { 
		return count2;
	}
}
