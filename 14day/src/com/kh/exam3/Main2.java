package com.kh.exam3;

public class Main2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		
		System.out.println("b = " + b); // 10
		changeValue(b);
		System.out.println("b = " + b); // 10
		
		b = changeValue2(b);
		System.out.println("b = " + b); // 20
		
	}

	private static void changeValue(int b) {
		b = 20;
	}

	private static int changeValue2(int b) {
		b = 20;
		return b;
	}

}
