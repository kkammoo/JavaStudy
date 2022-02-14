package com.words.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary implements DicAdminIf, DicCustomerIf{

	private Map<String,String> map = new HashMap<>();
	
	//등록
	@Override
	public void put(String word, String meaning) {
		// 이미 등록된 단어일 경우
		dupChk(word);
		map.put(word, meaning);
	}
	
	//수정
	@Override
	public void update(String word, String meaning) {
		existChk(word);
		map.put(word, meaning);
	}
	
	//삭제
	@Override
	public String remove(String word) {
		existChk(word);
		return map.remove(word);
	}
	
	//검색
	@Override
	public String find(String word) {
		String meaning = map.get(word);
		existChk(word);
		return meaning;
	}
	
	//단어목록
	@Override
	public Set<String> listWords(){
		countChk();
		return map.keySet();
	}
	
	//전체목록
	@Override
	public Map<String,String> listAll(){
		countChk();
		return map;
	}
	
	//전체삭제
	@Override
	public void removeAll() {
		countChk();
		map.clear();
	}
	
	// 등록 단어 중복 체크
	private void dupChk(String word) {
		if (map.containsKey(word)) {
			throw new IllegalArgumentException("이미 등록된 단어입니다");
		};
	}
	
	// 단어 존재유무 체크
	private void existChk(String word) {
		if (!map.containsKey(word)) {
			throw new IllegalArgumentException("찾고자 하는 단어가 없습니다");
		}
	}
	
	// 단어 개수 체크
	private void countChk() {
		if (map.size() == 0) {
			throw new IllegalArgumentException("등록된 단어가 없습니다");
		};
	}
}





