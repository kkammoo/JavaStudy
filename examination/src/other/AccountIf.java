package other;


public interface AccountIf {
	
	// ���»���
	public void createAccount(String name);
	
	// ��������
	public void removeAccount(int accountNum); 
	
	// �Ա�
	public int deposit(int accountNum, int balance);
	
	// ���
	public int withdraw(int accountNum, int balance); 
	
	// ������ȸ(����)
	public void findAccount(int accountNum);
	
	// ������ȸ(��ü)
	public void accountAll();

}
