package com.kh;

import java.util.Calendar;

public class SunMain {

	public static void main(String[] args) {
		
		Sun sun1 = Sun.getIntance();
		System.out.println(sun1);
		
		Sun sun2 = Sun.getIntance();
		System.out.println(sun2);
		
		if (sun1 == sun2) {
			System.out.println("������ ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		
		// ǥ�� ���̺귯�� �߿� �̱��� ������ ����� ��.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toInstant());
		
		Math.random();
		
	}

}
