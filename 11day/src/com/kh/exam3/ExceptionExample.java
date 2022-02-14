package com.kh.exam3;

import java.lang.*; // 기본적으로 생략되어있다.

public class ExceptionExample {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("프로그램 종료");
		
		
		
	}

}
