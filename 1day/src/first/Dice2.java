package first;

public class Dice2 {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1); //1 <= x < 7�� ������ ���� ������ �����ϰ� ����Ѵ�.
		
		int random = (int)(Math.random()*6)+1;
		System.out.println("���� �ֻ��� �� = " + random);
		
		//random % 2 == 1
		
		//System.out.println(10 % 2); //% : ���� ���� �� �������� ��Ÿ���� ������
		//random (1~6) �ֻ��� ���� ¦�� (2�� ������ �� �������� 0)�� ¦���� ���, �ƴϸ� Ȧ���� ���
		if(random % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}

	}

}
