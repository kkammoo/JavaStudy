package com.kh;

public class For2_1 {

	public static void main(String[] args) {
		
		// ���� for�� (for�� �ȿ� �Ǵٸ� for���� ���� �߰� �б⸦ ����)
		// ������ 2~9���� �� ���� �����
		
		int startDansu = 2;
		int endDansu = 9;
		
		// if���� �߰��Ͽ� Ȧ���ܸ� ���. (¦���� ��������)
		// continue : break�� �ش� ������ ����(false)�� ��� ������ ������ ��������, continue�� �ش� ������ ������ ��� �� ������ �ǳ� ��.
		for (int i = startDansu; i <= endDansu; i++) {
			
			if (i % 2 == 0) {
				continue;
			}
			
			System.out.println("===" + i + "�� ��� ===");

			for (int j = 1; j <= 9; j++) {

				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}

}