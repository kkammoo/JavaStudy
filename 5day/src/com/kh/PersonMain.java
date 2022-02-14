package com.kh;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // 생성자 호출. 디폴트 생성자를 통해 만듦.
		Person p2 = new Person();
		
		Person[] p3 = new Person[3];
		
		Person p4 = new Person("김무년", 33, Gender.MALE); // 생성자를 통해 만듦.
		p4.smile();
		p4.eat();
		
		Person p5 = new Person("홍길돌", 99, Gender.OTHERS);
		p5.smile();
		p5.eat();
		
//		Person p6 = new Person("KH"); // Person 클래스에 이름만 변경할 수 있는 사용자가 없기 때문에 에러가 뜸
		
//		Calculator c1 = new Calculator();
//		Calculator c2 = new Calculator("Yellow");
//		Calculator c3 = new Calculator("Black", "USA");
//		
//		int result = c1.add(10, 20);
//		System.out.println(result);
		
		p1.calculator.on();
		int result = p1.calculator.add(20, 30);
		System.out.println(result);
		p1.calculator.off();
		
		
		Calculator c1 = new Calculator("Black", "Japan");
		Person p6 = new Person(c1);
		
		p6.calculator.on();
		System.out.println(p2.calculator.add(30, 40));
		p2.calculator.off();

	}

}
