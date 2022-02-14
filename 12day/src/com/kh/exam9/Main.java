package com.kh.exam9;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// List 컬렉션에 객체 추가
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동", 30));
		list.add(new Person("홍길서", 40));
		list.add(new Person("홍길남", 50));
		list.add(1, new Person("홍길순", 20)); // 1번 인덱스에 홍길순, 20 객체를 삽입. 기존에 1번 인덱스에 있던 홍길서~ 자동으로 차례가 밀린다.
		list.set(3, new Person("홍길북", 10)); // 3번 인덱스 (현재 홍길남)의 객체를 홍길북, 10 객체로 수정(대체).
		
		System.out.println(list); // toString()메소드로 저장 객체 확인
		System.out.println(list.size()); // list에 저장되어 있는 객체 수. 객체가 추가됨에 따라 자동으로 늘어난다.
		
		System.out.println("----------");
		
		// List 컬렉션에 저장되어 있는 저장객체 확인(검색)
		System.out.println(list.contains(new Person("홍길동", 30)));
		// hashCode와 equals의 재정의 없이 실행하면 동등비교에 대한 기준이 없기 때문에 false가 나온다.
		// Person 클래스에서 hashCode와 equals를 재정의 한 다음 실행하면 true가 나온다.
		
		// get을 이용한 특정 위치의 객체 검색
		Person person = (Person)list.get(0); // get메소드는 Object클래스에서 가져오기 때문에 Person으로 형변환 해줌
		System.out.printf("이름 : %s, 나이 : %d\n", person.getName(), person.getAge());
		
		// 인덱스가 비어있는지 아닌지 확인 : 비어 있으면 true
		System.out.println(list.isEmpty());
		
		System.out.println("----------");
		
		// List 컬렉션에 저장되어 있는 저장객체 삭제
		Person removePerson = list.remove(1); // 인덱스 1번에 있는 홍길순을 삭제
		System.out.println(list.toString()); // 홍길순에 대한 정보가 출력되지 않는다.
		System.out.println(list.size()); // 컬렉션 사이즈도 4에서 3으로 1 줄음.
		
		System.out.println(list.remove(new Person("홍길동", 30))); // 홍길동, 30 의 객체정보를 가진 객체 삭제
		System.out.println(list.toString()); // 확인해보면 홍길동 객체가 지워진 걸 알 수 있다.
		System.out.println(list.size()); // 사이즈도 3에서 2로 줄음
		
		list.clear(); // 저장 객체 전부 삭제.
		System.out.println(list.toString()); // 컬렉션에 아무런 정보가 없다.
		System.out.println(list.size()); // 사이즈도 0으로 나옴
		
		
	}

}
