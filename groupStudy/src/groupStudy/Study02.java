package groupStudy;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double result;
		int pages;
		boolean stop = false;
		
		while (!stop) {
			System.out.print("게시물의 총 건수를 입력하세요 : ");
			double contents = sc.nextInt();
			System.out.print("한 페이지에 보여줄 게시물을 입력하세요 : ");
			double contensByPages = sc.nextInt();

			if (contensByPages < 1) {
				System.out.println("contensByPages는 1이상입니다.");
				continue;
			} else {
				result =  (contents / contensByPages);
				pages = (int)(Math.ceil(result));
				System.out.println("총 페이지 수 : " + pages);
				stop = true;
			}
		}
	}

}
