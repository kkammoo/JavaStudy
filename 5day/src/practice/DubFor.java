package practice;

public class DubFor {

	public static void main(String[] args) {
		// ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���Ͽ� (x, y)���·� ����غ�����
		// ��, x, y�� 10������ �ڿ���
		int sum = 0;
		
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y<= 10; y++) {
				sum = (4 * x) + (5 * y);
				
				if (sum == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
