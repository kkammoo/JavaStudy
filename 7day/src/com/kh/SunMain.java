package com.kh;

import java.util.Calendar;

public class SunMain {

	public static void main(String[] args) {
		
		Sun sun1 = Sun.getIntance();
		System.out.println(sun1);
		
		Sun sun2 = Sun.getIntance();
		System.out.println(sun2);
		
		if (sun1 == sun2) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		
		// 표준 라이브러리 중에 싱글턴 패턴이 적용된 예.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toInstant());
		
		Math.random();
		
	}

}
