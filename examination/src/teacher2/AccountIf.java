package teacher2;

public interface AccountIf {

	// �Ա�
	void deposit(int money);

	// ���
	void withraw(int money);

	// ��ȸ
	void findAccount(String accountNunmber);

	String getAccountName();

	int getBalance();

	String getAccountNunmber();

	String toString();

}