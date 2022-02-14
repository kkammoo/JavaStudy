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
		System.out.println(arr[3]); // JVM�� �ڵ����� ���� ���ѱ�⸦ �ߴ�. throws ArrayIndexOutOfBoundsException�� �����Ǿ�����.
		
	}

}
