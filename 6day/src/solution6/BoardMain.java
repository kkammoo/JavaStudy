package solution6;

import java.util.Scanner;

public class BoardMain {

	static Board[] boards = new Board[10]; // 메인 메소드 안에 있는 변수가 아닌, 클래스의 필드로 놓으면 추가 메소드에서도 사용할 수 있다.
	
	public static void main(String[] args) {
		
		Board board1 = new Board("제목1", "내용1");
		Board board2 = new Board("제목2", "내용2", "글쓴이2");
		Board board3 = new Board("제목3", "내용3", "글쓴이3", "현재날짜3");
		Board board4 = new Board("제목4", "내용4", "글쓴이4", "현재날짜4", 0);
		
		
		// 게시글을 담을 수 있는 배열 프로그램
		boolean stop = false;
		String selectedNumber = null;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			String title = null;
			String content = null;
		
			System.out.println("1.게시글 등록 2.게시글 전체조회 0.종료");
			System.out.print("선택 > ");
			
			selectedNumber = scanner.nextLine();
			
			switch (selectedNumber) {
			case "0":
				stop = true;
				continue;
				
			case "1": // 게시글 등록
				System.out.print("제목 : ");
				title = scanner.nextLine();
				System.out.print("내용 : ");
				content = scanner.nextLine();
				
				Board board = new Board(title, content);
				write(board);
				// write(new Board(title, content));
				break;
				
			case "2": // 게시글 전체조회
				list();
				break;
				
			case "3":
				break;
				
			default:
			}
			
		} while (!stop);
		
		System.out.println("프로그램 종료!");
	} // end of main
	
	// 게시글 등록
	public static void write(Board board) {
		
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}
	
	// 게시글 전체조회
	public static void list()	{
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.printf("%s \t %s \n", boards[i].title, boards[i].content);
			}
		}
	}
} // end of class
