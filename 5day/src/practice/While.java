package practice;

public class While {

	public static void main(String[] args) {
		// while���� Math.random()�� �̿��ؼ� �� ���� �ֻ����� ���� (��1, ��2)���·� ���
		// ���� ���� 5�� �ƴϸ� �ֻ����� ��� ������, 5�� ������ �����ϴ� �ڵ� �ۼ�.
		
		boolean run = true;

		while (run) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
				
			System.out.println("(" + dice1 + "," + dice2 + ")" );
			if ((dice1 + dice2) == 5) {
				run = false;
			}
		}

	}

}
