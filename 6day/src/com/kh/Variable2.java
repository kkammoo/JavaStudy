package com.kh;

public class Variable2 {

	public static void main(String[] args) {
		
		// �迭�� ���ǵ� �޼ҵ� ����ϴ� ��
		System.out.println(sum(new int[] {1}));
		System.out.println(sum(new int[] {1, 2}));
		
		
		int[] values = {1, 2, 3};
		System.out.println(sum(values));
		
		int[] values2 = new int[] {1, 2, 3};
		System.out.println(sum(values2));
		

	}
	
//	public static int sum(int num1, int num2) {
//		System.out.println("public static int sum(int num1, int num2) ȣ���!");
//		return num1 + num2; // int�� �Ű����� 2���� �޴� �޼ҵ�
//	}
//	
//	// �������� : �Ű����� ������ ������ ���� ���� ���. (int�� �Ű����� 1�� �̻�)
//	public static int sum(int ... numbers) {
//		System.out.println("public static int sum(int ... numbers) ȣ���!");
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		return sum;
//	}
	
	public static int sum(int[] numbers) { // public static int sum(int ... numbers) ������ �ǹ��̱� ������ �ߺ� ������ ���.
		System.out.println("public static int sum(int[] numbers) ȣ���!");
		int sum = 0;
//		// �Ϲ� for��
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
		
		// ���� for�� (�Ű������� �迭�� ���)
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
		
}

// �޼ҵ��� ������ ȣ�⿡ ������ ���� �ʴ´�.