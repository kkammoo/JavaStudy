package com.kh;

import java.util.Scanner; // Scanner 기능을 사용하기 위한 import

public class Main {
	
//	String name; // 클래스 안에서 정의된 것은 필드
	
	public static void main(String[] args) {
		
		Person p1 = new Person(); // 메소드 내에서 정의된 p1은 변수.
		System.out.println(p1);
//		p1.setAge(20);
		p1.smile();
		System.out.println(p1.getAge());
		p1.setAge(20); // person 클래스 안에 있는 setAge 메소드를 이용하여 age값 변경
		System.out.println(p1.getAge()); // setAge로 변경된 age값을 다시 출력
		
		
		Calculator c1 = new Calculator();
		System.out.println(c1);
		
//		Calculator claculator = p1.getCalculator();
//		int result = calculator().sum(10, 20);
		int result = p1.getCalculator().sum(10, 20); // 위 실행문 2줄을 한 줄로 표현.
		System.out.println(result);
		
		
		Calculator c2 = new Calculator("Kroea", "White");
		Person p2 = new Person(c2);
		int result2 = p2.getCalculator().sum(20,30);
		System.out.println(result2);
		
		
		
		
		
		Car car1 = new Car();
		System.out.println(car1);
		
		
		
		Scanner scanner = new Scanner(System.in); // Scanner는 같은 패키지 안에 있지 않기 때문에 import를 해야 한다.
		String str = scanner.nextLine();
	}

}

/*	
 * 객체를 선언 하면 힙 메모리 영역에 해당 객체가 생성된다.
 * 모든 객체는 Object 클래스에서 기능을 상속 받는다.
 */ 
