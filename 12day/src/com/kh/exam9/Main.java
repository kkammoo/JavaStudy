package com.kh.exam9;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// List �÷��ǿ� ��ü �߰�
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("ȫ�浿", 30));
		list.add(new Person("ȫ�漭", 40));
		list.add(new Person("ȫ�泲", 50));
		list.add(1, new Person("ȫ���", 20)); // 1�� �ε����� ȫ���, 20 ��ü�� ����. ������ 1�� �ε����� �ִ� ȫ�漭~ �ڵ����� ���ʰ� �и���.
		list.set(3, new Person("ȫ���", 10)); // 3�� �ε��� (���� ȫ�泲)�� ��ü�� ȫ���, 10 ��ü�� ����(��ü).
		
		System.out.println(list); // toString()�޼ҵ�� ���� ��ü Ȯ��
		System.out.println(list.size()); // list�� ����Ǿ� �ִ� ��ü ��. ��ü�� �߰��ʿ� ���� �ڵ����� �þ��.
		
		System.out.println("----------");
		
		// List �÷��ǿ� ����Ǿ� �ִ� ���尴ü Ȯ��(�˻�)
		System.out.println(list.contains(new Person("ȫ�浿", 30)));
		// hashCode�� equals�� ������ ���� �����ϸ� ����񱳿� ���� ������ ���� ������ false�� ���´�.
		// Person Ŭ�������� hashCode�� equals�� ������ �� ���� �����ϸ� true�� ���´�.
		
		// get�� �̿��� Ư�� ��ġ�� ��ü �˻�
		Person person = (Person)list.get(0); // get�޼ҵ�� ObjectŬ�������� �������� ������ Person���� ����ȯ ����
		System.out.printf("�̸� : %s, ���� : %d\n", person.getName(), person.getAge());
		
		// �ε����� ����ִ��� �ƴ��� Ȯ�� : ��� ������ true
		System.out.println(list.isEmpty());
		
		System.out.println("----------");
		
		// List �÷��ǿ� ����Ǿ� �ִ� ���尴ü ����
		Person removePerson = list.remove(1); // �ε��� 1���� �ִ� ȫ����� ����
		System.out.println(list.toString()); // ȫ����� ���� ������ ��µ��� �ʴ´�.
		System.out.println(list.size()); // �÷��� ����� 4���� 3���� 1 ����.
		
		System.out.println(list.remove(new Person("ȫ�浿", 30))); // ȫ�浿, 30 �� ��ü������ ���� ��ü ����
		System.out.println(list.toString()); // Ȯ���غ��� ȫ�浿 ��ü�� ������ �� �� �� �ִ�.
		System.out.println(list.size()); // ����� 3���� 2�� ����
		
		list.clear(); // ���� ��ü ���� ����.
		System.out.println(list.toString()); // �÷��ǿ� �ƹ��� ������ ����.
		System.out.println(list.size()); // ����� 0���� ����
		
		
	}

}
