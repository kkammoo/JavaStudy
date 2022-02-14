package com.kh.exam1;

public interface RemoteControll {
	
	// 인터페이스의 멤버필드는 상수값이기 때문에 초기화를 하지 않으면 컴파일 에러가 뜬다.
	// final static을 생략해도 컴파일러가 자동으로 생성해준다.
	String maker = "삼성"; 
	
	
	// 인터페이스 안에서의 메소드는 추상메소드이기 때문에 {}를 만들면 컴파일 에러가 뜬다.
	// public abstract를 생략해도 컴파일러가 자동으로 생성해준다.
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
}
