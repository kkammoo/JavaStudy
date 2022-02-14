package com.kh.exam1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// 객체 생성
		Set<Person> set = new HashSet<>();
		
		System.out.println(set.add(new Person("홍길동", 30)));
		System.out.println(set.add(new Person("홍길동", 30))); // 중복 (동등비교)된 객체가 있으므로 false 출력
		
		System.out.println(set.toString()); // 중복은 걸러내기 때문에 저장정보는 1개만 나옴
		System.out.println(set.size()); // 중복은 걸러내기 때문에 사이즈는 1로 나온다.
	
		set.add(new Person("홍길서", 40));
		set.add(new Person("홍길남", 50));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("-------------");
		
		// 객체 검색
		System.out.println(set.contains(new Person("홍길북", 60))); // 컬렉션에 없기 때문에 false 반환. 
		System.out.println(set.toString()); // 객체를 추가한 것이 아닌, 검색만 한 것.
		System.out.println(set.size());
		
		System.out.println(set.isEmpty()); // 비어있지 않아서 false 출력
		
		System.out.println("Iterator 사용");
		Iterator<Person> iterator = set.iterator();
		
		System.out.println("while문");
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.printf("이름 : %s, 나이 : %d \n", person.getName(), person.getAge());
		}
		
		System.out.println("향상된 for문");
		for (Person person : set) {
			System.out.printf("이름 : %s, 나이 : %d \n", person.getName(), person.getAge());
		}
		
		System.out.println("-------------");
		
		// 객체 삭제 : 인덱스를 활용하는 것이 아니기 때문에 동등객체를 찾아서 삭제해줘야 한다.
		set.remove(new Person("홍길남", 50)); // 홍길남, 50 객체와 동등한 객체를 찾아서 삭제
		System.out.println(set.toString());
		System.out.println(set.size());
		
		set.clear(); // 전체 삭제
		System.out.println(set.toString());
		System.out.println(set.size());
		
	}

}
