package com.kh;

public class Operator {

	public static void main(String[] args) {
		
		// 1) ���������ڰ� �ܵ����� ���� ��� : ���� ����������, ���� ����������
		int x = 1;
		int y = 1;
		
		++x;
		y++;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// ���������ڰ� �ܵ����� ���� ���� �����ڸ� �տ� ���̵�, �ڿ� ���̵� �������.
		
		// 2) ���������ڰ� ���Ŀ� ������ ��.
		// 	  ���� ���������� : �ڱ��ڽ��� ������ �� �Ŀ� ����.
		//	  ���� ���������� : �Ŀ� ������ �� �ڱ��ڽ��� ����.
		
		int i = 1;
		int j = 1;
		
		int m = ++i + 1; // �ڱ��ڽ��� ������ �� (i -> 2) �Ŀ� ���� : 2 + 1 = 3
		int n = j++ + 1; // �Ŀ� ���� ������ �� (1 + 1 = 2) �ڱ��ڽ��� ����. (j -> 2)
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.printf("i = %d, j = %d \n", i, j);

	}

}
