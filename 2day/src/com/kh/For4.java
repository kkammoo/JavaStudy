package com.kh;

public class For4 {

	public static void main(String[] args) {
		// 4행 4열 모양의 * 찍기
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*"); // i값 하나 당 작업을 4회 수행
			}
			System.out.println(); // *을 4개 찍고난 뒤 줄 바꿈
		}

	}

}
