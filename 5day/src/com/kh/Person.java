package com.kh;
// Ŭ����
public class Person {
	
	// ��� �ʵ� (�Ӽ�, ���) : �⺻Ÿ��, ����Ÿ�� ��� �� �� �ִ�.
	private String name;
	private int age;
	private Gender gender;
	
	Calculator calculator = new Calculator();
	
	// ����Ʈ ������ : �������� �̸��� Ŭ������� ����. ���� ���� �ʾƵ� java���� �ڵ����� ��������.
	public Person() {
		
	}
	
	// ������
	// �빮�ڷ� ����, ��ȯŸ�� ����.
	public Person(String name, int age, Gender gender) {
		this.name = name; // this : ������ ��ü�� �ǹ�.
		this.age = age;
		this.gender = gender;
	}
	
	// ���� ������
	public Person(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// �޼ҵ� (����)
	public void smile() {
		System.out.println("����");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
	
}
