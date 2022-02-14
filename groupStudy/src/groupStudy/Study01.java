package groupStudy;

import java.util.Arrays;
import java.util.HashSet;

public class Study01 {

	public static void main(String[] args) {
		
		String name = "������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������";
		String[] array = name.split(",");
		
		// 1. �达�� �̾��� ���� �� ��?
		int countKim = 0;
		int countLee = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].charAt(0) == '��') {
				countKim++;
			}
			if (array[i].charAt(0) == '��') {
				countLee++;
			}
		}
		System.out.println("�达 ���� ���� ��� ��: " + countKim);
		System.out.println("�̾� ���� ���� ��� ��: " + countLee);
		
		// 2. "���翵"�� �� �� �ݺ�
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("���翵")) {
				count++;
			}
		}
		System.out.println(count);
		
		// 3. �ߺ��� ������ �̸� ���
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(array)); // set �÷����� �ߺ� ��� �� ��
		String[] resultArr = hashSet.toArray(new String[0]);
		System.out.println(Arrays.toString(resultArr));
		
		// 4. �ߺ��� ������ �̸� ������������ ��� 
		// Arrays Ŭ������ sort() �޼ҵ� ���. / ���������� Collections Ŭ������ reversOder() �޼ҵ� ���
		Arrays.sort(resultArr);
		for (String noneDubName : resultArr) {
			System.out.print(noneDubName + " ");
		}
	}
}
