package com.kh;

import java.util.Scanner;

// 영화관 좌석 예매 시스템 구현하기

public class TheaterReservation {

	public static void main(String[] args) {
		
		int row = 6;
		int col = 10;
		String[][] seats = new String[row][col];
		
		boolean stop = false;
		Scanner scanner = new Scanner(System.in);
		
		// 좌석 초기화
		int seatNum = 0;
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				
				seats[i][j] = String.valueOf(++seatNum);
			}
		}
		
		do {
			System.out.println(">>영화관 좌석 예매 현황<<");
			System.out.println("===================");
			// 예매현황
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < seats[i].length; j++) {
					
					System.out.printf("%3s", seats[i][j]);
				}
				
				System.out.println();
			}
			// 메뉴
			System.out.println("좌석을 선택하세요(1~60) [0.종료]");
			int selectedNum = Integer.parseInt(scanner.nextLine());
			
			// 0을 입력하면 프로그램 종료
			if (selectedNum == 0) {
				stop = true;
				continue;
			}
			
			int seatRow = (selectedNum -1) / 10;
			int seatCol = (selectedNum -1) % 10;
			
			if (seats[seatRow][seatCol] == "X") {
				System.out.println("이미 예약된 좌석입니다!");
			
			} else {
				seats[seatRow][seatCol] = "X";
			}
			
		} while (!stop);
			
		System.out.println("프로그램 종료!!");	
	}

}
