package chap11.ex10;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println("(Work/Daemon) Thread 동작 중.......");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
