package com.kh.exam9;

public class Main {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		System.out.println(name.toString()); // String Ŭ�������� �����ǵ� toString �޼ҵ�
		
		System.out.println("===");
		
		Person person = new Person();
		System.out.println(person.toString()); 
		// Object Ŭ������ toString �޼ҵ� : ��ǥ���� ����
		// Object Ŭ������ ��ӹ��� Person Ŭ�������� toString�� ������ : ȫ���
	
		
	}

}
