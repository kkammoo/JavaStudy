package com.kh;

public class For1 {

	public static void main(String[] args) {
		// 기본 예제
//		int i;
//		for (i = 10; i >= 1; i = i - 1) {
//			System.out.println(i);
//		}
//		
//		System.out.println(i);

		// 무한반복문
//		int i = 0;
//		for (; true; ) {
//			System.out.println(i++);
//		}

		// 구구단 2단
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("2 x " + i + " = " + 2 * i);
//		}
		
		// 구구단 단수 조정
		int dansu = 4;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dansu + " x " + i + " = " + dansu * i);
		}

	}
}