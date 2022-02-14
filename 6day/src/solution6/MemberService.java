package solution6;

public class MemberService {
	
	private int failCount; // 로그인 실패 횟수

	
	// 로그인 메소드
	public int login(String id, String password) {
		
		int result = 0; // 실패
		
		if (id.equals("hong") && password.equals("12345")) {
			result = 1; // 성공
			failCount = 0; // 로그인에 성공하면 실패 횟수 0으로 초기화
			
		} else {
			result = 0;
//			failCount++; // id 혹은 pw가 틀리면 실패 횟수 1씩 증가
			if (++failCount == 3) {
				result = -1;
			}
		}
		
		return result; 
	}
	
	// 로그아웃 메소드
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
