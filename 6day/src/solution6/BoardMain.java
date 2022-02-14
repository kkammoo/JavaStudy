package solution6;

import java.util.Scanner;

public class BoardMain {

	static Board[] boards = new Board[10]; // ���� �޼ҵ� �ȿ� �ִ� ������ �ƴ�, Ŭ������ �ʵ�� ������ �߰� �޼ҵ忡���� ����� �� �ִ�.
	
	public static void main(String[] args) {
		
		Board board1 = new Board("����1", "����1");
		Board board2 = new Board("����2", "����2", "�۾���2");
		Board board3 = new Board("����3", "����3", "�۾���3", "���糯¥3");
		Board board4 = new Board("����4", "����4", "�۾���4", "���糯¥4", 0);
		
		
		// �Խñ��� ���� �� �ִ� �迭 ���α׷�
		boolean stop = false;
		String selectedNumber = null;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			String title = null;
			String content = null;
		
			System.out.println("1.�Խñ� ��� 2.�Խñ� ��ü��ȸ 0.����");
			System.out.print("���� > ");
			
			selectedNumber = scanner.nextLine();
			
			switch (selectedNumber) {
			case "0":
				stop = true;
				continue;
				
			case "1": // �Խñ� ���
				System.out.print("���� : ");
				title = scanner.nextLine();
				System.out.print("���� : ");
				content = scanner.nextLine();
				
				Board board = new Board(title, content);
				write(board);
				// write(new Board(title, content));
				break;
				
			case "2": // �Խñ� ��ü��ȸ
				list();
				break;
				
			case "3":
				break;
				
			default:
			}
			
		} while (!stop);
		
		System.out.println("���α׷� ����!");
	} // end of main
	
	// �Խñ� ���
	public static void write(Board board) {
		
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	// �Խñ� ��ü��ȸ
	public static void list()	{
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.printf("%s \t %s \n", boards[i].title, boards[i].content);
			}
		}
	}
} // end of class
