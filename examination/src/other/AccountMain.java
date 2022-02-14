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
				System.out.println("1.�ű� 2.���� 3.�Ա� 4.��� 5.������ȸ(����) 6.������ȸ(��ü) 7.����(x)");
				System.out.print("�Է� > ");
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
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} // end of main
} // end of class
