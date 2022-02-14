package sec02.verify.exam03;

public class MovieThread extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			
			// 1) 일시정지 상태를 만들어서 interrupt예외 발생
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				break;
//			}
			
			// 2) 일시정지 상태를 만들지 않고 interrupt처리 01
			// Thread의 인스턴스 메소드 사용
//			if (this.isInterrupted()) {
//				break;
//			}
			
			// 3) 일시정지 상태를 만들지 않고 interrupt처리 02
			// Thread의 정적(static) 메소드 사용
			if (Thread.interrupted()) {
				break;
			}
		
		}
	}
}
