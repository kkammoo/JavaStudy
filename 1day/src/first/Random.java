package first;

public class Random {

	public static void main(String[] args) {
		
		int random = (int)(Math.random()*100)+1; // 0 <= x < 101�� ������ ���� ������ ���� ���.
		System.out.println("(1~100)������ = " + random);
		
		//3�� ��� üũ
		if(random % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		//2�� ��� �̸鼭 3�� ������� üũ
		// && : �� ������ (and)
		if(random % 2 == 0 && random % 3 == 0) {
			System.out.println("2�� ��� �̸鼭 3�� ���"); //�� ���� (random % 2 == 0, random % 3 == 0)�� ��� ���� �� ���.
		}else {
			System.out.println("2�� ��� �̸鼭 3�� ����� �ƴ� ��"); //�� ���� �� �ϳ��� Ʋ���� ���.
		}
		
	
		//2�� ��� �̰ų� 3�� ������� üũ
		// || : �� ������ (or)
		if(random % 2 == 0 || random % 3 == 0) {
			System.out.println("2�� ��� �̰ų� 3�� ���"); //�� ���� �� �ϳ��� ���̸� ���.
		}else {
			System.out.println("2�� ��� �̰ų� 3�� ����� �ƴ� ��"); //�� ������ ��� ������ �� ���.
		}
		
		//2�� ����� �ƴ� ���
		// !�� ����(not)�� �ǹ� -> "!= : ���� �ʴ�." ��� ��
		if(random % 2 != 0) {
			System.out.println("2�� ����� �ƴϴ�.");
		}else {
			System.out.println("2�� �����.");
		}
		
	}

}
