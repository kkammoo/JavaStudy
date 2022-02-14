package homework03;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account(); // Account (String accountName)로 생성자를 만들면 생성 카운트가 1 증가하기 때문에 디폴트 생성자로 생성.
		Scanner sc = new Scanner(System.in);
		
		boolean stop = false;
		
		while (!stop) {
			String choice = null;
			String accountName = null;
			String accountNum = null;
			int balance = 0;
			
			System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개인) 6.계좌조회(전체) 7.종료(x)");
			System.out.print("입력 > ");
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				account.newAccount(accountName);
				break;
			case "2":
				account.removeAccount(accountNum);
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "7":
				System.exit(0);
				break;
			} // end of switch
		} // end of while
	} // end of main

} // end of class
