package com.kh.exam2;

public class Main {

	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		String name2 = new String("ȫ�浿");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.toString());
		
		System.out.println("----------");
		Person p1 = new Person("ȫ�浿");
		System.out.println(p1);
		System.out.println(p1.toString());
		// ���� ������� ��ü�� ������µ� �� Person�� �ּҰ��� ���ñ�?
		// Object���� ��ӹ��� toString()�޼ҵ带 String Ŭ�������� ������ �߱� ����. equals()�� ���� ����.
		// Person Ŭ�������� toString() �޼ҵ带 ������ �ߴ��� �ּҰ��� �ƴ� ��ü���� ��µƴ�.
		
		System.out.println("==================");
		System.out.println("�ؽ��ڵ�");
		
		System.out.println(name2.hashCode());
		System.out.println(p1.hashCode());
	}

}
