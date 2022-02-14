package com.kh.exam8;

public class Main {

	public static void main(String[] args) {


		int age = 10; // age는 지역변수이지, 객체가 아니기 때문에 age. 해도 아무런 기능을 사용할 수 없다.

		
		
//		Integer age2 = new Integer(2); // java doc 을 보면 Deprecated 되어있는 생성자라고 나온다.
		Integer age2 = 2; // Wrapper 클래스에 한해서 이러한 문법을 허용함. 정수 2를 객체로 인식하는 상태. 박싱(Boxing)이라고 한다.

		//		age2.MAX_VALUE; // 해당 객체가 가질 수 있는 최대값
		//		age2.MIN_VALUE; // 해당 객체가 가질 수 있는 최소값
		System.out.println(age2.MAX_VALUE); // 2147483647
		System.out.println(age2.MIN_VALUE); // -2147483648
		// integer는 -2147483648~2147483647 범위의 정수값을 가질 수 있다.

		
		System.out.println(age2.toString()); // 정수 2를 문자열 "2"로 변환
		
		
		System.out.println("==============");
		
		Integer age3 = age; // 지역변수 age의 값(10)을 객체화
		
		int age10 = age3; // 객체 age3의 객체값 10을 기본타입 int의 지역변수 age10의 값으로 사용. 언박싱(Unboxing)이라고 한다.
		
		
		System.out.println("==============");
		System.out.println("Math 클래스");
		
		int radius = 5;
		double result = radius * Math.PI; // Math.PI는 원주율 3.14... 를 나타내는 메소드
		System.out.println(result);
		
		
	}

}
