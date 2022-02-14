package com.kh;

import java.util.Scanner;

// ��ȭ�� �¼� ���� �ý��� �����ϱ�

public class TheaterReservation {

	public static void main(String[] args) {
		
		int row = 6;
		int col = 10;
		String[][] seats = new String[row][col];
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		
		// �¼� �ʱ�ȭ
		int seatNum = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				
				seats[i][j] = String.valueOf(++seatNum);
			}
		}
		
		do {
			System.out.println(">>��ȭ�� �¼� ���� ��Ȳ<<");
			System.out.println("===================");
			// ������Ȳ
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					
					System.out.printf("%3s", seats[i][j]);
				}
				
				System.out.println();
			}
			// �޴�
			System.out.println("�¼��� �����ϼ���(1~60) [0.����]");
			int selectedNum = Integer.parseInt(scanner.nextLine());
			
			// 0�� �Է��ϸ� ���α׷� ����
			if (selectedNum == 0) {
				stop = true;
				continue;
			}
			
			int seatRow = (selectedNum -1) / 10;
			int seatCol = (selectedNum -1) % 10;
			
			if (seats[seatRow][seatCol] == "X") {
				System.out.println("�̹� ����� �¼��Դϴ�!");
			
			} else {
				seats[seatRow][seatCol] = "X";
			}
			
		} while (!stop);
			
		System.out.println("���α׷� ����!!");	
	}

}
