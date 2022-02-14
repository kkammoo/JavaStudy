package com.kh.exam9;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person() { // 블록 내에서 익명의 자식 클래스를 정의
			
			public void study() { // 새로 정의된 메소드는 이 블록 안에서 활용할 수 있다.
				System.out.println("공부하다");
			}
			
			@Override
			public void eat() { // 부모 클래스의 메소드를 재정의 할 수 있다.
				System.out.println("많이 먹다");
				study();
			}
			
		};
		person.eat();
		
		// 위에서 새로 생성한 study 메소드를 다시 불러오기 위해선 자식 클래스를 다시금 생성해야 한다.

	}

}
