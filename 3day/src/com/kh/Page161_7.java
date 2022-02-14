package com.kh;

import java.util.Scanner;

public class Page161_7 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");

			int menuNumber = Integer.parseInt(scanner.nextLine());

			switch (menuNumber) {
			case 1:
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scanner.nextLine());
				break;

			case 2:
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;

			case 3:
				System.out.print("잔고 > ");
				System.out.println(balance);
				break;

			case 4:
				run = false;
				break;
			} // end of switch
			
		} // end of while
		
		System.out.println("프로그램을 종료합니다.");

	} // end of main

} // end of class
