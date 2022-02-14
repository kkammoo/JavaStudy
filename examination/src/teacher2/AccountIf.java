package teacher2;

public interface AccountIf {

	// 입금
	void deposit(int money);

	// 출금
	void withraw(int money);

	// 조회
	void findAccount(String accountNunmber);

	String getAccountName();

	int getBalance();

	String getAccountNunmber();

	String toString();

}