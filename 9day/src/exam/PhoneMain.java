package exam;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		
		LgPhone lg = (LgPhone)p1;
		lg.doInternet();
		/* 
		 * ������ ������ ���� ����.
		 * �ƹ��� p1�� LgPhone Ÿ������ ���� ����ȯ�� ���൵ p1�� ��ü�� Phone�� ��ü�̱� ������
		 * ���ͳ� ��� ����� ���� p1�� ���ͳ� ��� ����� ����� �� ����.
		 */
		
		Phone p2 = new LgPhone(); // LgPhone�� ��ü�� ����� Phone Ÿ������ �ڵ� ����ȯ
		
		LgPhone lg2 = (LgPhone)p2; // Phone Ÿ������ ���� p2�� LgPhone Ÿ������ ���� ����ȯ
		lg2.doInternet(); // p2�� ��ü�� LgPhone Ÿ���̹Ƿ� ���ͳ� ����� ����� �� �ִ�.
	}

}
