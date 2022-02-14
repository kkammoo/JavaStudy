package practice;

public class While {

	public static void main(String[] args) {
		// while문과 Math.random()을 이용해서 두 개의 주사위의 눈을 (눈1, 눈2)형태로 출력
		// 눈의 합이 5가 아니면 주사위를 계속 던지고, 5면 실행을 종료하는 코드 작성.
		
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
