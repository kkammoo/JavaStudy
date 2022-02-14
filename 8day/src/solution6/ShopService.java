package solution6;
/* �̱���
 * ���󼼰迡�� ������ ��ü�� �����ϰ��� �ϴ� ������ ����.
 */
public class ShopService {
	// �ʵ�
	// private : �ܺο��� ���� �������� ���ϵ��� ��.
	// static : ����Ŭ�������� ���α׷��� ���۵Ǳ� ���� �ʱ�ȭ�ϱ� ����.
	private static ShopService instance = new ShopService();
	
	
	// ������
	// private : �ܺο��� �����ڸ� ȣ������ ���ϵ��� private �����ڸ� �����.
	private ShopService()	{
	}
	
	
	// �޼ҵ�
	// public : �ܺο��� ���ο� ������ ��ü�� �������� �ϱ� ����.
	// static : 1. Ŭ����(����) ��� �ʵ带 ����߱� ������. 2. �ܺο��� ��ü ���� ���� �޼ҵ带 ����� �� �ְ� �ϱ� ����.
	public static ShopService getInstance()	{
		return instance;
	}
	
	
	
}
