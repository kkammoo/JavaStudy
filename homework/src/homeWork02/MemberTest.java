package homeWork02;

import java.util.*;

public class MemberTest {

	public static void main(String[] args) {
	// Admin ��� �׽�Ʈ
	Member admin = new Member();
	Scanner sc = new Scanner(System.in);
	
	boolean run = false;
	
	while (!run) {
		printLine(72);
		System.out.println("1.�ܾ��� | 2.�ܾ���� | 3.�ܾ�˻� | 4.�ܾ���� | 5.�ܾ��� | 6.��ü��� | 0.�α׾ƿ�");
		printLine(72);
		System.out.println("���� ��ϵ� �ܾ� �� : " + admin.wordBook.size());
		System.out.print("�޴��� �����ϼ��� > ");
		
		
		switch (sc.nextLine()) {
		case "0":
			run = true;
			continue;
		case "1":
			admin.addWord();
			break;
		case "2":
			admin.editWord();
			break;
		case "3":
			admin.searchWord();
			break;
		case "4":
			admin.removeWord();
			break;
		case "5":
			admin.wordList();
			break;
		case "6":
			admin.wordAll();
			break;
		}
		
	} // end of while
	System.out.println("���α׷� ����");

	} // end of main

//���� ���
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
} // end of class
