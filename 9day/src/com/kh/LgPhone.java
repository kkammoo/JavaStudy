package com.kh;

public class LgPhone extends Phone {
	
	public void doInternet() {
		System.out.println("���ͳ� �ϴ�.");
	}
	
	@Override
	public void makeCall() {
		super.makeCall();
		System.out.println("LG������ ��ȭ��...");
	}
}
