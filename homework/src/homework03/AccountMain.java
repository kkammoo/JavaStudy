package homework03;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account(); // Account (String accountName)�� �����ڸ� ����� ���� ī��Ʈ�� 1 �����ϱ� ������ ����Ʈ �����ڷ� ����.
		Scanner sc = new Scanner(System.in);
		
		boolean stop = false;
		
		while (!stop) {
			String choice = null;
			String accountName = null;
			String accountNum = null;
			int balance = 0;
			
			System.out.println("1.�ű� 2.���� 3.�Ա� 4.��� 5.������ȸ(����) 6.������ȸ(��ü) 7.����(x)");
			System.out.print("�Է� > ");
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
