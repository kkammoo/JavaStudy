package com.kh;

public class For2_1 {

	public static void main(String[] args) {
		
		// 다중 for문 (for문 안에 또다른 for문을 만들어서 추가 분기를 생성)
		// 구구단 2~9단을 한 번에 만들기
		
		int startDansu = 2;
		int endDansu = 9;
		
		// if문을 추가하여 홀수단만 출력. (짝수도 마찬가지)
		// continue : break는 해당 조건이 거짓(false)일 경우 구문을 끝내는 것이지만, continue는 해당 조건이 거짓일 경우 그 조건을 건너 뜀.
		for (int i = startDansu; i <= endDansu; i++) {
			
			if (i % 2 == 0) {
				continue;
			}
			
			System.out.println("===" + i + "단 출력 ===");

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}

}