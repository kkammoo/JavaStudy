package com.kh;

public class Array1 {

	public static void main(String[] args) {
		
		int[] array; // ������ 1���� �迭 ����.
		array = new int[3]; // �迭 ����
		
		array = new int[4]; // �迭 ���Ҵ�.
		
		
		int[][] array2 = new int[3][2]; // ������ 2���� �迭 ����, �ʱ�ȭ
		
		System.out.println(array2);
		System.out.println(array2.length);
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[2][0]);
		System.out.println(array2[2][1]);
		
	}

}