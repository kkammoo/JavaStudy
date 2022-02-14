package com.kh;

// 배열의 최대값, 최소값 구하기

public class Array6 {

	public static void main(String[] args) {

		int[] values = { 3, 5, 4, 7, 6 };
		int max = values[0];

		for (int i = 1; i < values.length; i++) {

			if (values[i] > max) {
				max = values[i];
			}

		}

		System.out.println("최대값은 : " + max);

		int min = values[0];

		for (int i = 1; i < values.length; i++) {

			if (values[i] < min) {
				min = values[i];
			}
		}

		System.out.println("최소값은 : " + min);
	}

}
