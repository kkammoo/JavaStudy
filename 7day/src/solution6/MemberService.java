package solution6;

public class MemberService {
	
	private int failCount; 										// �α��� ���� Ƚ��
	private final String ID = "hong";					// ���̵�
	private final String PASSWORD = "12345";	// ��й�ȣ
	// final : ���. ������ �ʴ� ������.
	
	// �α��� �޼ҵ�
	public Loginchk login(String id, String password) {
		
		Loginchk result = null; // �ʱⰪ
		
		if (id.equals(ID) && password.equals(PASSWORD)) {
			result = Loginchk.OK; // ����
			failCount = 0; // �α��ο� �����ϸ� ���� Ƚ�� 0���� �ʱ�ȭ
			
		} else {
//			failCount++; // id Ȥ�� pw�� Ʋ���� ���� Ƚ�� 1�� ����
			if (++failCount == 3) {
				result = Loginchk.FAIL;
			} else {
				result = Loginchk.NOK;
			}
		}
		
		return result; 
	}
	
	// �α׾ƿ� �޼ҵ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
