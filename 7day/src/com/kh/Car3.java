package com.kh;

public class Car3 {
	// 필드
	private String color;
	private int count2;
	private static int count;
	
	//생성자
	public Car3() throws Exception {
		count++;
		count2++;
		
		if (count++ == 3) {
			throw new Exception("객체 생성한도 초과!");
		}
	}
	
	// 메소드
	public static int getCount() {
		return count;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public int getCount2() {
		return count2;
	}
}
