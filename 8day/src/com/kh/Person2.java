package com.kh;

public class Person2 {
	
	private static final String NATIONALITY = "한국인";
	private int age;
	private static String city = "울산";
	
	
//	public Person2() {
//		super();
//	}
	
	
	public static String getNationality() {
		return NATIONALITY;
	}
	
//	public static int getAge() {
//		return age; // 클래스(정적) 메소드 안에서 인스턴스 멤버 필드는 사용할 수 없다. (객체가 생성되지 않아 멤버 필드가 선언되지 않았기 때문.)
//	}
	
	public String getCity() {
		return city; // 클래스(정적) 멤버 필드는 인스턴스 메소드 안에서 사용할 수 있다. (멤버 필드의 선언과 값은 이미 있는 상태. 객체를 생성하고 난 뒤에 메소드를 호출할 수 있기 때문.)
	}
}
