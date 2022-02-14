package com.kh;

public class Operator {

	public static void main(String[] args) {
		
		// 1) 증감연산자가 단독으로 사용될 경우 : 전위 증감연산자, 후위 증감연산자
		int x = 1;
		int y = 1;
		
		++x;
		y++;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 증감연산자가 단독으로 사용될 때엔 연산자를 앞에 붙이든, 뒤에 붙이든 상관없다.
		
		// 2) 증감연산자가 수식에 참여할 때.
		// 	  전위 증감연산자 : 자기자신을 증감한 후 식에 참여.
		//	  후위 증감연산자 : 식에 참여한 후 자기자신을 증감.
		
		int i = 1;
		int j = 1;
		
		int m = ++i + 1; // 자기자신을 증감한 후 (i -> 2) 식에 참여 : 2 + 1 = 3
		int n = j++ + 1; // 식에 먼저 참여한 후 (1 + 1 = 2) 자기자신을 증감. (j -> 2)
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.printf("i = %d, j = %d \n", i, j);

	}

}
