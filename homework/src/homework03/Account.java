package homework03;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	// 멤버 필드
	private static final int ACCOUNT_NUM_SIZE = 3;

	private String accountName; // 예금주명
	private String accountNum; // 계좌번호
	private int balance; // 잔액

	Account[] account = new Account[5]; // 계좌개설 제한 5
	private static int numCount; // 계좌생성 카운트

	// 생성자
	public Account() {
	};

	public Account(String accountName) {
		this.accountName = accountName;
		++numCount;

		// 계좌번호 패턴 생성
		String zero = "";
		String number = String.valueOf(numCount);
		for (int i = 1; i <= ACCOUNT_NUM_SIZE - number.length(); i++) {
			zero += "0";
		}
		this.accountNum = zero + numCount;
	}

	// 계좌생성
	public void newAccount(String accountName) {
		Account createdAccount = null;
		boolean maxAccount = false;

		System.out.println("신규 예금주명");
		System.out.print("입력 > ");
		accountName = sc.nextLine();

		for (int i = 0; i < account.length; i++) {
			if (account[i] == null) {
				account[i] = new Account(accountName);
				createdAccount = account[i];
				maxAccount = true;
				break;
			} else if (accountName.equals(account[i].accountName)) {
				System.out.println("이미 등록된 예금주입니다.");
				break;
			} else if (account[i].accountName != null) {
				System.out.println("계좌 개설한도를 초과했습니다. (개설한도: 5)");
			}
		}
		if (!maxAccount) {
			System.out.println("계좌를 등록했습니다.");
			System.out.println(createdAccount);
		}
	}

	// 계좌폐지
	public void removeAccount(String accountNum) {
		this.accountNum = accountNum;

		System.out.println("계좌번호를 입력하세요.");
		System.out.print("입력 > ");
		accountNum = sc.nextLine();

		for (int i = 0; i < account.length; i++) {
			if (accountNum.equals(account[i].accountNum)) {
				System.out.println(account[i].toString());
				continue;
			} else {
				System.out.println("계좌번호가 존재하지 않습니다.");
				break;
			}
		}
	}

	// 입금

	// 출금

	// 계좌조회(개인)

	// 계좌조회(전체)

	// 계좌정보 출력(toString 재정의)
	@Override
	public String toString() {
		String str = "[계좌번호: " + this.accountNum + ", " + "예금주: " + this.accountName + ", " + "잔액: " + this.balance + "]";
		return str;
	}
}
