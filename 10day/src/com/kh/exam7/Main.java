package com.kh.exam7;

public class Main {

	public static void main(String[] args) {
		
		// �ڽ� ��ü �޼ҵ� ����
		Student student = new Student();
		student.study();
		
		// �͸� �ڽ� ��ü ����
		new Person() {
		
			void study() {
				System.out.println("�����ϴ�2");
			}
		}.study();
		
		
		// �ڽ� ��ü �޼ҵ� ������
		Person person = new Student();
		person.eat();
		
		// �͸� �ڽ� ��ü �޼ҵ� ������
		Person person2 = new Person() {
			@Override
			public void eat() {
				System.out.println("���� �Դ�2");
			}
		};
		person2.eat();
		
		
		
		
	}

}
