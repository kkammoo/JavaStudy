package com.kh;

public class Car {
	// 필드
	private static int count; // 클래스(정적) 멤버 필드
	private int count2;
	private String color; 		// 객체(인스턴스) 멤버 필드
	
	//생성자
	public Car() {
		count++;
		count2++;
	}
	
	public Car(String color) {
		this.color = color;
		count++;
		count2++;
	}
	
	// 메소드
	public void run() { // 인스턴스 멤버 메소드
		System.out.println("달리다");
	}
	
	// 메소드 static 유무 차이
	public static int getCount() { 
		return count;
	// 필드에 count가 static으로 정의되어 있기 때문에 이를 불러오기 위해선 메소스도 static을 사용한다.
	}
	
	public int getCount2() {
		return count2;
	}
	
}
