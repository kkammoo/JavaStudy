package com.kh;

public class TypeEscape {

	public static void main(String[] args) {
		
		// 기본 타입
		int x = 10; // 정수 타입 (byte, char, short, int, long)
		double y = 3.14; // 실수 타입 (float, double)
		boolean stop = true; // 논리 타입 (값은 항상 true or false가 온다.)
		
		char ch = 'A'; // 문자 타입 ''작은따옴표로 묶는다.
		String name = "홍길동"; // 문자열 타입(s는 꼭 대문자로!) ""큰따옴표로 묶는다.
		// 문자는 문자열로 묶을 수 있지만 ex) "A" <-이 땐 문자열로 인식. 문자열은 문자로 묶을 수 없다.
		// String은 기본 타입이 아닌, 참조 타입이다. 그래서 첫 글자를 대문자로 씀.
		
		long z = 1000000l; // long 타입은 값 할당 후 마지막에 대소문자 l을 적어야 한다.
						   // 안 붙이면 int 타입으로 자동 인식함.
		float f = 3.143232f; // float 타입은 값 할당 후 마지막에 대소문자 f를 적어야 한다.
							 // 안 붙이면 double 타입으로 자동 인식함.
		
		
		// escape
		String str1 = "울산 KH 정보교육원"; // "" : 문자열 식별 기호
		System.out.println(str1); // 문자열 변수 str1에 저장되어 있는 값 [울산 KH 정보교육원]을 출력.
		System.out.println("str1"); // 문자열 str1을 출력
		
		// 큰따옴표 혹은 작은따옴표를 같이 출력하고 싶을 때 escape 문자를 활용
		System.out.println("\"울산 KH 정보교육원\""); // 큰따옴표도 같이 출력. "울산 KH 정보교육원"
		// escape 문자의 종류는 교재 p.66 참조
		
		
		// 실수 타입
		double i = 5e2; // 5.0 * 10^2 -> 지수와 가수로 표현된 10진수 실수로 인식
		System.out.println(i); // 500.0 출력
	}

}
