package com.kh;

public class Car2Main {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		System.out.println(c1.getCount());
		System.out.println(c1.getCount2());
		
		Car2 c2 = new Car2();
		System.out.println(c2.getCount());
		System.out.println(c2.getCount2());

		Car2 c3 = new Car2();
		System.out.println(c3.getCount()); // static�� ���� �����ϱ� ������ ��ü�� ������ ������ 1�� �����ؼ� ���� 3�� ��.
		System.out.println(c3.getCount2()); // ��ü �ʵ�� ��ü �������� �߰��� �����Ǳ� ������ ��� 1�� ����.
		
		
		///////////////////////////////////////////////
		
		System.out.println(Car2.count); // Ŭ���� �ʵ� ���� ��ü ���� ���� �ҷ��� �� �ִ�.
//		System.out.println(Car2.maxSpeed); // ��ü �ʵ� ���� ��ü�� �����ؾ��� �ҷ��� �� �ִ�.
		System.out.println(c1.maxSpeed);
		
		
		Car2.getCount(); // �޼ҵ� ���� �ʵ�� ���������� Ŭ���� �޼ҵ�� ��ü���� ��� �ҷ��� �� �ִ�.
//		Car2.getMaxSpeed(); // ��ü �޼ҵ�� ��ü�� �����ؾ� �ҷ��� �� �ִ�.
	}

}
