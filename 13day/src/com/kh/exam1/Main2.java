package com.kh.exam1;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {

		Set<String> setA = new HashSet<>();
		Set<String> setB = new HashSet<>();
		
		setA.add(new String("사과"));
		setA.add(new String("바나나"));
		setA.add(new String("딸기"));
		setA.add(new String("토마토"));
		
		setB.add(new String("배추"));
		setB.add(new String("무"));
		setB.add(new String("깻잎"));
		setB.add(new String("토마토"));
		
		// 합집합
		setA.addAll(setB);
		System.out.println(setA);
		
		// 교집합 (공통된 저장객체 추출)
		setA.retainAll(setB);
		System.out.println(setA);
		
		// 차집합 (공통된 것을 제외한, 고유의 저장객체 추출)
		setA.removeAll(setB);
		System.out.println(setA);
	}

}
