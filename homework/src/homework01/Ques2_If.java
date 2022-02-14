package homework01;

import java.util.Scanner;

/*
 * 영화관 좌석 예매 시스템 구현하기
 */

public class Ques2_If {

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

		System.out.println(">>영화관 좌석 예매 시스템 구현하기<<");

		while (run) {
			System.out.println();
			for (int i = 0; i < seats.length; i++) {

				for (int j = 0; j < seats[i].length; j++) {
					System.out.print(seats[i][j] + " ");
				}

				System.out.println();
			} // end of showing the seats
			
			// 좌석 선택
			System.out.println();
			System.out.println("영화관 좌석을 선택하세요. (1~60, 0:종료)");
			System.out.print("입력 > ");

			int seatNum = Integer.parseInt(scanner.nextLine());
			
			if (seatNum == 0) {
				run = false;
				
			} else if (0 < seatNum && seatNum <= 10) {
				int row = 0;
				
				if (seats[row][seatNum - 1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 1] = "XX";
				
			} else if (10 < seatNum && seatNum <=20) {
				int row = 1;
				
				if (seats[row][seatNum - 11].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 11] = "XX";
				
			} else if (20 < seatNum && seatNum <=30) {
				int row = 2;
				
				if (seats[row][seatNum - 21].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 21] = "XX";
				
			} else if (30 < seatNum && seatNum <= 40) {
				int row = 3;
				
				if (seats[row][seatNum - 31].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 31] = "XX";
				
			} else if (40 < seatNum && seatNum <= 50) {
				int row = 4;
				
				if (seats[row][seatNum - 41].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 41] = "XX";
				
			} else { // 50 < seatNum && seatNum <= 60
				int row = 5;
				
				if (seats[row][seatNum - 51].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[row][seatNum - 51] = "XX";
			}

		} // end of while

		System.out.println("프로그램이 종료되었습니다.");
	} // end of main

} // end of class
