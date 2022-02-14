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
				
				System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개인) 6.계좌조회(전체) 7.종료(x)");
				System.out.print("입력 > ");
				choice = sc.nextLine();
				
				switch (choice) {
				case "1":		// 신규
					System.out.print("신규 예금주명 : ");
					accountName = sc.nextLine();
					// 계좌생성
					createAccount(account, accountName);
					break;
				case "2":		// 해지
					System.out.print("폐지할 계좌번호 : ");
					accountNumber = sc.nextLine();
					// 계좌폐지
					closeAccount(account, accountNumber);
					break;
				case "3":		// 입금
					System.out.print("입금 계좌 : ");
					accountNumber = sc.nextLine();
					System.out.print("입금할 금액 : ");
					money = sc.nextInt();
					// 입금
					deposit(account, accountNumber, money);
					break;
				case "4":		// 출금
					System.out.print("출금 계좌 : ");
					accountNumber = sc.nextLine();
					System.out.print("출금할 금액 : ");
					money = sc.nextInt();
					// 출금
					withraw(account, accountNumber, money);
					break;
				case "5":
					System.out.print("계좌 번호: ");
					accountNumber = sc.nextLine();
					// 계좌조회(개별)
					showAccount(account, accountNumber);
					break;
				case "6":
					// 계좌조회(전체)
					showAccountAll(account);
					break;
				case "7":		// 종료
					System.exit(0);
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
	// 전체 조회 메소드
	private static void showAccountAll(Account[] account) {
		for (int i = 0; i < account.length; i++) {
			if (account[i] != null) {
				System.out.println(account[i]);
			}
		}
	}
	
	// 계좌조회 메소드
	private static void showAccount(Account[] account, String accountNumber) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				System.out.println(account[i]);
				break;
			}
		}
	}
	// 출금 메소드
	private static void withraw(Account[] account, String accountNumber, int money) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				account[i].withraw(money);;
				System.out.println("출금되었습니다.");
				break;
			}
		}
	}
	
	// 입금 메소드
	private static void deposit(Account[] account, String accountNumber, int money) {
		for (int i = 0; i < account.length; i++) {
			if (account[i].getAccountNunmber().equals(accountNumber)) {
				account[i].deposit(money);
				System.out.println("입금되었습니다.");
				break;
			}
		}
	}
	// 계좌 폐지 메소드
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
				System.out.println("계좌가 폐지되었습니다." + account[i]);
			}else {
				System.out.println("없는 계좌입니다.");
			}
		}
	}

	// 계좌 생성 메소드
	private static void createAccount(Account[] account, String accountName) {
		Account createdAccount = null;
		
		// 동명이인 체크
		
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
			System.out.println("계좌 개설 한도를 초과했습니다.");
		} else {
			System.out.println("계좌를 등록했습니다." + createdAccount);
		}
	}
}
