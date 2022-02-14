package com.kh.exam4;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		
		method1();
		method2();
		
	}
	
	public static void method1() {
		// 예외 처리 1 (try-catch문을 이용)
		try {
			Class c = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

public static void method2() throws ClassNotFoundException {
		// 예외 처리 2 (throws문을 이용)
		// 예외 처리를 해당 메소드에서 하지 않고, method2를 호출한 메소드에서 예외 처리하도록 떠넘김.
		Class c = Class.forName("java.lang.String");
		
	}
}
