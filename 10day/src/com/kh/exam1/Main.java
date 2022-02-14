package com.kh.exam1;

public class Main {

	public static void main(String[] args) {

//		RemoteControll remoteControll = new RemoteControll(); // 인터페이스는 객체를 만들 수 없다.

		// 참조변수로는 사용 가능. (추상클래스와 동일한 기능)
		RemoteControll rc;
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
		
		// 구현클래스는 인터페이스 타입에 대입할 수 있다.
		rc = tv;
		rc.turnOff();
		rc.setVolume(20);
		System.out.println(((Television)rc).getVolume());
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		audio.setVolume(30);
		System.out.println(audio.getVolume());
		
		rc = audio;
		rc.setVolume(40);
		System.out.println(((Audio)rc).getVolume());
	}

}
