package com.kh;

public class Array5 {

	public static void main(String[] args) {

		String[][] names = new String[4][8];

		names[0][1] = "김재엽";
		names[0][3] = "박성모";
		names[0][5] = "박현근";
		names[0][7] = "이규민";
		names[1][0] = "배지희";
		names[1][2] = "유기상";
		names[1][4] = "최재훈";
		names[1][6] = "권영경";
		names[2][0] = "이준혁";
		names[2][1] = "김강현";
		names[2][2] = "이한봄";
		names[2][3] = "김무년";
		names[2][4] = "전은우";
		names[2][5] = "김세영";
		names[2][6] = "정윤해";
		names[2][7] = "김소라";
		names[3][0] = "김영빈";
		names[3][2] = "하태우";
		names[3][4] = "조세령";
		names[3][6] = "최수빈";

		for (int i = 0; i < names.length; i++) {

			for (int j = 0; j < names[i].length; j++) {

				System.out.print(names[i][j] + " ");
			}

			System.out.println();
		} // end of for문

		System.out.println("============================");

		int m = (int) (Math.random() * names.length);
		int n = (int) (Math.random() * names[m].length);

		System.out.println("오늘의 MVP는?");

		if (names[m][n] != null) {
			
			System.out.println(names[m][n] + "님 축하합니다.");
		} else {
			
			System.out.println("다음 기회에");
		}

	} // end of main

} // end of class
