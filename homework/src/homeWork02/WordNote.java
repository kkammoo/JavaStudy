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
			// 초기화면
			printLine(25);
			System.out.println("1.로그인 | 2.회원가입 | 0.종료");
			printLine(25);
			System.out.print("메뉴를 선택하세요 > ");

			switch (sc.nextLine()) {
			case "0": // 프로그램 종료
				mainRun = true;
				break;
			case "1": // 로그인
				result = member.logIn(id, pw);
				// 관리자로 로그인
				if (result == 1) {
					System.out.println("관리자로 로그인 되었습니다.");
					// 관리자 메뉴
					while (!adminRun) {
						printLine(70);
						System.out.println("1.단어등록 | 2.단어수정 | 3.단어검색 | 4.단어삭제 | 5.단어목록 | 6.전체목록 | 0.로그아웃");
						printLine(70);
						System.out.println("현재 등록된 단어 수 : " + member.wordBook.size());
						System.out.print("메뉴를 선택하세요 > ");

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

					System.out.println("로그아웃 되었습니다.");
					continue;

					// 일반회원으로 로그인 : 관리자 기능의 일부 기능만 제공
				} else if (result == 2) {
					System.out.println("로그인 되었습니다.");
					// 일반회원 메뉴
					while (!memberRun) {
						printLine(29);
						System.out.println("1.단어검색 | 2.단어목록 | 0.로그아웃");
						printLine(29);
						System.out.println("현재 등록된 단어 수 : " + member.wordBook.size());
						System.out.print("메뉴를 선택하세요 > ");

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

					System.out.println("로그아웃 되었습니다.");
					continue;
				}
				break;
			case "2": // 회원가입
				member.createId(member.id, member.pw);
				break;
			}
		} // end of main while

		System.out.println("프로그램이 종료되었습니다.");
	} // end of main

//라인 출력
	public static void printLine(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
} // end of class
