package chap11.ex12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecMain {

	public static void main(String[] args) {
		
		// 1. ThreadPool 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. 빌려달라고 양식 작성(반환값 유무)
		// 없을 경우 - Runnable 구현
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ThreadPool - " + Thread.currentThread().getName());
			}
		};
		
		
		// 3. 빌려달라고 요청 - excute(), submit() : 왜?
		pool.execute(run);
		
		
		//4. ThreadPool 종료
		// shutdown() : 끝까지 기다린다.
		// pool.shutdown();
		pool.shutdownNow(); // 아예 기다리지 않는다.
	}

}
