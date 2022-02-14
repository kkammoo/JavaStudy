package com.kh;

public class SamsungPhone extends Phone {

	public void watchTv() {
		System.out.println("TV 보다");
	}
	
	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("Samsung폰으로 전화중...");
	}
}
