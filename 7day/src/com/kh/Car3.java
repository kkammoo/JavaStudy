package com.kh;

public class Car3 {
	// �ʵ�
	private String color;
	private int count2;
	private static int count;
	
	//������
	public Car3() throws Exception {
		count++;
		count2++;
		
		if (count++ == 3) {
			throw new Exception("��ü �����ѵ� �ʰ�!");
		}
	}
	
	// �޼ҵ�
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
