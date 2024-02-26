package chap11.ex09;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		/*stop flag 를 활용한 thread
		StopFlag stop = new StopFlag();
		stop.start();
		Thread.sleep(1000);
		stop.setStop(true);
		*/
		
		/*interrupt 발생으로 thread 정지*/
		Inter inter = new Inter();
		inter.start();
		Thread.sleep(1000);
		inter.interrupt(); // 강제 interrupt 발생
		
		
		
	}

}
