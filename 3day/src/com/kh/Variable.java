package com.kh;

public class Variable {

	public static void main(String[] args) {
		int x; // 변수 선언 - local Variable (지역 변수 : 메소드 범위 안에서 선언된 변수)
		x = 100; // 초기화 : 변수 선언 후 최초 값을 할당하는 행위
		System.out.println(x); // 변수에 값을 할당하지 않으면 컴파일 에러가 뜬다.

		x = 200; // 재할당
		System.out.println(x); // 재할당된 200이 출력된다.

		int y; // 변수 선언
		y = x; // x의 값을 읽어서 y변수에 초기화 - 변수 값 복사
		System.out.println(y);

		int z; // 변수 선언
		z = x + y; // 변수엔 값을 비롯한 표현식도 올 수 있다.
		System.out.println(z);

		int k; // 변수 선언
		k = sum(x, y);  // 블록 외부에 있는 메소드에서 값을 가져온다.
		System.out.println(k);
		
		int j;
		j = sum(z, k);
		System.out.println(j);
		
		int num1;  // intMethod, doubleMethod에 num1 변수가 있지만 블록이 다르기 때문에 각각 다른 변수로 인식한다.
		num1 = 10;
		System.out.println(num1);

	} // end of mainMethod

	// 메소드 정의
	public static int sum(int num1, int num2) { // 인풋
						  // 메소드를 불러올 때 데이터의 개수, 데이터 타입이 일치해야 한다.
		System.out.println("sum(int num1, int num2) 호출됨.");
		int result = num1 + num2;
		// 반환하는 값과 메소드의 타입이 일치해야 한다.
		return result; // 아웃풋
	} // end of intMethod
	
	public static double sum(double num1, double num2) {
		
		System.out.println("sum(double num1, double num2) 호출됨.");
		double result = num1 + num2;
		
		return result; // 데이터 타입이 일치하지 않아서 이 메소드는 사용하지 않는다.
	} // end of doubleMethod
	
} // end of class
