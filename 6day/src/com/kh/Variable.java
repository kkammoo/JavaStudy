package com.kh;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println(sum(1));
		System.out.println(sum(1, 2)); // public static int sum(int num1, int num2) �޼ҵ� ���
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4));
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(1, 2, 3, 4, 5, 6));
		

	}
	
	public static int sum(int num1, int num2) {
		System.out.println("public static int sum(int num1, int num2) ȣ���!");
		return num1 + num2; // int�� �Ű����� 2���� �޴� �޼ҵ�
	}
	
	// �������� : �Ű����� ������ ������ ���� ���� ���. (int�� �Ű����� 1�� �̻�)
	public static int sum(int ... numbers) {
		System.out.println("public static int sum(int ... numbers) ȣ���!");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
//	public static int sum(int[] numbers) { // public static int sum(int ... numbers) ������ �ǹ��̱� ������ �ߺ� ������ ���.
//		
//	}
		
}

// �޼ҵ��� ������ ȣ�⿡ ������ ���� �ʴ´�.