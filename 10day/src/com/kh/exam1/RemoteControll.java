package com.kh.exam1;

public interface RemoteControll {
	
	// �������̽��� ����ʵ�� ������̱� ������ �ʱ�ȭ�� ���� ������ ������ ������ ���.
	// final static�� �����ص� �����Ϸ��� �ڵ����� �������ش�.
	String maker = "�Ｚ"; 
	
	
	// �������̽� �ȿ����� �޼ҵ�� �߻�޼ҵ��̱� ������ {}�� ����� ������ ������ ���.
	// public abstract�� �����ص� �����Ϸ��� �ڵ����� �������ش�.
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
}
