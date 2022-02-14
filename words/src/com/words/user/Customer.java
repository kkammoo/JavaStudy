package com.words.user;

import java.util.Set;

import com.words.dic.DicAdminIf;

public class Customer extends User {

private DicAdminIf	dictionary;
	
	public Customer(DicAdminIf dictionary) {
		this.dictionary = dictionary;
	}
	
	// 단어 검색
	public String find(String word) {
		return dictionary.find(word);
	}
	// 단어 목록
	public Set<String> listWords() {
		return dictionary.listWords();
	}
}
