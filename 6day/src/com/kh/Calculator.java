package com.kh;

public class Calculator {

	private String maker; // 값을 지정하지 않으면 데이터 타입이 String이기 때문에 기본값은 null
	private String color;
	
	public Calculator() {}
	public Calculator(String maker, String color) {
		this.maker = maker;
		this.color = color;
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
}
