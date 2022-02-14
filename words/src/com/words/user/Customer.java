package com.words.user;

import java.util.Set;

import com.words.dic.DicAdminIf;

public class Customer extends User {

private DicAdminIf	dictionary;
	
	public Customer(DicAdminIf dictionary) {
		this.dictionary = dictionary;
	}
	
	// �ܾ� �˻�
	public String find(String word) {
		return dictionary.find(word);
	}
	// �ܾ� ���
	public Set<String> listWords() {
		return dictionary.listWords();
	}
}
