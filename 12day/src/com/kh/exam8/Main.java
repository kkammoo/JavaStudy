package com.kh.exam8;

public class Main {

	public static void main(String[] args) {


		int age = 10; // age�� ������������, ��ü�� �ƴϱ� ������ age. �ص� �ƹ��� ����� ����� �� ����.

		
		
//		Integer age2 = new Integer(2); // java doc �� ���� Deprecated �Ǿ��ִ� �����ڶ�� ���´�.
		Integer age2 = 2; // Wrapper Ŭ������ ���ؼ� �̷��� ������ �����. ���� 2�� ��ü�� �ν��ϴ� ����. �ڽ�(Boxing)�̶�� �Ѵ�.

		//		age2.MAX_VALUE; // �ش� ��ü�� ���� �� �ִ� �ִ밪
		//		age2.MIN_VALUE; // �ش� ��ü�� ���� �� �ִ� �ּҰ�
		System.out.println(age2.MAX_VALUE); // 2147483647
		System.out.println(age2.MIN_VALUE); // -2147483648
		// integer�� -2147483648~2147483647 ������ �������� ���� �� �ִ�.

		
		System.out.println(age2.toString()); // ���� 2�� ���ڿ� "2"�� ��ȯ
		
		
		System.out.println("==============");
		
		Integer age3 = age; // �������� age�� ��(10)�� ��üȭ
		
		int age10 = age3; // ��ü age3�� ��ü�� 10�� �⺻Ÿ�� int�� �������� age10�� ������ ���. ��ڽ�(Unboxing)�̶�� �Ѵ�.
		
		
		System.out.println("==============");
		System.out.println("Math Ŭ����");
		
		int radius = 5;
		double result = radius * Math.PI; // Math.PI�� ������ 3.14... �� ��Ÿ���� �޼ҵ�
		System.out.println(result);
		
		
	}

}
