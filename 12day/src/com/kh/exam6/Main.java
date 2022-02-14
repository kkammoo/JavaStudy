package com.kh.exam6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���*KH".substring(3));
		System.out.println("���----------------*KH".indexOf("*")+1); // KH�� �ε��� ��ȣ ã��.
		System.out.println("���----------------*KH".substring(19)); // indexOf() �޼ҵ�� ã�� �ε��� ��ȣ�� �̿��ؼ� ���� ����
		
		// ����
		String str2 = "���----------------*KH";
		int findedPosition = str2.indexOf("*")+1;
//		System.out.println(str2.substring(str2.indexOf("*")+1));
		System.out.println(str2.substring(findedPosition));
		
		
		
		
		// ��ĳ�ʸ� Ȱ���Ͽ� ���ϴ� ���ڿ� ���
		boolean stop = false;
		
		while(!stop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			System.out.println(name);
			
			// �̸��� ���ڰ� ���� ���Է��ϵ��� ����
			if (existNumber(name)) {
				System.out.println("�̸��� ���ڰ� ���ԵǾ����ϴ�.");
				continue;
			} else {
				stop = true;
				continue;
			}
			
		} // end of while
		
	} // end of main

	// �̸��� ���ڰ� ���� ���Է��ϵ��� ����
	private static boolean existNumber(String name) {
		
		boolean result = false;
		
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if (ch >= 48 && ch <= 58) { // �ƽ�Ű �ڵ带 �̿��� 0~9�� ���ԵǾ����� Ȯ��.
//				System.out.println("�̸��� ���ڰ� ���ԵǾ����ϴ�");
				result = true;
				break;
			}
//			System.out.println(ch);
		}
		
		return result;
	}

}
