package com.kh;

public class LgPhone extends Phone {
	
	public void doInternet() {
		System.out.println("인터넷 하다.");
	}
	
	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("LG폰으로 전화중...");
	}
}
