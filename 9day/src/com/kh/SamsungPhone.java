package com.kh;

public class SamsungPhone extends Phone {

	public void watchTv() {
		System.out.println("TV ����");
	}
	
	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("Samsung������ ��ȭ��...");
	}
}
