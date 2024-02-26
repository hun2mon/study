package chap11.ex01;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {// main 메서드는 main thread 를 동작하게 해주는 메서드
		
		WorkThread job = new WorkThread();
		Thread th = new Thread(job); // WorkThread 생성
		th.start(); // WorkThread 가 실행 됨
		
		
		
		// 이 안의 움직임은 모두 메인 스레드의 움직임이다.
		for (int i = 0; i < 5; i++) {
			System.out.println("메인 스레드가 하는 일 - " + i);
			Thread.sleep(500); // thread 한테 0.5초씩 자라고 한다.
		}
		
	}

}
