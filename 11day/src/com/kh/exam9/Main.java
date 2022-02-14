package com.kh.exam9;

public class Main {

	public static void main(String[] args) {

		String name = "홍길동";
		System.out.println(name.toString()); // String 클래스에서 재정의된 toString 메소드
		
		System.out.println("===");
		
		Person person = new Person();
		System.out.println(person.toString()); 
		// Object 클래스의 toString 메소드 : 좌표값이 나옴
		// Object 클래스를 상속받은 Person 클래스에서 toString을 재정의 : 홍길순
	
		
	}

}
