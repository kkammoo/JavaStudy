package com.kh;

public class Array2 {

	public static void main(String[] args) {
		
		int[] score = new int[3];
		// int[]는 참조타입. 그러므로 변수 score엔 힙 영역 주소 값이 저장된다.
		
		System.out.println(score); // int[3]이 저장되어있는 힙 영역의 주소값이 나온다. (물리적으로 정확한 값은 아님)
		System.out.println(score[0]); // score[0]이 저장되어 있는 힙 영역을 찾아간 뒤, 저장되어 있는 값을 불러온다.
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		int[][] array = new int[2][3]; // 2차원 배열 : []가 2개
		
		// 2차원 배열 구성도 :앞에 오는 []는 행, 뒤에 오는 []는 열이라 생각하면 쉽다.

//		[0]  ->		[0][1][2] : [0]은 해당 배열을 참조
//		[1]	 ->		[0][1][2] : [1]은 해당 배열을 참조
		
//		array.length : 2가 나옴.
		System.out.println(array.length);
//		array[0].length : 3이 나옴.
		System.out.println(array[0].length);
//		array[1].length : 3이 나옴.
		System.out.println(array[1].length);
		
		
		int[][] array2 = new int[3][4];
		
	// 2차원 배열 구성도

//		[0]  ->		[0][1][2][3] : [0]은 해당 배열을 참조
//		[1]	 ->		[0][1][2][3] : [1]은 해당 배열을 참조
//		[2]	 ->		[0][1][2][3] : [2]는 해당 배열을 참조
		
		// 2차원 배열의 값 지정
		array[0][0] = 10;
		array2[1][2] = 100;
		System.out.println(array[0][0]); // 10 출력
		System.out.println(array2[1][2]); // 100 출력
		
		
		// 3차원 배열
		int[][][] array3 = new int[3][2][4];
		
	// 3차원 배열 구성도
//
//																		[0][1][2][3] : [0][0] 배열을 참조
//	[0]  ->	[0][1] : [0] 배열 참조		->	[0][1][2][3] : [0][1] 배열을 참조
//	[1]	 ->	[0][1] : [1] 배열 참조		->	[0][1][2][3] : [1][0] 배열을 참조
//	[2]	 ->	[0][1] : [2] 배열 참조		->	[0][1][2][3] : [1][1] 배열을 참조
//																		[0][1][2][3] : [2][0] 배열을 참조
//																		[0][1][2][3] : [2][1] 배열을 참조
//		
		
		// 비정방형 2차원 배열
		int[][] array4 = new int[3][]; // 두 번째 배열을 비우고 만든다.
		array4[0] = new int[3]; // 비워진 배열에 원하는 index값을 넣는다.
		array4[1] = new int[2];
		array4[2] = new int[4];
		
	// 비정방형 2차원 배열 구성도

//			[0]  ->	[0][1][2] 	 : [0] 배열 참조
//			[1]	 ->	[0][1] 			 : [1] 배열 참조	
//			[2]	 ->	[0][1][2][3] : [2] 배열 참조	
//
		
		
		
	}

}
