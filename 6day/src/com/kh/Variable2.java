package com.kh;

public class Variable2 {

	public static void main(String[] args) {
		
		// 배열로 정의된 메소드 출력하는 법
		System.out.println(sum(new int[] {1}));
		System.out.println(sum(new int[] {1, 2}));
		
		
		int[] values = {1, 2, 3};
		System.out.println(sum(values));
		
		int[] values2 = new int[] {1, 2, 3};
		System.out.println(sum(values2));
		

	}
	
//	public static int sum(int num1, int num2) {
//		System.out.println("public static int sum(int num1, int num2) 호출됨!");
//		return num1 + num2; // int형 매개변수 2개를 받는 메소드
//	}
//	
//	// 가변변수 : 매개변수 개수가 정해져 있지 않을 경우. (int형 매개변수 1개 이상)
//	public static int sum(int ... numbers) {
//		System.out.println("public static int sum(int ... numbers) 호출된!");
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
//		return sum;
//	}
	
	public static int sum(int[] numbers) { // public static int sum(int ... numbers) 동일한 의미이기 때문에 중복 에러가 뜬다.
		System.out.println("public static int sum(int[] numbers) 호출된!");
		int sum = 0;
//		// 일반 for문
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
		
		// 향상된 for문 (매개변수가 배열인 경우)
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
		
}

// 메소드의 순서는 호출에 영향을 주지 않는다.