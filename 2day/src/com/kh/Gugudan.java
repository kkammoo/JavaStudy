package com.kh;

import java.util.Scanner; // Scanner�� �����ϱ� ���� import

public class Gugudan {

	public static void main(String[] args) {

		//int dansu = 5;

		Scanner scanner = new Scanner(System.in); // ��ĳ�� ���๮
		
		System.out.print("����ϰ��� �ϴ� �ܼ��� �Է��ϼ��� : ");
		int dansu = Integer.parseInt(scanner.nextLine());
		
		//System.out.println(dansu);

		for (int i = 1; i <= 9; i++) {
			System.out.println(dansu + " x " + i + " = " + dansu * i);
		}

	}

}
