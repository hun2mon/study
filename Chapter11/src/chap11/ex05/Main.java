package chap11.ex05;

public class Main {
	
	private static Thread.State state;

	public static void main(String[] args) {
		
		WorkThread work = new WorkThread(); // Thread 생성
		state = work.getState();
		System.out.println("Thread state : " + state);
		work.start(); // Thread 실행
		
		
		//계속해서 WorkThread 의 상태를 가져와 출력
		while(state != Thread.State.TERMINATED) {
			state = work.getState();
			System.out.println("Thread state : " + state);
			
			
			// WorkThread 가 종료되면 반복문 탈출
//			if (state == Thread.State.TERMINATED) {
//				break;
//			}
			
		}
		
	}

}
