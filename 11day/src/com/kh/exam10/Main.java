package com.kh.exam10;

public class Main {
	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name.equals(name2));
		// 17번줄을 통해 String 클래스에서 equals() 메소드가 문자열 내용 일치여부로 재정의 된 것을 알 수 있었다.
		
		System.out.println(name == name2); // 이미 만들어진 "홍길동"이란 값을 가지고 있는 주소값을 대입하기 때문에 true가 출력
		
		System.out.println("======================");
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println(name3.equals(name4));
		// 아래의 (person.equals(person2))과 달리 true가 나오는 이유
		// Object를 상속받은 String 클래스에서 equals()메소드가
		// 객체의 주소가 아닌, 문자열 내용의 일치여부로 재정의 됐기 때문
		
		System.out.println(name3 == name4); // 객체를 만들 때마다 힙 영역 주소가 생성되기 때문에 false 출력
		
		System.out.println("======================");
		
		Person person = new Person();
		Person person2 = new Person();
		
		System.out.println(person.equals(person2));
		// 힙메모리 상의 person 객체, person2 객체의 주소값을 비교(Object클래스에 있는 equals() 이용)
		// Object 클래스의 equals는 각 객체의 주소값을 비교한다.
		

		
		
	}
}
