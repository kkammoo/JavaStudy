package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		// 이름이 있는 구현클래스를 사용
		RemoteControll rc = new Tv();
		rc.turnOff();
		((Tv)rc).turnOn(); // 강제 형변환을 이용
		
		
		// 익명 구현클래스 사용
		RemoteControll rc2 = new RemoteControll() {
			@Override
			public void turnOff() {
				System.out.println("Tv를 끄다2");
				turnOn();
			}
			// 익명 구현클래스 내부에서 새롭게 정의된 필드 혹은 메소드는 내부에서만 사용 가능하다.
			private void turnOn() {
				System.out.println("Tv를 켜다2");
			}
		};
		rc2.turnOff();
//		rc2.turnOn(); 블록 바깥에선 해당 메소드를 불러올 수 없다.
	}
}
