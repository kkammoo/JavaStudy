package com.kh.exam7;

public class Main {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		System.out.println(name == name2); // 메모리 영역 안에 같은 값이 있으면 새로운 객체를 안 만들고 기존의 객체를 참조함 : 주소값 같음
		
		String name3 = name2.replace('동', '순'); // replace() 메소드를 이용하면 '동'을 '순'으로 수정하는 것이 아니라 '순'의 객체를 새로 만들어서 그 주소값을 대입함
		System.out.println(name2 == name3); // 그러므로 name2와 name3의 주소값은 다르다.
	}

}
