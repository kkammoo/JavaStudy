package com.kh;

import java.util.Scanner; // java패키지 안에 있는 util패키지 안에 있는 Scanner클래스를 불러오겠다.
													// 다른 패키지에 있기 때문에 import를 해야 한다.

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Person person = new Person("홍길동", 30); // import를 안 해도 되는 이유 : 같은 패키지 안에 있기 때문.
		person.eat(); // Person 클래스 안에 있는 메소드를 불러와서 실행
		person.smile();
		
		Person person2 = new Person("홍길순", 20);
		person2.eat();
		person2.smile();
		
	}

}
