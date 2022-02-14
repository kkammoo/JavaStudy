package com.kh;
/*
 * �̱��� : ��ü�� 1���� �����ϰ��� �� �� ����ϴ� ������ ����
 * 1. �ܺο��� �����ڸ� ȣ������ ���ϵ��� �����ڸ� private�� �����.
 * 2. ���ο��� ��ü�� �����ϰ� public static �ʵ尡 �����ϰ��Ѵ�.
 * 3. �ܺο��� ���ο��� ������ ��ü�� �����ϵ��� public static�޼ҵ�� �����.
 */
public class Sun {
	// �ʵ�
	private static Sun sun = new Sun();
	/*
	 * 2. �ܺο��� �����ڸ� ȣ���Ͽ� ��ü�� ���� �� �����Ƿ� ���ο� private static���� ��ü ����.
	 */
	
	// ������
	private Sun()	{ // 1. �⺻ �����ڸ� private�� ����
		super();
	}
	
	//�޼ҵ�
	public static Sun getIntance()	{ // 3. �ܺο��� Sun�� ��ü�� ������ �� �ִ� �޼ҵ带 ����. (public static)
		return sun;
	}
	
}
