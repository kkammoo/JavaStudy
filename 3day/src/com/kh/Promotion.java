package com.kh;

public class Promotion {

	public static void main(String[] args) {

		byte b = 127; // -128~127까지의 정수를 저장할 수 있다. 128을 넣으면 에러가 뜸.
		System.out.println(b);
		
		// 수동 타입 변환 (강제 타입 변환)
		byte by = (byte)128; // byte 타입이 표현할 수 있는 범위 내에서 출력.
		System.out.println(by); // -128~127 범위를 한 바퀴 돌아 128번째 값인 -128을 출력한다.
		// 값의 손실 발생 (overflow)
		
		int c = 10;
		byte cy = (byte)c;
		System.out.println(cy);
		// int 타입의 변수 c의 값을 byte타입으로 강제 형변환 했지만, 10은 byte 타입에서도 담아낼 수 있기 때문에 강제 형변환을 해도 손실 없이 출력된다.
		
		/* 값의 손실이 일어나는 형변환은 프로그램에 오류를 불러 일으킬 수 있다.
		 * 강제 형변환은 값의 손실이 없는 경우에 의미가 있다.
		 */

	}

}
