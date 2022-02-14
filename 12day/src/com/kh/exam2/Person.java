package com.kh.exam2;
/**
 * Person 클래스 정의
 * @author mypc
 *
 */
public class Person {
	
	/**
	 * 멤버 필드 정의
	 */
	private String name;
	
	/**
	 * 생성자 정의 
	 * @param name 이름을 입력받는다.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * 현재 객체 정보
	 * @return 현재 객체의 상태정보를 문자열로 반환
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
