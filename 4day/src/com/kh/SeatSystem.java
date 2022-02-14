package com.kh;

import java.util.Scanner;

public class SeatSystem {

	public static void main(String[] args) {
		 new SeatSystem();
  }

  // ���� �տ� final �� ���̴� ����:
  // 1) ���α׷��� ����Ұ��� ���ذ��� �����ϱ� ����
  // 2) �ٸ� �Լ��� �������� ���� ������� ��� ���� �Ƚᵵ �ǳ�,
  //    �����ڰ� �������� ������ �� �ְ� ����ϴ� ȿ���� ����.
  // �� constant variable ��������̱� �ϳ�, final �� �������ν� '����' -> '���'�� ��.
  final int TOTAL_CNT = 60; // ���⼭ ���� �����ϸ� �¼� ���� �ø��ų� ���� �� ����.
  final int DIV_BASE = 10; // �ٹٲ� ����. (����. ������ ��)
  final int IS_RESERVED = 1; // ����� �¼��� '1', ���డ���� �¼��� '0'
  final int IS_NOT_RESERVED = 0; // ����� ���� �������� �ö�

  /**
   * seatNums[�ε���][0] = �¼���ȣ�� ����
   * seatNums[�ε���][1] = ������¸� ����
   */
  int[][] seatNums = new int[TOTAL_CNT][2];

  SeatSystem() {
      // seatNums �迭���� �ʱ�ȭ!
      for (int i = 1; i <= TOTAL_CNT; i++) {
          seatNums[i-1][0] = i;
          seatNums[i-1][1] = IS_NOT_RESERVED; // ���α׷� ���� �ÿ��� ������ �����Ƿ� 
      }

      Scanner scan = new Scanner(System.in);
      int selectedSeatNo;

      while (true) {
          printBoth();// �¼� �Ǵ� ����� �¼������� ���

          System.out.println("��ȭ�� �¼��� �����ϼ���. (1~60, 0: ����)");
          System.out.print("�Է� > ");

          selectedSeatNo = scan.nextInt();
          if (selectedSeatNo == 0) { // '0' �� �Է����� ������ �� while loop �� ���� ����
              break;
          }

          if (isReserved(selectedSeatNo)) {
              System.out.println("�̹� ����� �¼��Դϴ�.");
              System.out.println("�ٸ� �¼��� �������ֽʽÿ�.");
          }
          else {
              reserve(selectedSeatNo);
          }
      }
  }

  // ���࿩�� ��ȸ
  boolean isReserved(int seatNo) {
      for (int r = 0; r < seatNums.length; r++) {
          if (seatNums[r][0] == seatNo && seatNums[r][1] == IS_RESERVED) {
              return true;
          }
      }
      return false;
  }

  // ���� ���� ����
  void reserve(int seatNo) {
      seatNums[seatNo-1][1] = IS_RESERVED;
  }

  // �¼���ȣ �Ǵ� ���� ���¸� ���
  void printBoth() {
      System.out.println();

      // IS_RESERVED ���¿� ���� 'XX' ��� 'O' �� ǥ���� �� ����.
      // 'XX' �� ���࿩�θ� �Ǵ��ϴ� ������ �ƴ϶� ������ �� ����ϴ� ������ UX �� ���� ��.
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
