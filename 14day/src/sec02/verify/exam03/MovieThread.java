package sec02.verify.exam03;

public class MovieThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			
			// 1) �Ͻ����� ���¸� ���� interrupt���� �߻�
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				break;
//			}
			
			// 2) �Ͻ����� ���¸� ������ �ʰ� interruptó�� 01
			// Thread�� �ν��Ͻ� �޼ҵ� ���
//			if (this.isInterrupted()) {
//				break;
//			}
			
			// 3) �Ͻ����� ���¸� ������ �ʰ� interruptó�� 02
			// Thread�� ����(static) �޼ҵ� ���
			if (Thread.interrupted()) {
				break;
			}
		
		}
	}
}
