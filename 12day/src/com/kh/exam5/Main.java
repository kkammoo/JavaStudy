package com.kh.exam5;

public class Main {

	public static void main(String[] args) {


		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4); // �迭 bytes�� �ε��� ��ȣ 6������(0~6�̴ϱ� 7��°�� 74����) �ڷ� 4�ڸ�
		System.out.println(str2);

	}

}
