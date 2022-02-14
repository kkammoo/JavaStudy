package com.kh;

public class Person { // 라이브러리 클래스
	// 필드
	final static String NATIONALITY = "한국"; // 국적은 모두 한국이므로 static을 통해 모두가 공유할 수 있도록 한다. 
	String name;		// 이름이라는 속성
	private int age;				// 나이라는 속성
	
	
	// 생성자
	public Person() {
//		super(); // 부모생성자 호출. 평소엔 생략되어 있음.
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
//		super();
		this.name = name; // 매개값의 변수이름이 다르면 this.을 이용해서 참조를 안 해도 된다.
		this.age = age;
	}
	
	
	// 메소드
	public void smile() { // 웃는 행위
		System.out.println("웃다");
	}
	
	public void eat() { // 먹는 행위
		System.out.println("먹다");
	}
	
	public void setAge(int age) { // 나이는 0보다 큰 수만 입력 가능 (외부입력 통제)
		if (age > 0) {
			this.age = age; 
		}
	}
	
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

/*
 * 객체의 역할이 중요하기 때문에 필드보다 메소드의 중요도가 더 높다.
 * 각 객체의 공개된 행위(메소드)를 통해 서로 도움을 줄 수 있다.
 * 
 * 필드값별로 getter/setter 자동 입력 : 작업표시줄 Source - Generate getters and setters
*/

