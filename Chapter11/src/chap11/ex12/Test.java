package chap11.ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Thread Pool 생성
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		//2. 수행할 작업 작성
		Runnable run = new Runnable() {
			@Override
			public void run() {
				notify();
				System.out.println("Thread pool : " + Thread.currentThread().getName());
			}
		};
		//3. 작업 요청
		for (int i = 1; i <= 10; i++) {
			pool.execute(run);
		}

		//4. 더이상 사용하지 않으면 Pool 종료
		pool.shutdown();
		System.out.println("종료 여부 : " + pool.awaitTermination(1, TimeUnit.SECONDS));
		
		
		
		
	}

}
