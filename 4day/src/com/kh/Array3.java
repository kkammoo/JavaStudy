package com.kh;

public class Array3 {

	public static void main(String[] args) {

		int row = 5;
		int col = 5;

		char[][] shape = new char[row][col];

		for (int i = 0; i < shape.length; i++) {

			for (int j = 0; j < shape[i].length; j++) {

				if (i == j) {
					System.out.print('*'); // �� ���� ���� �� * �� ����.
				} else {
					System.out.print(shape[i][j]); // �ƴϸ� ����Ʈ ���� ����. char Ÿ���� ����Ʈ���� �� ĭ¥�� ����
				}
			}
			
			System.out.println();
		}

	} // end of main

}
