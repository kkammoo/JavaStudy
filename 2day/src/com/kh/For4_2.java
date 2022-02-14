package com.kh;

public class For4_2 {

	public static void main(String[] args) {
		// 4행 4열 오름차순 모양의 * 찍기
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // i값에 따라 반복 수행 횟수 증가
			}
			System.out.println(); // 줄 바꿈
		}

	}

}
