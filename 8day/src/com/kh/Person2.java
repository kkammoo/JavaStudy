package com.kh;

public class Person2 {
	
	private static final String NATIONALITY = "�ѱ���";
	private int age;
	private static String city = "���";
	
	
//	public Person2() {
//		super();
//	}
	
	
	public static String getNationality() {
		return NATIONALITY;
	}
	
//	public static int getAge() {
//		return age; // Ŭ����(����) �޼ҵ� �ȿ��� �ν��Ͻ� ��� �ʵ�� ����� �� ����. (��ü�� �������� �ʾ� ��� �ʵ尡 ������� �ʾұ� ����.)
//	}
	
	public String getCity() {
		return city; // Ŭ����(����) ��� �ʵ�� �ν��Ͻ� �޼ҵ� �ȿ��� ����� �� �ִ�. (��� �ʵ��� ����� ���� �̹� �ִ� ����. ��ü�� �����ϰ� �� �ڿ� �޼ҵ带 ȣ���� �� �ֱ� ����.)
	}
}
