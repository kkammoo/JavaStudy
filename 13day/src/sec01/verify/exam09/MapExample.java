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
		
		String name = null; // �ְ� ������ ���� ���̵� ����
		int maxScore = 0;		// �ְ� ���� ����
		int totalScore = 0;	// ���� �հ� ����
		double avg = 0.0; 	// ��� ����

		// ��ü ��� ��ȸ�ϱ� : Map �÷����� ��ȸȰ ���� Set���� ��ȯ �� ��ȸ��.
		Set<Entry<String, Integer>> set = map.entrySet();

		// ����� ���� �о����
		// ���� for�� �̿�
		for (Entry<String, Integer> ele : set) {
		// �о�� ����� �� �����ϱ�
			totalScore += ele.getValue();
			
		// �ְ� ������ ã�� ���� ���� ��, ��� ã��
			if (ele.getValue() > maxScore) {
				maxScore = ele.getValue();
				name = ele.getKey();
			}
		}
		// ������ �հԸ� ����� ���� ������
		avg = (double)totalScore / set.size();
		
		
		System.out.println("������� : " + avg);
		System.out.println("�ְ����� : " + maxScore);
		System.out.println("�ְ������� ���� ���̵� : " + name);
		
		
	}

}
