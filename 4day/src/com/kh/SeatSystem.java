package com.kh;

import java.util.Scanner;

public class SeatSystem {

	public static void main(String[] args) {
		 new SeatSystem();
  }

  // 변수 앞에 final 을 붙이는 이유:
  // 1) 프로그램의 변경불가한 기준값을 설정하기 위함
  // 2) 다른 함수나 로직에서 값을 변경안할 경우 굳이 안써도 되나,
  //    개발자가 육안으로 인지할 수 있게 명시하는 효과도 있음.
  // ※ constant variable 용어차이이긴 하나, final 을 붙임으로써 '변수' -> '상수'가 됨.
  final int TOTAL_CNT = 60; // 여기서 값을 변경하면 좌석 수를 늘리거나 줄일 수 있음.
  final int DIV_BASE = 10; // 줄바꿈 기준. (제수. 나누는 수)
  final int IS_RESERVED = 1; // 예약된 좌석은 '1', 예약가능한 좌석은 '0'
  final int IS_NOT_RESERVED = 0; // 상수를 쓰면 가독성이 올라감

  /**
   * seatNums[인덱스][0] = 좌석번호를 보관
   * seatNums[인덱스][1] = 예약상태를 보관
   */
  int[][] seatNums = new int[TOTAL_CNT][2];

  SeatSystem() {
      // seatNums 배열변수 초기화!
      for (int i = 1; i <= TOTAL_CNT; i++) {
          seatNums[i-1][0] = i;
          seatNums[i-1][1] = IS_NOT_RESERVED; // 프로그램 시작 시에는 예약이 없으므로 
      }

      Scanner scan = new Scanner(System.in);
      int selectedSeatNo;

      while (true) {
          printBoth();// 좌석 또는 예약된 좌석정보를 출력

          System.out.println("영화관 좌석을 선택하세요. (1~60, 0: 종료)");
          System.out.print("입력 > ");

          selectedSeatNo = scan.nextInt();
          if (selectedSeatNo == 0) { // '0' 을 입력으로 받으면 본 while loop 을 빠져 나감
              break;
          }

          if (isReserved(selectedSeatNo)) {
              System.out.println("이미 예약된 좌석입니다.");
              System.out.println("다른 좌석을 선택해주십시오.");
          }
          else {
              reserve(selectedSeatNo);
          }
      }
  }

  // 예약여부 조회
  boolean isReserved(int seatNo) {
      for (int r = 0; r < seatNums.length; r++) {
          if (seatNums[r][0] == seatNo && seatNums[r][1] == IS_RESERVED) {
              return true;
          }
      }
      return false;
  }

  // 예약 정보 저장
  void reserve(int seatNo) {
      seatNums[seatNo-1][1] = IS_RESERVED;
  }

  // 좌석번호 또는 예약 상태를 출력
  void printBoth() {
      System.out.println();

      // IS_RESERVED 상태에 따라 'XX' 대신 'O' 로 표시할 수 있음.
      // 'XX' 은 예약여부를 판단하는 기준이 아니라 보여줄 때 사용하는 일종의 UX 로 보면 됨.
      for (int p = 1; p <= seatNums.length; p++) {
          if (p < 10) {
              System.out.print(seatNums[p-1][1] == IS_RESERVED? " XX " : " " + p + " ");
          }
          else {
              System.out.print(seatNums[p-1][1] == IS_RESERVED? "XX " : p + " ");
          }
          if (p % DIV_BASE == 0) {
              System.out.println();
          }
      }

	}

}
