package com.kh;

// �迭�� �ִ밪, �ּҰ� ���ϱ�

public class Array6 {

	public static void main(String[] args) {

		int[] values = { 3, 5, 4, 7, 6 };
		int max = values[0];

		for (int i = 1; i < values.length; i++) {

			if (values[i] > max) {
				max = values[i];
			}

		}

		System.out.println("�ִ밪�� : " + max);

		int min = values[0];

		for (int i = 1; i < values.length; i++) {

			if (values[i] < min) {
				min = values[i];
			}
		}

		System.out.println("�ּҰ��� : " + min);
	}

}