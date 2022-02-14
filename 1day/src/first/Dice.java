package first;

public class Dice {

	public static void main(String[] args) {
		//System.out.println(Math.random()); //0.0 <= x < 1 범위의 값이 랜덤하게 출력됨. - 주사위는 1 <= x < 7의 범위를 가짐.
		//System.out.println(Math.random()*6); //6을 곱하면 0.0 <= x < 6범위의 랜덤한 실수가 나옴
		//System.out.println((int)(Math.random()*6)); //데이터 값을 int(정수)로 변환 - 0 <= x < 6의 범위를 가짐.
		//System.out.println((int)(Math.random()*6)+1); //1 <= x < 7의 범위를 가진 정수를 랜덤하게 출력한다.
		
		int random = (int)(Math.random()*6)+1;
		System.out.println("던진 주사위 수 = " + random);
		
		if(random == 1) {
			System.out.println("주사위 값: 1");
		}else if(random == 2) {
			System.out.println("주사위 값: 2");
		}else if(random == 3) {
			System.out.println("주사위 값: 3");
		}else if(random == 4) {
			System.out.println("주사위 값: 4");
		}else if(random == 5) {
			System.out.println("주사위 값: 5");
		}else {
			System.out.println("주사위 값: 6");
		}

	}

}
