package com.kh.exam7;

public class Main {

	public static void main(String[] args) {
		
		// 자식 객체 메소드 실행
		Student student = new Student();
		student.study();
		
		// 익명 자식 객체 생성
		new Person() {
		
			void study() {
				System.out.println("공부하다2");
			}
		}.study();
		
		
		// 자식 객체 메소드 재정의
		Person person = new Student();
		person.eat();
		
		// 익명 자식 객체 메소드 재정의
		Person person2 = new Person() {
			@Override
			public void eat() {
				System.out.println("많이 먹다2");
			}
		};
		person2.eat();
		
		
		
		
	}

}
