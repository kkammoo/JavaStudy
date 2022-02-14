package com.kh.exam5;

public class Main {

	public static void main(String[] args) {


		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4); // 배열 bytes의 인덱스 번호 6번부터(0~6이니깐 7번째인 74부터) 뒤로 4자리
		System.out.println(str2);

	}

}
