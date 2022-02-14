package other;


public interface AccountIf {
	
	// 계좌생성
	public void createAccount(String name);
	
	// 계좌폐지
	public void removeAccount(int accountNum); 
	
	// 입금
	public int deposit(int accountNum, int balance);
	
	// 출금
	public int withdraw(int accountNum, int balance); 
	
	// 계좌조회(개별)
	public void findAccount(int accountNum);
	
	// 계좌조회(전체)
	public void accountAll();

}
