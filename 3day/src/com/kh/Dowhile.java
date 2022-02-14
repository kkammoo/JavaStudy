package com.kh;
/*
 * 1~10까지 합계 구하기
 */
public class Dowhile {

	public static void main(String[] args) {
		int sum = 0;
		
		// for문
		for (int i = 1; i <= 10; i++) { // i++ -> i = i + 1
			sum += i;  // sum = sum + i
		}
		System.out.println("sum1 = " + sum);
		
		// while문
		sum = 0;
		int j = 1;
		while (j <= 10) {
			sum += j;
			j++;
		}
		System.out.println("sum2 = " + sum);
		
		// do while문
		sum = 0;
		int k = 1;
		do {
			sum += k;
			k++;
		}while(k <= 10);
		System.out.println("sum3 = " + sum);
		
	}

}
