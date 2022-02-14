package groupStudy;

import java.util.Arrays;
import java.util.HashSet;

public class Study01 {

	public static void main(String[] args) {
		
		String name = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] array = name.split(",");
		
		// 1. 김씨와 이씨는 각각 몇 명?
		int countKim = 0;
		int countLee = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].charAt(0) == '김') {
				countKim++;
			}
			if (array[i].charAt(0) == '이') {
				countLee++;
			}
		}
		System.out.println("김씨 성을 가진 사람 수: " + countKim);
		System.out.println("이씨 성을 가진 사람 수: " + countLee);
		
		// 2. "이재영"은 몇 번 반복
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("이재영")) {
				count++;
			}
		}
		System.out.println(count);
		
		// 3. 중복을 제거한 이름 출력
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(array)); // set 컬렉션은 중복 허용 안 됨
		String[] resultArr = hashSet.toArray(new String[0]);
		System.out.println(Arrays.toString(resultArr));
		
		// 4. 중복을 제거한 이름 오름차순으로 출력 
		// Arrays 클래스의 sort() 메소드 사용. / 내림차순은 Collections 클래스의 reversOder() 메소드 사용
		Arrays.sort(resultArr);
		for (String noneDubName : resultArr) {
			System.out.print(noneDubName + " ");
		}
	}
}
