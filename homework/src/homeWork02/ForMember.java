package homeWork02;

public interface ForMember {
	
	// �ʱ�ȭ�� ���
	// 1. �α���
	int logIn(String id, String pw); // ������, �Ϲ�ȸ���� ���� ���ϰ��� �ٸ��� �༭ �б�
	
	// 2. ȸ������
	void createId(String id, String pw);
	
	// �ܾ��� ���
	// ������ ��� : (����), �Ϲ�ȸ�� ��� : (�Ϲ�)
	// �Ϲ�ȸ���� ���� ����� ����. ��ü ��� �� �Ϻθ� ����ϹǷ� �ϳ��� ���� Ŭ������ ������ ��.
	
	// 1. �ܾ��� (����)
	void addWord();
	
	// 2. �ܾ� �� ���� (����)
	void editWord();
	
	// 3. �ܾ�˻� (����)(�Ϲ�)
	void searchWord();
	
	// 4. �ܾ���� (����)
	void removeWord();

	// 5. �ܾ��� (����)(�Ϲ�)
	void wordList();
	
	// 6. ��ü��� (����)
	void wordAll();
	
}
