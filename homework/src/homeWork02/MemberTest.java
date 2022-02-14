package homeWork02;

import java.util.*;

public class MemberTest {

	public static void main(String[] args) {
	// Admin 기능 테스트
	Member admin = new Member();
	Scanner sc = new Scanner(System.in);
	
	boolean run = false;
	
	while (!run) {
		printLine(72);
		System.out.println("1.단어등록 | 2.단어수정 | 3.단어검색 | 4.단어삭제 | 5.단어목록 | 6.전체목록 | 0.로그아웃");
		printLine(72);
		System.out.println("현재 등록된 단어 수 : " + admin.wordBook.size());
		System.out.print("메뉴를 선택하세요 > ");
		
		
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
	System.out.println("프로그램 종료");

	} // end of main

//라인 출력
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
} // end of class
