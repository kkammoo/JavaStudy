package com.kh.exam1;

public class Main {

	public static void main(String[] args) {
		
	// �̸��� �ִ� �ڽ�Ŭ������ ����� �޼ҵ� ������
	Person person = new Man();
	person.eat();
	
	((Man)person).smile(); // ��������ȯ ����
		
		
	// �͸� �ڽ�Ŭ������ ����� �޼ҵ� ������
	Person person2 = new Person() {
		@Override
		public void eat() {
			System.out.println("���� �Դ�2");
			smile();
		}
	// �͸� �ڽ�Ŭ���� ���ο��� ���Ӱ� ���ǵ� �ʵ� Ȥ�� �޼ҵ�� ���ο����� ��� �����ϴ�.
		private void smile() {
			System.out.println("����2");
		}
	};
	person2.eat();
//	person2.smile(); ��� �ٱ����� �ش� �޼ҵ带 �ҷ��� �� ����.
	}

}
