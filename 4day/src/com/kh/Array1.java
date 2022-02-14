package com.kh;

public class Array1 {

	public static void main(String[] args) {

		// 배열 생성 : 값을 직접 지정. new 사용
		int[] score = new int[3];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// 배열 생성2 : 값을 알고 있을 경우. {} 사용
		int[] score2 = { 10, 20, 30 };

		for (int i = 0; i < score2.length; i++) {
			System.out.println(score2[i]);
		}

		// 배열 생성2의 방식은 무조건 한 줄에 작성해야 한다. + 2줄로 작성하는 방법
//		int[] score3;
//		score3 = { 10, 20, 30 };
		
		int[] score3;
		score3 = new int[]{ 10, 20, 30 };

		// 배열 생성 1의 방식은 선언과 생성을 따로 할 수 있음.
		int[] score4; 			 // 배열 선언
		score4 = new int[3]; // 배열 생성

		// 배열 생성3
		int[] score5 = new int[]{ 10, 20, 30 };
		
		for (int i = 0; i < score5.length; i++) {
			System.out.println(score5[i]);
		}
	}

}