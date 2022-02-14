package first;

public class Switch {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		System.out.println("number="+number);
		
		switch(number) {
		//switch문엔 int, char, String타입이 올 수 있다. double, boolean타입은 올 수 없다.
		case 1:
			System.out.println("숫자="+number);
			break;
		case 2:
			System.out.println("숫자="+number);
			break;
		case 3:
			System.out.println("숫자="+number);
			break;
		case 4:
			System.out.println("숫자="+number);
			break;
		case 5:
			System.out.println("숫자="+number);
			break;
		default:
			System.out.println("1~5의 숫자가 아닌 값");
			break; //default값 뒤엔 break를 안 넣어도 된다. 하지만 넣는 게 가독성이 좋음.
		}
	}
}
