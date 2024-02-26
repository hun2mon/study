package chap11.ex08;

public class Main {

	public static void main(String[] args) {
		
		//WorkObj 를 객체화
		WorkObj obj = new WorkObj();
		
		//Thread 2개 생성해서 각각 나눠준다.
		WorkThread thA = new WorkThread(obj);
		WorkThread thB = new WorkThread(obj);
		
		//Thread 실행
		thA.start();
		thB.start();
		
		
	}

}
