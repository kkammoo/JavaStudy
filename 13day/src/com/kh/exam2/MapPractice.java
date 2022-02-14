package com.kh.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		// ���
		map.put("person", "���");
		map.put("student", "�л�");
		map.put("teacher", "������");
		
		// ��ü ��ȸ
		System.out.println("��ü��ȸ");
		Set<Entry<String, String>> set = map.entrySet();
		wordList(set);
		System.out.println("----------");
		
		// �ܾ� ��ȸ
		System.out.println("�ܾ���ȸ");
		String meaning = map.get("person");
		System.out.println(meaning);
		System.out.println("----------");
		
		// Ư�� �ܾ� ���� �� ��ü ��ȸ
		System.out.println("Ư�� �ܾ� ���� �� ��ü ��ȸ");
		map.remove("teacher");
		wordList(set);
		System.out.println("----------");
		
		// ���� : Ű�� ���� �̸�����, ���� �ٸ���(�����)
		System.out.println("����");
		String keyWord = "student";
		meaning = "�л�(����)";
		if (map.containsKey(keyWord)) {
			map.put(keyWord, meaning);
		}
		wordList(set);
		System.out.println("----------");
		
		// �ܾ� ��� ����
		System.out.println("�ܾ���");
		Set<String> words = map.keySet();
		for (String word : words) {
			System.out.printf("%s \t", word);
		}
		System.out.println();
	}

	private static void wordList(Set<Entry<String, String>> set) {
		for (Entry<String, String> ele : set) {
			String key = ele.getKey();
			String value = ele.getValue();
			System.out.printf("�ܾ� : %s, �� : %s\n", key, value);
		}
	}

}
