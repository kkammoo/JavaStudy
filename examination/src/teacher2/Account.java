package teacher2;

public class Account implements AccountIf {
	
	private String accountName;			// 예금주 이름
	private int balance;						// 잔고
	private String accountNunmber;	// 계좌번호
	
	private static int count;				// 객체생성(계좌) 카운트
	
	private static final int ACCOUNT_NUM_SIZE = 3; // 계좌번호 자리수
	private static final int ONE_TIME_MONEY_LIMIT = 20000;
	private static final int DIPOSIT_MONEY_LIMIT = 50000;
	// 디폴트 생성자
	public Account() {}
	
	public Account(String accountName) {
		this.accountName = accountName;
		++count;
		
		this.accountNunmber = createAccountNumber();
	}
	
	// 입금
	@Override
	public void deposit(int money) {
		// 음수체크
		if (money < 0) {
			throw new IllegalArgumentException("음수값이 입력되었습니다.");
		}
		// 1회 입금한도
		if (money > ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1회 입금한도가 초과되었습니다. 입금한도:20000");
		}
		// 예금한도
		if (this.balance + money > DIPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("예금한도가 초과되었습니다. 예금한도:50000");
		}
		this.balance += money;
	}
		
	// 출금
	@Override
	public void withraw(int money) {
		this.balance -= money;
	}
	
	// 조회
	@Override
	public void findAccount(String accountNunmber) {
		
	}
	
	@Override
	public String getAccountName() {
		return accountName;
	}

	@Override
	public int getBalance() {
		return balance;
	}

	@Override
	public String getAccountNunmber() {
		return accountNunmber;
	}

	@Override
	public String toString() {
		String str = "계좌번호 : " + this.accountNunmber + " " + 
								 "예금주 이름 : " + this.accountName + " " + 
								 "잔고 : " + this.balance;
		return str;
	}
	
	private String createAccountNumber() {
		String zero = "";
		String number = String.valueOf(count);
		for (int i = 1; i<=ACCOUNT_NUM_SIZE-number.length(); i++) {
			zero += "0";
		}
		return this.accountNunmber = zero+count;
	}
}
