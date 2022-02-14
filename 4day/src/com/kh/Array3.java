package com.kh;

public class Array3 {

	public static void main(String[] args) {

		int row = 5;
		int col = 5;

		char[][] shape = new char[row][col];

		for (int i = 0; i < shape.length; i++) {

			for (int j = 0; j < shape[i].length; j++) {

				if (i == j) {
					System.out.print('*'); // 행 열이 같을 때 * 을 찍어라.
				} else {
					System.out.print(shape[i][j]); // 아니면 디폴트 값을 찍어라. char 타입의 디폴트값은 한 칸짜리 공백
				}
			}
			
			System.out.println();
		}

	} // end of main

}
