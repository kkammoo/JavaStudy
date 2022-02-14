package com.kh.exam5;

public class Main {

	public static void main(String[] args) {
		
		method1();
		method2();
	}

	private static void method1() {
		// try-catch
		int[] arr = new int[3];
		try {
			System.out.println(arr[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void method2() {
		// throws
		int[] arr = new int[3];
		System.out.println(arr[3]); // JVM이 자동으로 예외 떠넘기기를 했다. throws ArrayIndexOutOfBoundsException이 생략되어있음.
		
	}

}
