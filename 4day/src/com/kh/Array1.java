package com.kh;

public class Array1 {

	public static void main(String[] args) {

		// �迭 ���� : ���� ���� ����. new ���
		int[] score = new int[3];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// �迭 ����2 : ���� �˰� ���� ���. {} ���
		int[] score2 = { 10, 20, 30 };

		for (int i = 0; i < score2.length; i++) {
			System.out.println(score2[i]);
		}

		// �迭 ����2�� ����� ������ �� �ٿ� �ۼ��ؾ� �Ѵ�. + 2�ٷ� �ۼ��ϴ� ���
//		int[] score3;
//		score3 = { 10, 20, 30 };
		
		int[] score3;
		score3 = new int[]{ 10, 20, 30 };

		// �迭 ���� 1�� ����� ����� ������ ���� �� �� ����.
		int[] score4; 			 // �迭 ����
		score4 = new int[3]; // �迭 ����

		// �迭 ����3
		int[] score5 = new int[]{ 10, 20, 30 };
		
		for (int i = 0; i < score5.length; i++) {
			System.out.println(score5[i]);
		}
	}

}