package com.kh.exam1;

public class Main {

	public static void main(String[] args) {

//		RemoteControll remoteControll = new RemoteControll(); // �������̽��� ��ü�� ���� �� ����.

		// ���������δ� ��� ����. (�߻�Ŭ������ ������ ���)
		RemoteControll rc;
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		System.out.println(tv.getVolume());
		
		// ����Ŭ������ �������̽� Ÿ�Կ� ������ �� �ִ�.
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
