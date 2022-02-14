package other;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		String name = null;
		int accountNum = 0;
		int balance = 0;

		String numChoice;
		boolean stop = false;
		while (!stop) {
			try {
				System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개인) 6.계좌조회(전체) 7.종료(x)");
				System.out.print("입력 > ");
				numChoice = sc.nextLine();
				switch (numChoice) {
				case "1":
					account.createAccount(name);
					break;
				case "2":
					account.removeAccount(accountNum);
					break;
				case "3":
					account.deposit(accountNum, balance);
					break;
				case "4":
					account.withdraw(accountNum, balance);
					break;
				case "5":
					account.findAccount(accountNum);
					break;
				case "6":
					account.accountAll();
					break;
				case "7":
					stop = true;
					break;
				} // end of switch
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} // end of while
		System.out.println("프로그램이 종료되었습니다.");
	} // end of main
} // end of class
