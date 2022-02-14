package com.kh;

public class Car2 {
	// 필드
	int maxSpeed;				// 객체(인스턴스) 멤버 필드 : 객체를 만들어야 불러올 수 있다.
	static int count;		// 클래스(정적) 멤버 필드 : 객체를 만들지 않아도 불러올 수 있다.
	int count2;
	
	//생성자
	public Car2() {
		count++;
		count2++;
	}
	
	// 메소드
	int getMaxSpeed() { // 객체(인스턴스) 멤버 메소드
		return maxSpeed;
	}
	
	static int getCount() { // 클래스(정적) 멤버 메소드
		return count;
	}
	
	int getCount2() { 
		return count2;
	}
}
