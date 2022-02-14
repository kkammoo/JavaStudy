package teacher2;

public class Account implements AccountIf {
	
	private String accountName;			// ������ �̸�
	private int balance;						// �ܰ�
	private String accountNunmber;	// ���¹�ȣ
	
	private static int count;				// ��ü����(����) ī��Ʈ
	
	private static final int ACCOUNT_NUM_SIZE = 3; // ���¹�ȣ �ڸ���
	private static final int ONE_TIME_MONEY_LIMIT = 20000;
	private static final int DIPOSIT_MONEY_LIMIT = 50000;
	// ����Ʈ ������
	public Account() {}
	
	public Account(String accountName) {
		this.accountName = accountName;
		++count;
		
		this.accountNunmber = createAccountNumber();
	}
	
	// �Ա�
	@Override
	public void deposit(int money) {
		// ����üũ
		if (money < 0) {
			throw new IllegalArgumentException("�������� �ԷµǾ����ϴ�.");
		}
		// 1ȸ �Ա��ѵ�
		if (money > ONE_TIME_MONEY_LIMIT) {
			throw new IllegalArgumentException("1ȸ �Ա��ѵ��� �ʰ��Ǿ����ϴ�. �Ա��ѵ�:20000");
		}
		// �����ѵ�
		if (this.balance + money > DIPOSIT_MONEY_LIMIT) {
			throw new IllegalArgumentException("�����ѵ��� �ʰ��Ǿ����ϴ�. �����ѵ�:50000");
		}
		this.balance += money;
	}
		
	// ���
	@Override
	public void withraw(int money) {
		this.balance -= money;
	}
	
	// ��ȸ
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
		String str = "���¹�ȣ : " + this.accountNunmber + " " + 
								 "������ �̸� : " + this.accountName + " " + 
								 "�ܰ� : " + this.balance;
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
