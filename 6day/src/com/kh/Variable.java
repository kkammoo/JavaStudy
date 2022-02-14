package com.kh;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println(sum(1));
		System.out.println(sum(1, 2)); // public static int sum(int num1, int num2) 메소드 사용
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4));
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(1, 2, 3, 4, 5, 6));
		

	}
	
	public static int sum(int num1, int num2) {
		System.out.println("public static int sum(int num1, int num2) 호출됨!");
		return num1 + num2; // int형 매개변수 2개를 받는 메소드
	}
	
	// 가변변수 : 매개변수 개수가 정해져 있지 않을 경우. (int형 매개변수 1개 이상)
	public static int sum(int ... numbers) {
		System.out.println("public static int sum(int ... numbers) 호출된!");
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
//	public static int sum(int[] numbers) { // public static int sum(int ... numbers) 동일한 의미이기 때문에 중복 에러가 뜬다.
//		
//	}
		
}

// 메소드의 순서는 호출에 영향을 주지 않는다.