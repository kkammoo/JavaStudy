package solution6;

public class MemberService {
	
	private int failCount; 										// 로그인 실패 횟수
	private final String ID = "hong";					// 아이디
	private final String PASSWORD = "12345";	// 비밀번호
	// final : 상수. 변하지 않는 고정값.
	
	// 로그인 메소드
	public Loginchk login(String id, String password) {
		
		Loginchk result = null; // 초기값
		
		if (id.equals(ID) && password.equals(PASSWORD)) {
			result = Loginchk.OK; // 성공
			failCount = 0; // 로그인에 성공하면 실패 횟수 0으로 초기화
			
		} else {
//			failCount++; // id 혹은 pw가 틀리면 실패 횟수 1씩 증가
			if (++failCount == 3) {
				result = Loginchk.FAIL;
			} else {
				result = Loginchk.NOK;
			}
		}
		
		return result; 
	}
	
	// 로그아웃 메소드
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
