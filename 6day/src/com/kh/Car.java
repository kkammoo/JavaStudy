package com.kh;

public class Car extends Object {

	String color;	// ����
	int cc;				// ��ⷮ
	
	// �⺻������.
	// �����ڰ� �ϳ��� ������ �ڵ�����. � �����̵� �����ڰ� ������ ����x
	public Car() {
		super(); // �θ� ������(Object) ȣ��. ��ҿ� �����Ǿ� �ִ�. ��� ��ü�� Object��ü�� ������� ���� ���������.
		System.out.println("public Car() ȣ���!");
	}
	
	public Car(String color) { // color �ʵ� ���� ���� ������
		this(color, 2000); // color, cc���� ���� �ڱ� �ڽ��� ������ ȣ��. �θ� �����ڿ� ���ÿ� ȣ���� �� ����. �� �� �ϳ��� ����.
		this.color = color;
		System.out.println("public Car(String color) ȣ���!");
	}
	
	public Car(String color, int cc) { // color, cc�� �ʵ尪�� ���� ������
		super();
		this.color = color; // this.color : �ʵ忡 �ִ� color��. color : �Ű����� ��.
		this.cc = cc;
		System.out.println("public Car(String color, int cc) ȣ���!");
	}
	
	public void run() {
		// �õ��� �ɰ�
		on(); // �޼ҵ� on ȣ��. ������ �ȿ��� �ٸ� �����ڸ� ȣ�� �� �� �ֵ���, �޼ҵ� �ȿ��� �ٸ� �޼ҵ带 ȣ���� �� �ִ�.
		System.out.println("���� �޸���.");
		// �õ��� ����
		off();
	}
	
	
	private void on()	{
		System.out.println("�õ��� �ɰ�!");
	}
	private void off() {
		System.out.println("�õ��� ����!");
	}
	
}
