package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		method1();
		method2();
		
	}
	
	public static void method1() {
		// ���� ó�� 1 (try-catch���� �̿�)
		try {
			Class c = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

public static void method2() throws ClassNotFoundException {
		// ���� ó�� 2 (throws���� �̿�)
		// ���� ó���� �ش� �޼ҵ忡�� ���� �ʰ�, method2�� ȣ���� �޼ҵ忡�� ���� ó���ϵ��� ���ѱ�.
		Class c = Class.forName("java.lang.String");
		
	}
}
