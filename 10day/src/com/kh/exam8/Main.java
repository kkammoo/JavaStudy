package com.kh.exam8;

public class Main {

	public static void main(String[] args) {
		
		// 정의된 구현 클래스 불러오기
		RemoteControll rc = new Tv();
		rc.turnOn();
		rc.turnOff();
		
		// 익명 인터페이스(익명 구현 클래스) 생성
		RemoteControll rc2 = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켜다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끄다");
			}
		};
		rc2.turnOn();
		rc2.turnOff();
		
		
	}

}
