package com.kh;

import java.util.Scanner; // Scanner를 실행하기 위한 import

public class Gugudan {

	public static void main(String[] args) {

		//int dansu = 5;

		Scanner scanner = new Scanner(System.in); // 스캐너 실행문
		
		System.out.print("출력하고자 하는 단수를 입력하세요 : ");
		int dansu = Integer.parseInt(scanner.nextLine());
		
		//System.out.println(dansu);

		for (int i = 1; i <= 9; i++) {
			System.out.println(dansu + " x " + i + " = " + dansu * i);
		}

	}

}
