package com.kh;

import java.util.Scanner;

/* 
  �޴� : 1.���� 2.��� 3.���� 
  ����, ����, ���� �� ������ ������ �Է� �޾Ƽ� ����, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Average2 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int sum = 0;		// ����
		double avg = 0.0;	// ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� �� ������ ������ �Է� �޾�, ��� ������ ���ϴ� ���α׷� �Դϴ�.");
		
		while (run) {
			System.out.println("---------------------");
			System.out.println("1.���� | 2.��� | 3.����");
			System.out.println("---------------------");
			System.out.print("����> ");

			int menuNum = Integer.parseInt(scanner.nextLine());
			
			switch (menuNum) {
			case 1:
				System.out.print("�������� : ");
				int sumkor = Integer.parseInt(scanner.nextLine());
				System.out.print("�������� : ");
				int sumeng = Integer.parseInt(scanner.nextLine());
				System.out.print("�������� : ");
				int summath = Integer.parseInt(scanner.nextLine());
				
				sum = sumkor + sumeng + summath;
				System.out.println("���� : " + sum);
				break;
			case 2:
				System.out.print("�������� : ");
				int avgkor = Integer.parseInt(scanner.nextLine());
				System.out.print("�������� : ");
				int avgeng = Integer.parseInt(scanner.nextLine());
				System.out.print("�������� : ");
				int avgmath = Integer.parseInt(scanner.nextLine());
				
				sum = avgkor + avgeng + avgmath;
				avg = (double)sum / 3;
				System.out.println("������� : " + avg);
				break;
			case 3:
				run = false;
				break;
			
			}
			
			System.out.println();
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
