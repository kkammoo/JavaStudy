package com.kh;

public class Calculator {

	private String clolor = "white";
	private String maker = "Korea";
	
	public Calculator() {
		
	}
	
	//maker는 Korea로 고정. color는 변경 가능(디폴트 = white)한 생성자
	public Calculator(String color) {
		this.clolor = color;
	}
	
	// color, maker를 변겅할 수 있는 생성자
	public Calculator(String color, String maker) {
		this.clolor = color;
		this.maker = maker;
	}
	
	
	// 
	public void on() {
		System.out.println("켜다");
	}
	
	public void off() {
		System.out.println("끄다");
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
