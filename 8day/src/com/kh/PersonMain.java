package com.kh;

public class PersonMain {

	public static void main(String[] args) { // 실행 클래스
		
		Person person1 = new Person(); // 객체를 우선 생성하고, 이후에 필드값을 지정
		person1.name = "홍길동";
//		person1.age = 30;
		person1.setAge(30);
		System.out.println(person1.name);
//		System.out.println(person1.age);
		System.out.println(person1.getAge());
		
		
		Person person2 = new Person("홍길순", 20); // 객체를 생성할 때 필드값을 지정. 라이브러리 클래스에 해당 매개값을 가진 생성자 필요.
		System.out.println(person2.name);
//		System.out.println(person2.age);
		System.out.println(person2.getAge());
		
		person2.name = "김무년";
//		person2.age = 33;
		person2.setAge(33);
		System.out.println(person2.name); // 객체를 생성할 당시에 지정해줬던 필드값을 변경할 수도 있다.
//		System.out.println(person2.age);  // 필드값을 변경하지 못하도록 하기 위해선 private를 통해 외부에서 접근하지 못하도록 한다.
		System.out.println(person2.getAge());
		
		
		Person person3 = new Person("홍길남");
		person3.setAge(35);
		
		// 각 객체당 static 클래스 멤버 필드 값
		System.out.println(Person.NATIONALITY);
		System.out.println(person1.NATIONALITY);
		System.out.println(person2.NATIONALITY);
		System.out.println(person3.NATIONALITY);
		// 객체가 달라도 같은 값을 공유하고 있기 때문에 값은 전부 같다.
		
//		Person.nationality = "미국"; // 상수(final static)로 값을 고정했기 때문에 변경이 안 된다.
	}
	
}
