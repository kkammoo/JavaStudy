package com.kh.exam10;

public class Main {
	public static void main(String[] args) {
		
		String name = "ȫ�浿";
		String name2 = "ȫ�浿";
		
		System.out.println(name.equals(name2));
		// 17������ ���� String Ŭ�������� equals() �޼ҵ尡 ���ڿ� ���� ��ġ���η� ������ �� ���� �� �� �־���.
		
		System.out.println(name == name2); // �̹� ������� "ȫ�浿"�̶� ���� ������ �ִ� �ּҰ��� �����ϱ� ������ true�� ���
		
		System.out.println("======================");
		
		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
		
		System.out.println(name3.equals(name4));
		// �Ʒ��� (person.equals(person2))�� �޸� true�� ������ ����
		// Object�� ��ӹ��� String Ŭ�������� equals()�޼ҵ尡
		// ��ü�� �ּҰ� �ƴ�, ���ڿ� ������ ��ġ���η� ������ �Ʊ� ����
		
		System.out.println(name3 == name4); // ��ü�� ���� ������ �� ���� �ּҰ� �����Ǳ� ������ false ���
		
		System.out.println("======================");
		
		Person person = new Person();
		Person person2 = new Person();
		
		System.out.println(person.equals(person2));
		// ���޸� ���� person ��ü, person2 ��ü�� �ּҰ��� ��(ObjectŬ������ �ִ� equals() �̿�)
		// Object Ŭ������ equals�� �� ��ü�� �ּҰ��� ���Ѵ�.
		

		
		
	}
}
