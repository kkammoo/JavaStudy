package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("동일성 동등성 비교");
		
		// Object 클래스가 super클래스인 Person클래스
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		
		
		// 비교연산자 ==과 Object 클래스에서 상속받은 equals메소드 사용 비교
		// Object 클래스의 equals 메소드는 == 비교를 하고 있다.
		// 그래서 아래의 두 결과값이 같음.
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		// Person클래스에서 equals() 메소드를 동등성 비교를 위한 메소드로 재정의함
		// 결과값이 다르게 나타난다. (주소값 비교 (==), 객체 속성값 비교(equals())
		
		System.out.println("=======================");
		
		System.out.println("값 복사, 주소값 복사");
		
		int a = 10;
		int b = a; // a의 '값'을 b에 대입
		b = 20; // b의 값 변경. a의 값을 변경한 것이 아니니 a = 10
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("------------");
		
		Person p3 = new Person(10);
		Person p4 = p3; // p3의 '주소값'을 p4에 복사. p3와 p4는 같은 주소값(같은 객체)를 가리킴. 
		p4.setAge(20); // p4의 객체값을 변경하면 같은 주소값을 가리키고 있는 p3도 영향을 받는다.
		System.out.println("p3.age = " + p3.getAge());
		System.out.println("p4.age = " + p4.getAge());
		
		// 참조타입에서는 2개 이상의 참조변수가 동일타입 객체의 참조값에 영향을 안 주려면 별도의 객체를 생성해야 한다.
		Person p5 = new Person(10);
		Person p6 = new Person(10);  
		p6.setAge(20);
		System.out.println("p5.age = " + p5.getAge());
		System.out.println("p6.age = " + p6.getAge());
		
		System.out.println("=======================");
		
		System.out.println("문자열 객체 생성 비교");
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2); // true가 나온다. 주소값이 같다는 뜻.
		System.out.println(name1.equals(name2)); // String 클래스에서 equals()메소드를 동등성 비교 메소드로 재정의 함.

		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4); // false가 나온다. 주소값이 다르다는 뜻.
		System.out.println(name3.equals(name4)); // 객체값이 같기 때문에 true가 나온다.
		
		
	}

}
