package first;

public class Dice {

	public static void main(String[] args) {
		//System.out.println(Math.random()); //0.0 <= x < 1 ������ ���� �����ϰ� ��µ�. - �ֻ����� 1 <= x < 7�� ������ ����.
		//System.out.println(Math.random()*6); //6�� ���ϸ� 0.0 <= x < 6������ ������ �Ǽ��� ����
		//System.out.println((int)(Math.random()*6)); //������ ���� int(����)�� ��ȯ - 0 <= x < 6�� ������ ����.
		//System.out.println((int)(Math.random()*6)+1); //1 <= x < 7�� ������ ���� ������ �����ϰ� ����Ѵ�.
		
		int random = (int)(Math.random()*6)+1;
		System.out.println("���� �ֻ��� �� = " + random);
		
		if(random == 1) {
			System.out.println("�ֻ��� ��: 1");
		}else if(random == 2) {
			System.out.println("�ֻ��� ��: 2");
		}else if(random == 3) {
			System.out.println("�ֻ��� ��: 3");
		}else if(random == 4) {
			System.out.println("�ֻ��� ��: 4");
		}else if(random == 5) {
			System.out.println("�ֻ��� ��: 5");
		}else {
			System.out.println("�ֻ��� ��: 6");
		}

	}

}
