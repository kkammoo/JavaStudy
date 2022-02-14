package com.words.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Members implements MembersIf {
	
	private Map<String, String> map = new HashMap<>();
	private final String ADMIN_ID = "admin";
	private final String ADMIN_PW = "1234";
	
	public Members() {
		map.put(ADMIN_ID, ADMIN_PW);
	}
	
	/**
	 *  ȸ������
	 * @param id ȸ�� ���̵�
	 * @param pw ȸ�� ��й�ȣ
	 */
	@Override
	public void joinMember(String id, String pw) {
		// ���̵� �ߺ�üũ
		if (map.containsKey(id)) {
			throw new IllegalStateException("ȸ�� ���̵�� ����� �� �����ϴ�.");
		}
		map.put(id, pw);
	}
	
	/**
	 * ȸ������
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return ȸ������(��������, ������, �Ϲ�ȸ��)
	 */
	@Override
	public LoginChk isMember(String id, String pw) {
		LoginChk loginChk = null;
		
		// ã���� �ϴ� ���̵� ���� ���.
		if (map.get(id) == null) {
			loginChk = LoginChk.FAIL;
		}
		
		// ������
		if (id.equals(ADMIN_ID) && pw.equals(ADMIN_PW)) {
			loginChk = LoginChk.ADMIN;
		// �Ϲ�ȸ��
		} else if (map.get(id).equals(pw)){
			loginChk = LoginChk.MEMBER;
		}
		
		return loginChk;
	}
	
	/**
	 * ȸ��Ż��
	 * @param id ���̵�
	 * @param pw ��й�ȣ
	 * @return Ż�� ��������
	 */
	@Override
	public boolean outMember(String id, String pw) {
		boolean result = false;

		if (map.get(id).equals(pw)) {
			map.remove(id);
			result = true;
		}
		return result;
	}
	
	/**
	 * ȸ����Ȳ
	 */
	@Override
	public Set<Entry<String, String>> getMembers() {
		
		return map.entrySet();
	}
}