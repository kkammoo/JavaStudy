package com.kh;

public class For3 {

	public static void main(String[] args) {
		// for문, if문 활용

		// 1~50까지의 합을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;
		}
		System.out.println("1~50까지의 합 : " + sum);

		// 1~50까지의 숫자 중 짝수의 합을 구하시오.
		sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~50까지의 숫자 중 짝수의 합 : " + sum);

		// 1~50가지의 숫자 중 3의 배수인 값을 출력하시오.
		System.out.print("1~50까지의 숫자 중 3의 배수인 값 : ");
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.printf(i + "\t");
			}
		}
		System.out.println();

		// 1~50까지의 숫자 중 2의 배수이면서 3의 배수인 값을 출력하시오.
		System.out.print("1~50까지의 숫자 중 2의 배수이면서 3의 배수인 값 : ");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.printf(i + "\t");
			}
		}

	}

}
