package com.kh;

public class Array1 {

	public static void main(String[] args) {
		
		int[] array; // 정수형 1차원 배열 선언.
		array = new int[3]; // 배열 생성
		
		array = new int[4]; // 배열 재할당.
		
		
		int[][] array2 = new int[3][2]; // 정수형 2차원 배열 선언, 초기화
		
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
