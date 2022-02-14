package com.kh;

public class PhoneMain {

	public static void main(String[] args) {

		LgPhone lp = new LgPhone();
		lp.makeCall();
		lp.doInternet();
		
		SamsungPhone sp = new SamsungPhone();
		sp.makeCall();
		sp.watchTv();
		
		Phone phone = (Phone)lp;
		Phone phone3 = lp; // �ڵ� ����ȯ : ���� ������ �ü����� ���� ���� �ٶ󺸱�.
		phone.makeCall(); // Phone Ŭ������ ��ü�� �Ǵ��ϱ� ������ lp�� ������ �ִ� "���ͳ� �ϴ�" ����� ����� ���� ����.
		
		LgPhone lp2 = (LgPhone)phone;
//		LgPhone lp3 = phone; // �ڵ� ����ȯ �� �� : ���� �������� ���� ������ �ٶ󺸱�� �� ��.
		lp2.doInternet(); // LgPhone Ŭ������ ��ü�� �Ǵ��ϱ� ������ "���ͳ� �ϴ�" ����� ����� �� �ִ�.
		
		Phone phone2 = (Phone)sp;
		phone2.makeCall();
//		=========================================================
		
		usePhone(lp);
		usePhone(sp);
	}
	
	public static void usePhone(Phone lp) { // 7���ٿ� �ִ� LgPhone ��ü lp���� �̸��� ���� �ٸ� ����. (��� ������ �ٸ�.)
		
		lp.makeCall();
		
		// ��ü Ȯ��
		if (lp instanceof LgPhone) {
			LgPhone lg = (LgPhone)lp;
			lg.doInternet();
			
		} else if (lp instanceof SamsungPhone) {
			SamsungPhone ss = (SamsungPhone)lp;
			ss.watchTv();
		}
	}
}
