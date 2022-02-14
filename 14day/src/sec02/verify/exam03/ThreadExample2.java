package sec02.verify.exam03;

public class ThreadExample2 {

	public static void main(String[] args) {
		Thread thread = new MovieThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		((MovieThread2)thread).setStop(true);

	}

}
