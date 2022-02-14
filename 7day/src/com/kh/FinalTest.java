package com.kh;

public class FinalTest {
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num); // 초기값 10 출력
		num = 20;
		System.out.println(num); // 재할당된 20 출력
		
		final int NUM = 30;
		System.out.println(NUM); // 초기값 30 출력
//		NUM = 40; // final로 정의된 값은 변경할 수 없다.
//		final 상수 : 할당된 값이 바뀌지 않고 고정. 변수 이름을 대문자로 작성하는 것이 관례.
		
		int round = 5;
		final double PI = 3.14;
		System.out.println(round * round * PI);
		
		
	} // end of main
} // end of class
