package com.kh;

public class Array5 {

	public static void main(String[] args) {

		String[][] names = new String[4][8];

		names[0][1] = "���翱";
		names[0][3] = "�ڼ���";
		names[0][5] = "������";
		names[0][7] = "�̱Թ�";
		names[1][0] = "������";
		names[1][2] = "�����";
		names[1][4] = "������";
		names[1][6] = "�ǿ���";
		names[2][0] = "������";
		names[2][1] = "�谭��";
		names[2][2] = "���Ѻ�";
		names[2][3] = "�蹫��";
		names[2][4] = "������";
		names[2][5] = "�輼��";
		names[2][6] = "������";
		names[2][7] = "��Ҷ�";
		names[3][0] = "�迵��";
		names[3][2] = "���¿�";
		names[3][4] = "������";
		names[3][6] = "�ּ���";

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.print(names[i][j] + " ");
			}

			System.out.println();
		} // end of for��

		System.out.println("============================");

		int m = (int) (Math.random() * names.length);
		int n = (int) (Math.random() * names[m].length);

		System.out.println("������ MVP��?");

		if (names[m][n] != null) {
			
			System.out.println(names[m][n] + "�� �����մϴ�.");
		} else {
			
			System.out.println("���� ��ȸ��");
		}

	} // end of main

} // end of class
