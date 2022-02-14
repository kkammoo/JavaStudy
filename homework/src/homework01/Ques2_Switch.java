package homework01;

import java.util.Scanner;

/*
 * 영화관 좌석 예매 시스템 구현하기
 */

public class Ques2_Switch {

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
			
			switch (seatNum) {
			case 0:
				run = false;
				break;
			case 1:
				if (seats[0][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][0] = "XX";
				break;
			case 2:
				if (seats[0][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][1] = "XX";
				break;
			case 3:
				if (seats[0][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][2] = "XX";
				break;
			case 4:
				if (seats[0][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][3] = "XX";
				break;
			case 5:
				if (seats[0][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][4] = "XX";
				break;
			case 6:
				if (seats[0][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][5] = "XX";
				break;
			case 7:
				if (seats[0][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][6] = "XX";
				break;
			case 8:
				if (seats[0][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][7] = "XX";
				break;
			case 9:
				if (seats[0][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][8] = "XX";
				break;
			case 10:
				if (seats[0][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[0][9] = "XX";
				break;
			case 11:
				if (seats[1][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][0] = "XX";
				break;
			case 12:
				if (seats[1][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][1] = "XX";
				break;
			case 13:
				if (seats[1][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][2] = "XX";
				break;
			case 14:
				if (seats[1][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][3] = "XX";
				break;
			case 15:
				if (seats[1][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][4] = "XX";
				break;
			case 16:
				if (seats[1][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][5] = "XX";
				break;
			case 17:
				if (seats[1][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][6] = "XX";
				break;
			case 18:
				if (seats[1][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][7] = "XX";
				break;
			case 19:
				if (seats[1][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][8] = "XX";
				break;
			case 20:
				if (seats[1][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[1][9] = "XX";
				break;
			case 21:
				if (seats[2][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][0] = "XX";
				break;
			case 22:
				if (seats[2][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][1] = "XX";
				break;
			case 23:
				if (seats[2][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][2] = "XX";
				break;
			case 24:
				if (seats[2][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][3] = "XX";
				break;
			case 25:
				if (seats[2][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][4] = "XX";
				break;
			case 26:
				if (seats[2][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][5] = "XX";
				break;
			case 27:
				if (seats[2][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][6] = "XX";
				break;
			case 28:
				if (seats[2][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][7] = "XX";
				break;
			case 29:
				if (seats[2][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][8] = "XX";
				break;
			case 30:
				if (seats[2][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[2][9] = "XX";
				break;
			case 31:
				if (seats[3][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][0] = "XX";
				break;
			case 32:
				if (seats[3][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][1] = "XX";
				break;
			case 33:
				if (seats[3][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][2] = "XX";
				break;
			case 34:
				if (seats[3][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][3] = "XX";
				break;
			case 35:
				if (seats[3][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][4] = "XX";
				break;
			case 36:
				if (seats[3][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][5] = "XX";
				break;
			case 37:
				if (seats[3][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][6] = "XX";
				break;
			case 38:
				if (seats[3][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][7] = "XX";
				break;
			case 39:
				if (seats[3][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][8] = "XX";
				break;
			case 40:
				if (seats[3][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[3][9] = "XX";
				break;
			case 41:
				if (seats[4][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][0] = "XX";
				break;
			case 42:
				if (seats[4][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][1] = "XX";
				break;
			case 43:
				if (seats[4][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][2] = "XX";
				break;
			case 44:
				if (seats[4][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][3] = "XX";
				break;
			case 45:
				if (seats[4][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][4] = "XX";
				break;
			case 46:
				if (seats[4][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][5] = "XX";
				break;
			case 47:
				if (seats[4][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][6] = "XX";
				break;
			case 48:
				if (seats[4][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][7] = "XX";
				break;
			case 49:
				if (seats[4][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][8] = "XX";
				break;
			case 50:
				if (seats[4][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[4][9] = "XX";
				break;
			case 51:
				if (seats[5][0].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][0] = "XX";
				break;
			case 52:
				if (seats[5][1].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][1] = "XX";
				break;
			case 53:
				if (seats[5][2].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][2] = "XX";
				break;
			case 54:
				if (seats[5][3].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][3] = "XX";
				break;
			case 55:
				if (seats[5][4].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][4] = "XX";
				break;
			case 56:
				if (seats[5][5].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][5] = "XX";
				break;
			case 57:
				if (seats[5][6].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][6] = "XX";
				break;
			case 58:
				if (seats[5][7].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][7] = "XX";
				break;
			case 59:
				if (seats[5][8].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][8] = "XX";
				break;
			case 60:
				if (seats[5][9].equals("XX")) {
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				}
				seats[5][9] = "XX";
				break;
			
			} // end of switch
			
		} // end of while
		
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	} // end of main

} // end of class
