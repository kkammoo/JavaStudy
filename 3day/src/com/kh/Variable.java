package com.kh;

public class Variable {

	public static void main(String[] args) {
		int x; // ���� ���� - local Variable (���� ���� : �޼ҵ� ���� �ȿ��� ����� ����)
		x = 100; // �ʱ�ȭ : ���� ���� �� ���� ���� �Ҵ��ϴ� ����
		System.out.println(x); // ������ ���� �Ҵ����� ������ ������ ������ ���.

		x = 200; // ���Ҵ�
		System.out.println(x); // ���Ҵ�� 200�� ��µȴ�.

		int y; // ���� ����
		y = x; // x�� ���� �о y������ �ʱ�ȭ - ���� �� ����
		System.out.println(y);

		int z; // ���� ����
		z = x + y; // ������ ���� ����� ǥ���ĵ� �� �� �ִ�.
		System.out.println(z);

		int k; // ���� ����
		k = sum(x, y);  // ��� �ܺο� �ִ� �޼ҵ忡�� ���� �����´�.
		System.out.println(k);
		
		int j;
		j = sum(z, k);
		System.out.println(j);
		
		int num1;  // intMethod, doubleMethod�� num1 ������ ������ ����� �ٸ��� ������ ���� �ٸ� ������ �ν��Ѵ�.
		num1 = 10;
		System.out.println(num1);

	} // end of mainMethod

	// �޼ҵ� ����
	public static int sum(int num1, int num2) { // ��ǲ
						  // �޼ҵ带 �ҷ��� �� �������� ����, ������ Ÿ���� ��ġ�ؾ� �Ѵ�.
		System.out.println("sum(int num1, int num2) ȣ���.");
		int result = num1 + num2;
		// ��ȯ�ϴ� ���� �޼ҵ��� Ÿ���� ��ġ�ؾ� �Ѵ�.
		return result; // �ƿ�ǲ
	} // end of intMethod
	
	public static double sum(double num1, double num2) {
		
		System.out.println("sum(double num1, double num2) ȣ���.");
		double result = num1 + num2;
		
		return result; // ������ Ÿ���� ��ġ���� �ʾƼ� �� �޼ҵ�� ������� �ʴ´�.
	} // end of doubleMethod
	
} // end of class
