package groupStudy;

import java.util.Scanner;

public class study04 {

	public static void main(String[] args) {
		// ���� ���߱� up & down ����
		Scanner sc = new Scanner(System.in);
		
		int number = (int)(Math.random()*100+1); // 1~100 ������ ������ ����
		
		boolean stop = false;
		int inputcnt = 0;
		
		System.out.println("���� ���߱� up & down �����Դϴ�.");
		
		while (!stop) {
			System.out.print("1~100 ���� �Է� : ");
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
				System.out.println("�����Դϴ�! " + inputcnt + "ȸ ���� ������ϴ�.");
				break;
			} else {
				System.out.println("1~100 ������ ���ڸ� �Է����ּ���");
			}
		}
	}
}
