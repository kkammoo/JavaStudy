package com.kh;

import java.util.Scanner;

/* 
  메뉴 : 1.총점 2.평균 3.종료 
  국어, 영어, 수학 세 과목의 점수를 입력 받아서 총점, 평균 점수를 구하는 프로그램을 작성하시오.
 */

public class Average2 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int sum = 0;		// 총점
		double avg = 0.0;	// 평균
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 세 과목의 점수를 입력 받아, 평균 점수를 구하는 프로그램 입니다.");
		
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.총점 | 2.평균 | 3.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.print("국어점수 : ");
				int sumkor = Integer.parseInt(scanner.nextLine());
				System.out.print("영어점수 : ");
				int sumeng = Integer.parseInt(scanner.nextLine());
				System.out.print("수학점수 : ");
				int summath = Integer.parseInt(scanner.nextLine());
				
				sum = sumkor + sumeng + summath;
				System.out.println("총점 : " + sum);
				break;
			case 2:
				System.out.print("국어점수 : ");
				int avgkor = Integer.parseInt(scanner.nextLine());
				System.out.print("영어점수 : ");
				int avgeng = Integer.parseInt(scanner.nextLine());
				System.out.print("수학점수 : ");
				int avgmath = Integer.parseInt(scanner.nextLine());
				
				sum = avgkor + avgeng + avgmath;
				avg = (double)sum / 3;
				System.out.println("평균점수 : " + avg);
				break;
			case 3:
				run = false;
				break;
			
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
