package com.kh.exam6;

public class Main {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		Parent p1 = new Child(); // 부모객체 자동형변환
		InterfaceA ia1 = new Child(); // 부모객체가 구현한 인터페이스로 자동형변환
		
		method(c1);
		method(p1);
		method(ia1);
		
	}
	
	public static void method(InterfaceA inter) {
		
		if (inter instanceof Child) {
			Child child = (Child)inter;
			
		} else if (inter instanceof Parent) {
			Parent parent = (Parent)inter;
			
		} else if (inter instanceof InterfaceA) {
			InterfaceA ia = (InterfaceA)inter;
		}
		
	}
}
