package homeWork02;

import java.util.Scanner;

public class WordNote {

	public static void main(String[] args) {

		Member member = new Member();
		Scanner sc = new Scanner(System.in);

		boolean mainRun = false;
		boolean adminRun = false;
		boolean memberRun = false;
		String id = null;
		String pw = null;
		int result = 0;

		while (!mainRun) {
			// �ʱ�ȭ��
			printLine(25);
			System.out.println("1.�α��� | 2.ȸ������ | 0.����");
			printLine(25);
			System.out.print("�޴��� �����ϼ��� > ");

			switch (sc.nextLine()) {
			case "0": // ���α׷� ����
				mainRun = true;
				break;
			case "1": // �α���
				result = member.logIn(id, pw);
				// �����ڷ� �α���
				if (result == 1) {
					System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
					// ������ �޴�
					while (!adminRun) {
						printLine(70);
						System.out.println("1.�ܾ��� | 2.�ܾ���� | 3.�ܾ�˻� | 4.�ܾ���� | 5.�ܾ��� | 6.��ü��� | 0.�α׾ƿ�");
						printLine(70);
						System.out.println("���� ��ϵ� �ܾ� �� : " + member.wordBook.size());
						System.out.print("�޴��� �����ϼ��� > ");

						switch (sc.nextLine()) {
						case "0":
							adminRun = true;
							continue;
						case "1":
							member.addWord();
							break;
						case "2":
							member.editWord();
							break;
						case "3":
							member.searchWord();
							break;
						case "4":
							member.removeWord();
							break;
						case "5":
							member.wordList();
							break;
						case "6":
							member.wordAll();
							break;
						}
					} // end of admin while

					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					continue;

					// �Ϲ�ȸ������ �α��� : ������ ����� �Ϻ� ��ɸ� ����
				} else if (result == 2) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					// �Ϲ�ȸ�� �޴�
					while (!memberRun) {
						printLine(29);
						System.out.println("1.�ܾ�˻� | 2.�ܾ��� | 0.�α׾ƿ�");
						printLine(29);
						System.out.println("���� ��ϵ� �ܾ� �� : " + member.wordBook.size());
						System.out.print("�޴��� �����ϼ��� > ");

						switch (sc.nextLine()) {
						case "0":
							memberRun = true;
							continue;
						case "1":
							member.searchWord();
							break;
						case "2":
							member.wordList();
							break;
						}
					} // end of member while

					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					continue;
				}
				break;
			case "2": // ȸ������
				member.createId(member.id, member.pw);
				break;
			}
		} // end of main while

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} // end of main

//���� ���
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
} // end of class
