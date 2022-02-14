package first;

public class Dice2 {

	public static void main(String[] args) {
		//System.out.println((int)(Math.random()*6)+1); //1 <= x < 7의 범위를 가진 정수를 랜덤하게 출력한다.
		
		int random = (int)(Math.random()*6)+1;
		System.out.println("던진 주사위 수 = " + random);
		
		//random % 2 == 1
		
		//System.out.println(10 % 2); //% : 수를 나눈 후 나머지를 나타내는 연산자
		//random (1~6) 주사위 눈이 짝수 (2로 나눴을 때 나머지가 0)면 짝수를 출력, 아니면 홀수를 출력
		if(random % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

	}

}
