package homework01;

import java.util.Scanner;

/*
 * 학생 점수 분석
 * 배열을 사용하여 학생 수만큼 점수를 입력받고 분석(최고득점, 최저득점, 평균)할 수 있는 프로그램을 작성하시오
 */

public class Ques1_If {

	public static void main(String[] args) {

		boolean run = true;

		int studentNum = 0;
		int[] score = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("학생 수만큼 점수를 입력받고 분석(최고득점, 최저득점, 평균)할 수 있는 프로그램입니다.");
		System.out.println();

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("원하는 메뉴 번호를 입력하십시오.");
			System.out.print("입력 > ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			if (menuNum == 1) {
				System.out.println();
				System.out.println("학생 수를 입력하십시오.");
				System.out.print("입력 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];
				System.out.println();

			} else if (menuNum == 2) {
				System.out.println();
				System.out.println("점수를 입력하십시오");

				for (int i = 0; i < score.length; i++) {
					System.out.print("학생" + (i + 1) + " 점수 : ");
					score[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println();

			} else if (menuNum == 3) {
				System.out.println();
				System.out.println("점수 리스트");

				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "] : " + score[i]);
				}
				System.out.println();

			} else if (menuNum == 4) {
				System.out.println();
				System.out.println("분석");

				int max = score[0];

				for (int i = 1; i < score.length; i++) {
					if (score[i] > max) {
						max = score[i];
					}
				}
				System.out.println("최고점수 = " + max + "점");

				int min = score[0];

				for (int i = 1; i < score.length; i++) {
					if (score[i] < min) {
						min = score[i];
					}
				}
				System.out.println("최저점수 = " + min + "점");

				int sum = 0;

				for (int i = 0; i < score.length; i++) {
					sum += score[i];
				}
				System.out.println("평균점수 = " + ((double) sum / studentNum) + "점");

			} else { // menuNum == 5
				run = false;

			}

		} // end of while

		System.out.println();
		System.out.println("프로그램이 종료되었습니다.");
	} // end of main

} // end of class