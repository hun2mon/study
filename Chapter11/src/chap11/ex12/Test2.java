package chap11.ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Thread Pool 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		//2. 수행할 작업 작성
		Runnable run = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Thread pool" + Thread.currentThread().getName());
				}
			}
		};
	
		//3. 작업 요청
		pool.execute(run);

		//4. 더이상 사용하지 않으면 Pool 종료
		pool.shutdown();
		System.out.println(pool.awaitTermination(1, TimeUnit.SECONDS));
		
		
		
		
	}

}
