package com.kh;

import java.util.Scanner; // java��Ű�� �ȿ� �ִ� util��Ű�� �ȿ� �ִ� ScannerŬ������ �ҷ����ڴ�.
													// �ٸ� ��Ű���� �ֱ� ������ import�� �ؾ� �Ѵ�.

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Person person = new Person("ȫ�浿", 30); // import�� �� �ص� �Ǵ� ���� : ���� ��Ű�� �ȿ� �ֱ� ����.
		person.eat(); // Person Ŭ���� �ȿ� �ִ� �޼ҵ带 �ҷ��ͼ� ����
		person.smile();
		
		Person person2 = new Person("ȫ���", 20);
		person2.eat();
		person2.smile();
		
	}

}
