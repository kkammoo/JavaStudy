package com.kh;

public class Calculator {

	private String clolor = "white";
	private String maker = "Korea";
	
	public Calculator() {
		
	}
	
	//maker�� Korea�� ����. color�� ���� ����(����Ʈ = white)�� ������
	public Calculator(String color) {
		this.clolor = color;
	}
	
	// color, maker�� ������ �� �ִ� ������
	public Calculator(String color, String maker) {
		this.clolor = color;
		this.maker = maker;
	}
	
	
	// 
	public void on() {
		System.out.println("�Ѵ�");
	}
	
	public void off() {
		System.out.println("����");
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
