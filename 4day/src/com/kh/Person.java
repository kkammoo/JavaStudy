package com.kh;

public class Person {
	// ����ʵ�
	String name;
	int age;
	
	// ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// �޼ҵ� 01
	public void smile() {
		System.out.println( name + ": ����");
	}
	
	// �޼ҵ� 02
	public void eat() {
		System.out.println(name + ": �Դ�");
	}
}

// main �޼ҵ尡 ���� Ŭ���� : ���̺귯�� Ŭ����