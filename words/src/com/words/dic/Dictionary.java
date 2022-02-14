package com.words.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf, DicCustomerIf{

	private Map<String,String> map = new HashMap<>();
	
	//���
	@Override
	public void put(String word, String meaning) {
		// �̹� ��ϵ� �ܾ��� ���
		dupChk(word);
		map.put(word, meaning);
	}
	
	//����
	@Override
	public void update(String word, String meaning) {
		existChk(word);
		map.put(word, meaning);
	}
	
	//����
	@Override
	public String remove(String word) {
		existChk(word);
		return map.remove(word);
	}
	
	//�˻�
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		existChk(word);
		return meaning;
	}
	
	//�ܾ���
	@Override
	public Set<String> listWords(){
		countChk();
		return map.keySet();
	}
	
	//��ü���
	@Override
	public Map<String,String> listAll(){
		countChk();
		return map;
	}
	
	//��ü����
	@Override
	public void removeAll() {
		countChk();
		map.clear();
	}
	
	// ��� �ܾ� �ߺ� üũ
	private void dupChk(String word) {
		if (map.containsKey(word)) {
			throw new IllegalArgumentException("�̹� ��ϵ� �ܾ��Դϴ�");
		};
	}
	
	// �ܾ� �������� üũ
	private void existChk(String word) {
		if (!map.containsKey(word)) {
			throw new IllegalArgumentException("ã���� �ϴ� �ܾ �����ϴ�");
		}
	}
	
	// �ܾ� ���� üũ
	private void countChk() {
		if (map.size() == 0) {
			throw new IllegalArgumentException("��ϵ� �ܾ �����ϴ�");
		};
	}
}





