package com.kh.exam6;

public class Main {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		Parent p1 = new Child(); // �θ�ü �ڵ�����ȯ
		InterfaceA ia1 = new Child(); // �θ�ü�� ������ �������̽��� �ڵ�����ȯ
		
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
