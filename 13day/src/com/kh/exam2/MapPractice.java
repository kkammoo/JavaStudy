package com.kh.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		// 등록
		map.put("person", "사람");
		map.put("student", "학생");
		map.put("teacher", "선생님");
		
		// 전체 조회
		System.out.println("전체조회");
		Set<Entry<String, String>> set = map.entrySet();
		wordList(set);
		System.out.println("----------");
		
		// 단어 조회
		System.out.println("단어조회");
		String meaning = map.get("person");
		System.out.println(meaning);
		System.out.println("----------");
		
		// 특정 단어 삭제 후 전체 조회
		System.out.println("특정 단어 삭제 후 전체 조회");
		map.remove("teacher");
		wordList(set);
		System.out.println("----------");
		
		// 수정 : 키는 같은 이름으로, 값은 다르게(덮어쓰기)
		System.out.println("수정");
		String keyWord = "student";
		meaning = "학생(수정)";
		if (map.containsKey(keyWord)) {
			map.put(keyWord, meaning);
		}
		wordList(set);
		System.out.println("----------");
		
		// 단어 목록 추출
		System.out.println("단어목록");
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
			System.out.printf("단어 : %s, 뜻 : %s\n", key, value);
		}
	}

}
