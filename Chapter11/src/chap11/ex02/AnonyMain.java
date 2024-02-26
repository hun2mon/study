package chap11.ex02;

public class AnonyMain {

	public static void main(String[] args) {
		
		//클래스로 익명 객체? {}코드블럭을 붙여주면 됌
		Thread th = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("WorkThread....");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("MainThread...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
