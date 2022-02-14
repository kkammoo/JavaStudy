package homework01;

import java.util.Scanner;

/*
 * 영화관 좌석 예매 시스템 구현하기
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
			
			int row = (seatNum - 1) / 10;
			int col = (seatNum - 1) % 10;
					
			if (seatNum == 0) { // 0을 입력하면 프로그램 종료
				run = false;
				
			} else if (0 < seatNum && seatNum <= 60) { // 0 < seatNum <= 60 범위의 좌석 번호 입력
				
				// 좌석 중복 확인
				if (seats[row][col].equals("XX")) { // if (seats[row][col].equals("XX"))가 참일 경우(좌석 중복) 출력.
					System.out.println("이미 예약된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
				} else {
					
					seats[row][col] = "XX"; // 좌석 중복 확인 후, 중복이 아니면 해당 배열의 값을 XX로 변경.
				}
				
			} else { // 0 < seatNum <= 60 이외의 값을 입력할 경우 출력.
					System.out.println("잘못된 입력입니다.");
					System.out.println("다른 좌석을 선택해주십시오.");
			}

		} // end of while

		System.out.println("프로그램이 종료되었습니다.");
	} // end of main

} // end of class
