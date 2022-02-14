package com.kh;

public class PhoneMain2 {

	public static void main(String[] args) {

		LgPhone lp = new LgPhone();
		SamsungPhone sp = new SamsungPhone();

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
			SamsungPhone sp = (SamsungPhone)lp;
			sp.watchTv();
		}
	}
}
