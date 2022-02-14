package groupStudy;

import java.util.Scanner;

public class study04 {

	public static void main(String[] args) {
		// 숫자 맞추기 up & down 게임
		Scanner sc = new Scanner(System.in);
		
		int number = (int)(Math.random()*100+1); // 1~100 범위의 랜덤한 정수
		
		boolean stop = false;
		int inputcnt = 0;
		
		System.out.println("숫자 맞추기 up & down 게임입니다.");
		
		while (!stop) {
			System.out.print("1~100 숫자 입력 : ");
			int choice = sc.nextInt();

			if (choice < number && 0 < choice && choice <= 100) {
				System.out.println("UP");
				inputcnt++;
				continue;
			} else if (choice > number && 0 < choice && choice <= 100) {
				System.out.println("DOWN");
				inputcnt++;
				continue;
			} else if (choice == number) {
				inputcnt++;
				System.out.println("정답입니다! " + inputcnt + "회 만에 맞췄습니다.");
				break;
			} else {
				System.out.println("1~100 범위의 숫자를 입력해주세요");
			}
		}
	}
}
