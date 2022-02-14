package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0;		// 최고 점수 저장
		int totalScore = 0;	// 점수 합계 저장
		double avg = 0.0; 	// 평균 점수

		// 전체 요소 순회하기 : Map 컬렉션을 순회활 때는 Set으로 변환 후 순회함.
		Set<Entry<String, Integer>> set = map.entrySet();

		// 요소의 값을 읽어오기
		// 향상된 for문 이용
		for (Entry<String, Integer> ele : set) {
		// 읽어온 요소의 값 누적하기
			totalScore += ele.getValue();
			
		// 최고 점수를 찾기 위한 점수 비교, 대상 찾기
			if (ele.getValue() > maxScore) {
				maxScore = ele.getValue();
				name = ele.getKey();
			}
		}
		// 누적된 합게를 요소의 수로 나누기
		avg = (double)totalScore / set.size();
		
		
		System.out.println("평균점수 : " + avg);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
		
	}

}
