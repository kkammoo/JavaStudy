package com.kh;

public class Person { // ���̺귯�� Ŭ����
	// �ʵ�
	final static String NATIONALITY = "�ѱ�"; // ������ ��� �ѱ��̹Ƿ� static�� ���� ��ΰ� ������ �� �ֵ��� �Ѵ�. 
	String name;		// �̸��̶�� �Ӽ�
	private int age;				// ���̶�� �Ӽ�
	
	
	// ������
	public Person() {
//		super(); // �θ������ ȣ��. ��ҿ� �����Ǿ� ����.
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
//		super();
		this.name = name; // �Ű����� �����̸��� �ٸ��� this.�� �̿��ؼ� ������ �� �ص� �ȴ�.
		this.age = age;
	}
	
	
	// �޼ҵ�
	public void smile() { // ���� ����
		System.out.println("����");
	}
	
	public void eat() { // �Դ� ����
		System.out.println("�Դ�");
	}
	
	public void setAge(int age) { // ���̴� 0���� ū ���� �Է� ���� (�ܺ��Է� ����)
		if (age > 0) {
			this.age = age; 
		}
	}
	
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

/*
 * ��ü�� ������ �߿��ϱ� ������ �ʵ庸�� �޼ҵ��� �߿䵵�� �� ����.
 * �� ��ü�� ������ ����(�޼ҵ�)�� ���� ���� ������ �� �� �ִ�.
 * 
 * �ʵ尪���� getter/setter �ڵ� �Է� : �۾�ǥ���� Source - Generate getters and setters
*/

