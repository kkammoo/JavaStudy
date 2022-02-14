package com.kh.exam1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// ��ü ����
		Set<Person> set = new HashSet<>();
		
		System.out.println(set.add(new Person("ȫ�浿", 30)));
		System.out.println(set.add(new Person("ȫ�浿", 30))); // �ߺ� (�����)�� ��ü�� �����Ƿ� false ���
		
		System.out.println(set.toString()); // �ߺ��� �ɷ����� ������ ���������� 1���� ����
		System.out.println(set.size()); // �ߺ��� �ɷ����� ������ ������� 1�� ���´�.
	
		set.add(new Person("ȫ�漭", 40));
		set.add(new Person("ȫ�泲", 50));
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("-------------");
		
		// ��ü �˻�
		System.out.println(set.contains(new Person("ȫ���", 60))); // �÷��ǿ� ���� ������ false ��ȯ. 
		System.out.println(set.toString()); // ��ü�� �߰��� ���� �ƴ�, �˻��� �� ��.
		System.out.println(set.size());
		
		System.out.println(set.isEmpty()); // ������� �ʾƼ� false ���
		
		System.out.println("Iterator ���");
		Iterator<Person> iterator = set.iterator();
		
		System.out.println("while��");
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.printf("�̸� : %s, ���� : %d \n", person.getName(), person.getAge());
		}
		
		System.out.println("���� for��");
		for (Person person : set) {
			System.out.printf("�̸� : %s, ���� : %d \n", person.getName(), person.getAge());
		}
		
		System.out.println("-------------");
		
		// ��ü ���� : �ε����� Ȱ���ϴ� ���� �ƴϱ� ������ ���ü�� ã�Ƽ� ��������� �Ѵ�.
		set.remove(new Person("ȫ�泲", 50)); // ȫ�泲, 50 ��ü�� ������ ��ü�� ã�Ƽ� ����
		System.out.println(set.toString());
		System.out.println(set.size());
		
		set.clear(); // ��ü ����
		System.out.println(set.toString());
		System.out.println(set.size());
		
	}

}
