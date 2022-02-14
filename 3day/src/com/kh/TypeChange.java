package com.kh;

public class TypeChange {

	public static void main(String[] args) {

		// 타입 변환은 작은 범위 -> 큰 범위로 가능하다. 반대는 불가능.
		/*
		 * 타입 크기 비교 byte < short < int < long < float < double
		 */

		// 자동 타입 변환
		byte a = 10; // byte 타입 변수 a에 10을 저장.
		int b = a; // byte 타입 변수 a에 저장된 10을 int 타입 변수 b에 복사해서 저장.
		// int 타입이 byte 타입보다 허용 범위가 크기 때문에 자동으로 형 변환이 된다.

		long longValue = 5000000000L;
		float floatValue = longValue; // 5.0E9f로 저장됨. 그렇기 때문에 8바이트의 long타입을 4바이트인 float타입에 넣을 수 있음.
		double doubleValue = longValue; // 5.0E9로 저장됨. float로 자동 변환이 가능하기 때문에 더 큰 범위인 double로도 자동 형변환이 됨.

		// 정수 연산
		int x = 1;
		int y = 2;
		double result = x / y; // 정수와 정수의 연산 결과는 정수가 나온다.
		System.out.println(result); // 정수 타입의 결과값이 나오기 때문에 0.0 출력.

		double result2 = (double) x / y; // x값을 double 타입으로 형변환 하면 실수 타입과 정수 타입의 연산이 되므로 결과값이 실수로 나온다.
		System.out.println(result2); // 0.5 출력.
		
		
		int diceNumber = (int)(Math.random() * 6) +1; // 실수 타입의 Math.random()을 정수 타입 int로 형변환.
		System.out.println(diceNumber); // 소수점 이하의 값에 손실이 일어났지만, 요구하는 값은 정수였기 때문에 괜찮음.
		
		// 문자열을 기본 타입으로 강제 타입 변환 (교재 p.83 참조)
		String str1 = "10";
		
		int result3 = Integer.parseInt(str1);
		byte result4 = Byte.parseByte(str1);
		long result5 = Long.parseLong(str1);
		short result6 = Short.parseShort(str1);
		
		long z = result3 + result4 + result5 + result6; // 해당 연산 타입 중 가장 큰 타입이 long이기 때문에 long타입 변수를 선언한다.
		System.out.println(z);
		// 결과값 40은 byte, int에도 손실 없이 담을 수 있기 때문에 아래와 같은 실행문도 가능하다.
		byte result7 = (byte)z;
		System.out.println(result7);
		int result8 = (int)z;
		System.out.println(result8);
		
		double result9 = Double.parseDouble(str1);
		System.out.println(result9); // double 타입으로 변환했기 때문에 실수 10.0이 출력된다.
		
		// 기본 타입을 문자열로 강제 타입 변환 String.valueOf()
		String str2 = String.valueOf(result3);
		String str3 = String.valueOf(result4);
		String str4 = String.valueOf(result5);
		String str5 = String.valueOf(result6);
		
		System.out.println(str2 + str3 + str4 + str5);
		// 숫자 10을 문자열로 변환했기 때문에 덧셈 연산이 아닌, 문자열 결합이 일어나 10101010이 출력된다.

	}

}
