package com.kh;

public class Person {
	// 멤버필드
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드 01
	public void smile() {
		System.out.println( name + ": 웃다");
	}
	
	// 메소드 02
	public void eat() {
		System.out.println(name + ": 먹다");
	}
}

// main 메소드가 없는 클래스 : 라이브러리 클래스