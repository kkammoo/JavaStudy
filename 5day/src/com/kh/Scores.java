package com.kh;

import java.util.Scanner; // java.util.* : util ��Ű���� �ִ� �޼ҵ带 ���� ���

public class Scores {

	public static void main(String[] args) {
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in); // improt �ڵ��ϼ� : Ctrl + Shift + O
		int[] student = null;
		
		do {
			printLine(44);
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			printLine(44);
			System.out.print("���� >> "); 
//			String choiceNumber = scanner.nextLine();  // Ctrl + Alt + j : �� ��ġ��
			
			switch (scanner.nextLine()) {
			case "1":
				System.out.print("�л��� > ");
				int studentCount = Integer.parseInt(scanner.nextLine());
				student = new int[studentCount];
				break;
				
			case "2":
				// �л��� �Է� üũ
				if (student == null) {
					System.out.println("�л����� ���� �Է����ּ���.");
					continue;
				}
				// �����Է�
				for (int i = 0; i < student.length; i++) {
					System.out.print("���� " + (i + 1) + "> ");
					student[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
				
			case "3":
			// �л��� �Է� üũ
				if (student == null) {
					System.out.println("�л����� ���� �Է����ּ���.");
					continue;
				}
				
				for (int i = 0; i < student.length; i++) {
					System.out.println("score[" + i + "] = " + student[i]);
				}
				break;
				
			case "4":
				System.out.println("�ְ����� : " + maxScore(student));
				System.out.println("�������� : " + minScore(student));
				System.out.println("��� : " + avg(student));
				break;
				
			case "5":
				stop = true;
				break;
			default :
				continue;
			}
			
		} while (!stop);
			System.out.println("���α׷� ����!!");

	} // end of main
	
	// �ְ�����
	private static int maxScore(int[] scores) {
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		
		return max;
	}
	
	// ��������
	private static int minScore(int[] scores) {
		int min = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
			}
		}
		
		return min;
	}
	
	// ���
	private static double avg(int[] scores) {
		double avg = 0;
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / (double)scores.length;
		
		return avg;
	} // end of avg Method
	
	//���� ���
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
		
	} // end of Line Method
	
} // end of class
