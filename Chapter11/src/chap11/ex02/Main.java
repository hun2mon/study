package chap11.ex02;

public class Main {

	public static void main(String[] args) {
		

		Thread th = new Job(); //thread 객체화 (상속과 다형성 활용)
		//thread 실행
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
