package com.kh;

public class Car extends Object {

	String color;	// 색상
	int cc;				// 배기량
	
	// 기본생성자.
	// 생성자가 하나도 없으면 자동생성. 어떤 형태이든 생성자가 있으면 생성x
	public Car() {
		super(); // 부모 생성자(Object) 호출. 평소엔 생략되어 있다. 모든 객체는 Object객체가 만들어진 다음 만들어진다.
		System.out.println("public Car() 호출됨!");
	}
	
	public Car(String color) { // color 필드 값을 가진 생성자
		this(color, 2000); // color, cc값을 가진 자기 자신의 생성자 호출. 부모 생성자와 동시에 호출할 수 없다. 둘 중 하나만 가능.
		this.color = color;
		System.out.println("public Car(String color) 호출됨!");
	}
	
	public Car(String color, int cc) { // color, cc의 필드값을 가진 생성자
		super();
		this.color = color; // this.color : 필드에 있는 color값. color : 매개변수 값.
		this.cc = cc;
		System.out.println("public Car(String color, int cc) 호출됨!");
	}
	
	public void run() {
		// 시동을 걸고
		on(); // 메소드 on 호출. 생성자 안에서 다른 생성자를 호출 할 수 있듯이, 메소드 안에서 다른 메소드를 호출할 수 있다.
		System.out.println("차가 달린다.");
		// 시동을 끄고
		off();
	}
	
	
	private void on()	{
		System.out.println("시동을 걸고!");
	}
	private void off() {
		System.out.println("시동을 끄고!");
	}
	
}
