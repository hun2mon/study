package chap11.ex01;

public class AnonyName {

	public static void main(String[] args) {
		
		// Runnable 인터페이스로 할 일 생성
		Runnable job = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("WorkThread...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// Thread 객체화 시 인터페이스를 대입
		Thread th = new Thread(job);

		// 실행
		th.start();
	
		//MainThread
		for (int i = 0; i < 5; i++) {
			System.out.println("MainThread....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}

}
