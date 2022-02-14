package com.kh;
// 클래스
public class Person {
	
	// 멤버 필드 (속성, 명사) : 기본타입, 참조타입 모두 올 수 있다.
	private String name;
	private int age;
	private Gender gender;
	
	Calculator calculator = new Calculator();
	
	// 디폴트 생성자 : 생성자의 이름은 클래스명과 같다. 직접 적지 않아도 java에서 자동으로 생성해줌.
	public Person() {
		
	}
	
	// 생성자
	// 대문자로 시작, 반환타입 없음.
	public Person(String name, int age, Gender gender) {
		this.name = name; // this : 생성될 객체를 의미.
		this.age = age;
		this.gender = gender;
	}
	
	// 계산기 생성자
	public Person(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// 메소드 (동사)
	public void smile() {
		System.out.println("웃다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
}
