package first;

public class Sum {

	public static void main(String[] args) {
		//int�� ���� ���� ������ Ÿ��
		int x = 10;
		int y = 20;
		
		int result = x + y;
		
		System.out.println("x + y = " + result);

		int result2 = calculate(30,40); //claculate �޼ҵ�� ���޵Ǵ� ��
		System.out.println("resulr2 = " + result2);
		
		int result3 = calculate(50,60); 
		System.out.println("resulr3 = " + result3);
	}

	//�޼ҵ�
	//�޼ҵ� �ϳ��� ����� �� �޼ҵ带 �̿��� ���� �ڵ带 �ݺ������� ������ �� �ִ�.
	public static int calculate(int num1, int num2) {
		return num1 + num2;
	}
	
}
