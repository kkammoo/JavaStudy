package first;

public class Switch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		System.out.println("number="+number);
		
		switch(number) {
		//switch���� int, char, StringŸ���� �� �� �ִ�. double, booleanŸ���� �� �� ����.
		case 1:
			System.out.println("����="+number);
			break;
		case 2:
			System.out.println("����="+number);
			break;
		case 3:
			System.out.println("����="+number);
			break;
		case 4:
			System.out.println("����="+number);
			break;
		case 5:
			System.out.println("����="+number);
			break;
		default:
			System.out.println("1~5�� ���ڰ� �ƴ� ��");
			break; //default�� �ڿ� break�� �� �־ �ȴ�. ������ �ִ� �� �������� ����.
		}
	}
}