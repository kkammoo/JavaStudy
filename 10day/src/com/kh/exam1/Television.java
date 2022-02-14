package com.kh.exam1;

public class Television implements RemoteControll {
// implements : 인터페이스 클래스의 구현 클래스이다.
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		System.out.println("끄다");

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;

	}

	public int getVolume() {
		return this.volume;
	}
}
