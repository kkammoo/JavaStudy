package com.kh.exam9;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person() { // ��� ������ �͸��� �ڽ� Ŭ������ ����
			
			public void study() { // ���� ���ǵ� �޼ҵ�� �� ��� �ȿ��� Ȱ���� �� �ִ�.
				System.out.println("�����ϴ�");
			}
			
			@Override
			public void eat() { // �θ� Ŭ������ �޼ҵ带 ������ �� �� �ִ�.
				System.out.println("���� �Դ�");
				study();
			}
			
		};
		person.eat();
		
		// ������ ���� ������ study �޼ҵ带 �ٽ� �ҷ����� ���ؼ� �ڽ� Ŭ������ �ٽñ� �����ؾ� �Ѵ�.

	}

}
