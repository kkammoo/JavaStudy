package homework01;

import java.util.Scanner;

/*
 * �л� ���� �м�
 * �迭�� ����Ͽ� �л� ����ŭ ������ �Է� �ް� �м�(�ְ����, ��������, ���)�� �� �ִ� ���α׷��� �ۼ��Ͻÿ�
 */

public class Ques1_Switch {

	public static void main(String[] args) {

		boolean run = true;

		int studentNum = 0;
		int[] score = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("�л� ����ŭ ������ �Է� �ް� �м�(�ְ����, ��������, ���)�� �� �ִ� ���α׷��Դϴ�.");
		System.out.println();

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�л� �� | 2.���� �Է� | 3.���� ����Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("���ϴ� �޴� ��ȣ�� �Է��Ͻʽÿ�.");
			System.out.print("�Է� > ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println();
				System.out.println("�л� ���� �Է��Ͻʽÿ�.");
				System.out.print("�Է� > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				score = new int[studentNum];
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println("������ �Է��Ͻʽÿ�");

				for (int i = 0; i < score.length; i++) {
					System.out.print("�л�" + (i + 1) + " ���� : ");
					score[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println("���� ����Ʈ");

				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" + i + "] : " + score[i]);
				}
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("�м�");

				int max = score[0];

				for (int i = 1; i < score.length; i++) {
					if (score[i] > max) {
						max = score[i];
					}
				}
				System.out.println("�ְ����� = " + max + "��");

				int min = score[0];

				for (int i = 1; i < score.length; i++) {
					if (score[i] < min) {
						min = score[i];
					}
				}
				System.out.println("�������� = " + min + "��");

				int sum = 0;

				for (int i = 0; i < score.length; i++) {
					sum += score[i];
				}
				System.out.println("������� = " + ((double) sum / studentNum) + "��");
				break;
			case 5:
				run = false;
				break;
			} // end of switch

		} // end of while

		System.out.println();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} // end of main

} // end of class