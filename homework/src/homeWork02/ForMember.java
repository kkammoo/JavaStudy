package homeWork02;

public interface ForMember {
	
	// 초기화면 기능
	// 1. 로그인
	int logIn(String id, String pw); // 관리자, 일반회원에 따라 리턴값을 다르게 줘서 분기
	
	// 2. 회원가입
	void createId(String id, String pw);
	
	// 단어장 기능
	// 관리자 기능 : (관리), 일반회원 기능 : (일반)
	// 일반회원의 고유 기능은 없음. 전체 기능 중 일부를 사용하므로 하나의 구현 클래스만 있으면 됨.
	
	// 1. 단어등록 (관리)
	void addWord();
	
	// 2. 단어 뜻 수정 (관리)
	void editWord();
	
	// 3. 단어검색 (관리)(일반)
	void searchWord();
	
	// 4. 단어삭제 (관리)
	void removeWord();

	// 5. 단어목록 (관리)(일반)
	void wordList();
	
	// 6. 전체목록 (관리)
	void wordAll();
	
}
