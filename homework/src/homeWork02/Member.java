package homeWork02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Member implements ForMember {

	String id;
	String pw;

	// 초기화면 기능 구현
	static Map<String, String> loginMap = new HashMap();
	Scanner sc = new Scanner(System.in);
	
	// 1. 로그인
	@Override
	public int logIn(String id, String pw) {
		this.id = id;
		this.pw = pw;
		int result = 0;
		boolean run = false;

		while (!run) {
			loginMap.put("admin", "1234"); // 관리자 ID 기본 제공
			System.out.println("ID를 입력해주세요.(이전 메뉴 : 0)");
			System.out.print("ID : ");
			id = sc.nextLine();

			if (id.equals("0")) {
				run = true;
				break;
			} else if (!id.equals("0")) {
				if (!loginMap.containsKey(id)) {
					System.out.println("등록되지 않은 ID 입니다.");
					System.out.println("이전 메뉴로 돌아가 회원가입을 해주세요.");
					continue;
				} else {
					System.out.println("PW를 입력해주세요.");
					System.out.print("PW : ");
					pw = sc.nextLine();
					if (loginMap.containsValue(pw)) {
						// 로그인 분기
						// 1) 관리자로 로그인한 경우 result = 1 리턴
						if (id.equals("admin")) {
							result = 1;
							// 2) 일반회원으로 로그인한 경우 result = 2 리턴
						} else if (!id.equals("admin")) {
							result = 2;
						}
						break;
					} else {
						System.out.println("PW가 올바르지 않습니다.");
						continue;
					}
				}
			}
		}
		return result;
	}
	// 로그아웃 기능은 switch문에서 해결가능하므로 별도의 메소드 필요없음.
	
	// 2. 회원가입
	@Override
	public void createId(String id, String pw) {
		this.id = id;
		this.pw = pw;
		boolean run = false;

		while (!run) {
			// 관리자 ID를 기본제공하여 관리자 ID로 가입 못하게 함.
			loginMap.put("admin", "1234");
			System.out.println("작성할 ID를 입력하세요.(이전 메뉴 : 0)");
			System.out.print("입력 : ");
			id = sc.nextLine();

			if (id.equals("0")) {
				run = true;
				break;
			} else if (loginMap.containsKey(id)) {
				System.out.println("이미 등록된 ID 입니다.");
				continue;
			} else {
				System.out.println("작성할 ID의 PW 입력하세요.");
				System.out.print("입력 : ");
				pw = sc.nextLine();
				loginMap.put(id, pw);
				break;
			}
		}
		System.out.println("회원가입이 완료되었습니다.");
	}

	// 단어장 기능 구현
	static Map<String, String> wordBook = new HashMap<>();
	
	// 1. 단어등록 (관리)
	@Override
	public void addWord() {
		String word = null;
		String means = null;
		boolean run = false;

		while (!run) {
			System.out.println("등록할 단어를 입력해주세요.(이전 메뉴 : 0)");
			System.out.print("입력 : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word) == true) {
				System.out.println("이미 등록된 단어입니다.");
				continue;
			} else {
				System.out.println("뜻을 입력해주세요.");
				System.out.print("입력 : ");
				means = sc.nextLine();
			}
			wordBook.put(word, means);
			System.out.println("새 단어가 등록되었습니다.");
			break;
		}
	}
	
	// 2. 단어 뜻 수정 (관리)
	@Override
	public void editWord() {
		String word = null;
		String means = null;
		boolean run = false;

		while (!run) {
			System.out.println("뜻을 수정할 단어를 입력해주세요.(이전 메뉴 : 0)");
			System.out.print("입력 : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word) == true) {
				System.out.println("새로운 뜻을 입력해주세요.");
				System.out.print("입력 : ");
				means = sc.nextLine();
			} else {
				System.out.println("없는 단어입니다. 단어목록을 확인해주세요.");
				continue;
			}
			wordBook.put(word, means);
			System.out.println("수정이 완료되었습니다.");
			break;
		}
	}
	
	// 3. 단어검색 (관리)(일반)
	@Override
	public void searchWord() {
		String word = null;
		boolean run = false;

		while (!run) {
			System.out.println("검색할 단어를 입력해주세요.(이전 메뉴 : 0)");
			System.out.print("입력 : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word)) {
				System.out.println("뜻 : " + wordBook.get(word));
				break;
			} else {
				System.out.println("없는 단어입니다. 단어목록을 확인해주세요.");
				continue;
			}
		}
	}
	
	// 4. 단어삭제 (관리)
	@Override
	public void removeWord() {
		String word = null;
		boolean run = false;

		while (!run) {
			System.out.println("삭제할 단어를 입력해주세요.(이전 메뉴 : 0)");
			System.out.print("입력 : ");
			word = sc.nextLine();

			if (word.equals("0")) {
				run = true;
				break;
			} else if (wordBook.containsKey(word)) {
				wordBook.remove(word);
				System.out.println("단어가 삭제되었습니다.");
				break;
			} else {
				System.out.println("없는 단어입니다. 단어목록을 확인해주세요.");
				continue;
			}
		}
	}
	
	// 5. 단어목록 (관리)(일반)
	@Override
	public void wordList() {
		Set<String> words = wordBook.keySet();
		// 저장된 단어가 없을 경우.
		if (wordBook.size() == 0) {
			System.out.println("등록된 단어가 없습니다.");
		} else {
			System.out.println("현재 등록된 단어 목록입니다.");
			for (String word : words) {
				System.out.println(word);
			}
		}
	}
	
	// 6. 전체목록 (관리)
	@Override
	public void wordAll() {
		Set<Entry<String, String>> wordsAll = wordBook.entrySet();
		if (wordBook.size() == 0) {
			System.out.println("등록된 자료가 없습니다.");
		} else {
			System.out.println("현재 등록된 자료 목록입니다.");
			for (Entry<String, String> ele : wordsAll) {
				String word = ele.getKey();
				String means = ele.getValue();
				System.out.println(word + "\t" + means);
			}
		}
	}
}
