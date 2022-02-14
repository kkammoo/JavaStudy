package com.kh;

public class Array2 {

	public static void main(String[] args) {
		
		// 비정방형 배열
		int[][] array = new int[3][];
		
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[4];
		
		// 배열에 값을 할당.
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 1;
			}
		}
		
		// 배열의 값을 읽어오기.
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
