package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = new String("홍길동");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.toString());
		
		System.out.println("----------");
		Person p1 = new Person("홍길동");
		System.out.println(p1);
		System.out.println(p1.toString());
		// 같은 방식으로 객체를 만들었는데 왜 Person은 주소값이 나올까?
		// Object에서 상속받은 toString()메소드를 String 클래스에서 재정의 했기 때문. equals()와 같은 개념.
		// Person 클래스에서 toString() 메소드를 재정의 했더니 주소값이 아닌 객체값이 출력됐다.
		
		System.out.println("==================");
		System.out.println("해시코드");
		
		System.out.println(name2.hashCode());
		System.out.println(p1.hashCode());
	}

}
