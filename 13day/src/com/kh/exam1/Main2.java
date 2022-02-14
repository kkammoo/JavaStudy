package com.kh.exam1;

import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {

		Set<String> setA = new HashSet<>();
		Set<String> setB = new HashSet<>();
		
		setA.add(new String("���"));
		setA.add(new String("�ٳ���"));
		setA.add(new String("����"));
		setA.add(new String("�丶��"));
		
		setB.add(new String("����"));
		setB.add(new String("��"));
		setB.add(new String("����"));
		setB.add(new String("�丶��"));
		
		// ������
		setA.addAll(setB);
		System.out.println(setA);
		
		// ������ (����� ���尴ü ����)
		setA.retainAll(setB);
		System.out.println(setA);
		
		// ������ (����� ���� ������, ������ ���尴ü ����)
		setA.removeAll(setB);
		System.out.println(setA);
	}

}
