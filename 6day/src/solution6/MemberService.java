package solution6;

public class MemberService {
	
	private int failCount; // �α��� ���� Ƚ��

	
	// �α��� �޼ҵ�
	public int login(String id, String password) {
		
		int result = 0; // ����
		
		if (id.equals("hong") && password.equals("12345")) {
			result = 1; // ����
			failCount = 0; // �α��ο� �����ϸ� ���� Ƚ�� 0���� �ʱ�ȭ
			
		} else {
			result = 0;
//			failCount++; // id Ȥ�� pw�� Ʋ���� ���� Ƚ�� 1�� ����
			if (++failCount == 3) {
				result = -1;
			}
		}
		
		return result; 
	}
	
	// �α׾ƿ� �޼ҵ�
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
