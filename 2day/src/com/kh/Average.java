package com.kh;

import java.util.Scanner;

/* 
  국어, 영어, 수학 세 과목의 점수를 입력 받아서 평균 점수를 구하는 프로그램을 작성하시오.
 */

public class Average {

	public static void main(String[] args) {
		
		int sum = 0;		// 총점
		double avg = 0.0;	// 평균
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 세 과목의 점수를 입력 받아, 평균 점수를 구하는 프로그램 입니다.");
		System.out.print("국어점수 : ");
		int kor = Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(scanner.nextLine());
		
		sum = kor + eng + math;
//		avg = sum / 3; // 정수 나누기 정수이기 때문에 평균 값 역시 정수가 나온다.
		avg = (double)sum / 3; // 총점(sum)을 double형태로 형변환을 해주면 소수점 아래 수까지 나오게 된다.
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
