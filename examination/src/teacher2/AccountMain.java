package teacher2;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account[] account = new Account[5];
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		
		while(!stop) {
			try {
				String choice = null;
				String accountName = null;
				String accountNumber = null;
				int money = 0;
				
				System.out.println("1.�ű� 2.���� 3.�Ա� 4.��� 5.������ȸ(����) 6.������ȸ(��ü) 7.����(x)");
				System.out.print("�Է� > ");
				choice = sc.nextLine();
				
				switch (choice) {
				case "1":		// �ű�
					System.out.print("�ű� �����ָ� : ");
					accountName = sc.nextLine();
					// ���»���
					createAccount(account, accountName);
					break;
				case "2":		// ����
					System.out.print("������ ���¹�ȣ : ");
					accountNumber = sc.nextLine();
					// ��������
					closeAccount(account, accountNumber);
					break;
				case "3":		// �Ա�
					System.out.print("�Ա� ���� : ");
					accountNumber = sc.nextLine();
					System.out.print("�Ա��� �ݾ� : ");
					money = sc.nextInt();
					// �Ա�
					deposit(account, accountNumber, money);
					break;
				case "4":		// ���
					System.out.print("��� ���� : ");
					accountNumber = sc.nextLine();
					System.out.print("����� �ݾ� : ");
					money = sc.nextInt();
					// ���
					withraw(account, accountNumber, money);
					break;
				case "5":
					System.out.print("���� ��ȣ: ");
					accountNumber = sc.nextLine();
					// ������ȸ(����)
					showAccount(account, accountNumber);
					break;
				case "6":
					// ������ȸ(��ü)
					showAccountAll(account);
					break;
				case "7":		// ����
					System.exit(0);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
	// ��ü ��ȸ �޼ҵ�
	private static void showAccountAll(Account[] account) {
		for (int i = 0; i < account.length; i++) {
			if (account[i] != null) {
				System.out.println(account[i]);
			}
		}
	}
	
	// ������ȸ �޼ҵ�
	private static void showAccount(Account[] account, String accountNumber) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				System.out.println(account[i]);
				break;
			}
		}
	}
	// ��� �޼ҵ�
	private static void withraw(Account[] account, String accountNumber, int money) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				account[i].withraw(money);;
				System.out.println("��ݵǾ����ϴ�.");
				break;
			}
		}
	}
	
	// �Ա� �޼ҵ�
	private static void deposit(Account[] account, String accountNumber, int money) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				account[i].deposit(money);
				System.out.println("�ԱݵǾ����ϴ�.");
				break;
			}
		}
	}
	// ���� ���� �޼ҵ�
	private static void closeAccount(Account[] account, String accountNumber) {
		boolean flag = false;
		Account findAccount;
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				findAccount = account[i];
				account[i] = null;
				flag = true;
				break;
			} 
			if (flag) {
				System.out.println("���°� �����Ǿ����ϴ�." + account[i]);
			}else {
				System.out.println("���� �����Դϴ�.");
			}
		}
	}

	// ���� ���� �޼ҵ�
	private static void createAccount(Account[] account, String accountName) {
		Account createdAccount = null;
		
		// �������� üũ
		
		boolean flag = false;
		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = new Account(accountName);
				createdAccount = account[i];
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("���� ���� �ѵ��� �ʰ��߽��ϴ�.");
		} else {
			System.out.println("���¸� ����߽��ϴ�." + createdAccount);
		}
	}
}
