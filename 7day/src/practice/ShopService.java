package practice;

public class ShopService {
	// �ʵ�
	private static ShopService shopService = new ShopService();
	
	// ������
	private ShopService() {}
	
	// �޼ҵ�
	public static ShopService getInstance() {
		return shopService;
	}
	
	
}
