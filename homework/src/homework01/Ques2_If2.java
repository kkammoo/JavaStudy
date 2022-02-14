package homework01;

import java.util.Scanner;

/*
 * ��ȭ�� �¼� ���� �ý��� �����ϱ�
 */

public class Ques2_If2 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		String[][] seats = {
				{ " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10" },
				{ "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" },
				{ "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" },
				{ "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" },
				{ "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" },
				{ "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }, 
				};

		System.out.println(">>��ȭ�� �¼� ���� �ý��� �����ϱ�<<");

		while (run) {
			System.out.println();
			for (int i = 0; i < seats.length; i++) {

				for (int j = 0; j < seats[i].length; j++) {
					System.out.print(seats[i][j] + " ");
				}

				System.out.println();
			} // end of showing the seats
			
			// �¼� ����
			System.out.println();
			System.out.println("��ȭ�� �¼��� �����ϼ���. (1~60, 0:����)");
			System.out.print("�Է� > ");

			int seatNum = Integer.parseInt(scanner.nextLine());
			
			int row = (seatNum - 1) / 10;
			int col = (seatNum - 1) % 10;
					
			if (seatNum == 0) { // 0�� �Է��ϸ� ���α׷� ����
				run = false;
				
			} else if (0 < seatNum && seatNum <= 60) { // 0 < seatNum <= 60 ������ �¼� ��ȣ �Է�
				
				// �¼� �ߺ� Ȯ��
				if (seats[row][col].equals("XX")) { // if (seats[row][col].equals("XX"))�� ���� ���(�¼� �ߺ�) ���.
					System.out.println("�̹� ����� �¼��Դϴ�.");
					System.out.println("�ٸ� �¼��� �������ֽʽÿ�.");
				} else {
					
					seats[row][col] = "XX"; // �¼� �ߺ� Ȯ�� ��, �ߺ��� �ƴϸ� �ش� �迭�� ���� XX�� ����.
				}
				
			} else { // 0 < seatNum <= 60 �̿��� ���� �Է��� ��� ���.
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("�ٸ� �¼��� �������ֽʽÿ�.");
			}

		} // end of while

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} // end of main

} // end of class
