package groupStudy;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double result;
		int pages;
		boolean stop = false;
		
		while (!stop) {
			System.out.print("�Խù��� �� �Ǽ��� �Է��ϼ��� : ");
			double contents = sc.nextInt();
			System.out.print("�� �������� ������ �Խù��� �Է��ϼ��� : ");
			double contensByPages = sc.nextInt();

			if (contensByPages < 1) {
				System.out.println("contensByPages�� 1�̻��Դϴ�.");
				continue;
			} else {
				result =  (contents / contensByPages);
				pages = (int)(Math.ceil(result));
				System.out.println("�� ������ �� : " + pages);
				stop = true;
			}
		}
	}

}
