package chap11.ex10;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		//WorkThread 는 MainThread 가 끝나도 계속 움직인다.
		Thread th = new DaemonThread();
		
		//DaemonThread 는 MainThread 와 함께 끝난다.
		th.setDaemon(true);
		
		th.start();
		
		Thread.sleep(3000);
		
		System.out.println("MainThread 종료");
	}

}
