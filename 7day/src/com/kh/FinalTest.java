package com.kh;

public class FinalTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num); // �ʱⰪ 10 ���
		num = 20;
		System.out.println(num); // ���Ҵ�� 20 ���
		
		final int NUM = 30;
		System.out.println(NUM); // �ʱⰪ 30 ���
//		NUM = 40; // final�� ���ǵ� ���� ������ �� ����.
//		final ��� : �Ҵ�� ���� �ٲ��� �ʰ� ����. ���� �̸��� �빮�ڷ� �ۼ��ϴ� ���� ����.
		
		int round = 5;
		final double PI = 3.14;
		System.out.println(round * round * PI);
		
		
	} // end of main
} // end of class
