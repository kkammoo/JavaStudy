package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���ϼ� ��� ��");
		
		// Object Ŭ������ superŬ������ PersonŬ����
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		
		
		// �񱳿����� ==�� Object Ŭ�������� ��ӹ��� equals�޼ҵ� ��� ��
		// Object Ŭ������ equals �޼ҵ�� == �񱳸� �ϰ� �ִ�.
		// �׷��� �Ʒ��� �� ������� ����.
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		// PersonŬ�������� equals() �޼ҵ带 ��� �񱳸� ���� �޼ҵ�� ��������
		// ������� �ٸ��� ��Ÿ����. (�ּҰ� �� (==), ��ü �Ӽ��� ��(equals())
		
		System.out.println("=======================");
		
		System.out.println("�� ����, �ּҰ� ����");
		
		int a = 10;
		int b = a; // a�� '��'�� b�� ����
		b = 20; // b�� �� ����. a�� ���� ������ ���� �ƴϴ� a = 10
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("------------");
		
		Person p3 = new Person(10);
		Person p4 = p3; // p3�� '�ּҰ�'�� p4�� ����. p3�� p4�� ���� �ּҰ�(���� ��ü)�� ����Ŵ. 
		p4.setAge(20); // p4�� ��ü���� �����ϸ� ���� �ּҰ��� ����Ű�� �ִ� p3�� ������ �޴´�.
		System.out.println("p3.age = " + p3.getAge());
		System.out.println("p4.age = " + p4.getAge());
		
		// ����Ÿ�Կ����� 2�� �̻��� ���������� ����Ÿ�� ��ü�� �������� ������ �� �ַ��� ������ ��ü�� �����ؾ� �Ѵ�.
		Person p5 = new Person(10);
		Person p6 = new Person(10);  
		p6.setAge(20);
		System.out.println("p5.age = " + p5.getAge());
		System.out.println("p6.age = " + p6.getAge());
		
		System.out.println("=======================");
		
		System.out.println("���ڿ� ��ü ���� ��");
		
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		System.out.println(name1 == name2); // true�� ���´�. �ּҰ��� ���ٴ� ��.
		System.out.println(name1.equals(name2)); // String Ŭ�������� equals()�޼ҵ带 ��� �� �޼ҵ�� ������ ��.

		String name3 = new String("ȫ�浿");
		String name4 = new String("ȫ�浿");
		System.out.println(name3 == name4); // false�� ���´�. �ּҰ��� �ٸ��ٴ� ��.
		System.out.println(name3.equals(name4)); // ��ü���� ���� ������ true�� ���´�.
		
		
	}

}
