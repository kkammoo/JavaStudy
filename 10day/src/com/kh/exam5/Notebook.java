package com.kh.exam5;

public class Notebook {
	
	// 객체와 필드의 생명주기가 같은 강결합 관계
	private Pannel pannel;
	private Keyboard keyboard;
	
	public Notebook (Pannel pannel, Keyboard keyborad) {
		this.pannel = pannel;
		this.keyboard = keyborad;
	}
}
