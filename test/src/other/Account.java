package other;

import java.util.Scanner;

public class Account implements AccountIf {
	Scanner sc = new Scanner(System.in);
	
	// 멤버필드
	Account[] account = new Account[5]; // 계좌
	int accountNum; // 계좌번호
	String name; // 예금주
	int balance; // 잔고
	
	// 생성자
	public Account () {}
	
	public Account (int accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	
	
	//메소드
	
	// 신규
	@Override
	public void createAccount(String name) {
		accountNum = 1;
		System.out.println("이름을 입력하세요.");
		System.out.print("입력 > ");
		name = sc.nextLine();
		balance = 0; // 계좌 개설시 잔액은 0
		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = new Account(accountNum, name, balance);
				System.out.println("계좌를 등록했습니다.");
				System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[i].accountNum, account[i].name, account[i].balance);
				break;
			} else if (name.equals(account[i].name)) {
				System.out.println("이미 등록된 예금주입니다.");
				break;
			} else if (account[4] != null) {
				System.out.println("계좌 개설 한도를 초과했습니다.");
				break;
			}
			accountNum++;
		}
	}
	
	// 폐지
	@Override
	public void removeAccount(int accountNum) {
		boolean stop = false;
		System.out.println("계좌번호를 입력하세요.");
		System.out.print("입력 > ");
		accountNum = (sc.nextInt()-1);
		System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
		while (!stop) {
			System.out.println("계좌를 폐지하시겠습니까? (1:폐지, 0:돌아가기)");
			System.out.print("입력 > ");
			int num = sc.nextInt();
			if (num == 1) {
				account[accountNum] = null;
				System.out.println("계좌가 폐지되었습니다.");
				break;
			} else if (num == 0) {
				break;
			}
		}
	}
	
	// 입금
	@Override
	public int deposit(int accountNum, int balance) {
		System.out.println("계좌번호를 입력하세요.");
		System.out.print("입력 > ");
		accountNum = (sc.nextInt()-1);
		
		balance = account[accountNum].balance;
		int amount = 0;
		boolean stop = false;
		while (!stop) {
			System.out.println("입금할 금액을 입력하세요");
			System.out.print("입력 > ");
			amount = sc.nextInt();
			if (amount >= 20000) {
				System.out.println("1회 입금금액 한도 초과입니다. (1회 입금한도: 20000 미만)");
				continue;
			} else if (account[accountNum].balance >= 50000) {
				System.out.println("계좌 예금금액 한도 초과입니다. (예금한도: 50000)");
				System.out.println("현재 잔고: " + account[accountNum].balance);
				break;
			}
			account[accountNum].balance = balance + amount;
			System.out.println("입금되었습니다.");
			System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			break;
		}
		return account[accountNum].balance;
	}
	
	// 출금
	@Override
	public int withdraw(int accountNum, int balance) {
		System.out.println("계좌번호를 입력하세요.");
		System.out.print("입력 > ");
		accountNum = (sc.nextInt()-1);
		balance = account[accountNum].balance;
		
		int amount = 0;
		boolean stop = false;
		while (!stop) {
			System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			System.out.println("출금할 금액을 입력하세요");
			System.out.print("입력 > ");
			amount = sc.nextInt();
			if (amount <= 0) {
				System.out.println("정확한 숫자를 입력하세요");
				continue;
			} else if (account[accountNum].balance <= 0) {
				System.out.println("계좌 출금금액 한도 초과입니다.");
				System.out.println("현재 잔고: " + account[accountNum].balance);
				continue;
			}
			account[accountNum].balance = balance - amount;
			System.out.println("출금되었습니다.");
			System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
			break;
		}
		return account[accountNum].balance;
	}
	
	// 계좌조회(개인)
	@Override
	public void findAccount(int accountNum) {
		System.out.println("계좌번호를 입력하세요.");
		System.out.print("입력 > ");
		accountNum = (sc.nextInt()-1);
		System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[accountNum].accountNum, account[accountNum].name, account[accountNum].balance);
	}
	
	// 계좌조회(전체)
	@Override
	public void accountAll() {
		for (int i = 0; i < account.length; i++) {
			if (account == null) {
				throw new NullPointerException();
			}
			System.out.printf("계좌 [계좌번호: %03d, 예금주: %s, 잔고: %d]\n", account[i].accountNum, account[i].name, account[i].balance);
		}
		System.out.println("현재 사용중인 계좌 수: " + account.length + " " + "잔여 계좌 수: " + (5-account.length));
	}
}
