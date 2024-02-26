package chap11.ex12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1. ThreadPool 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		//2. 빌려달라고 양식 작성(반환값 유무)
		//있을 경우
		Callable<String> call = new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "ThreadPool -" + Thread.currentThread().getName();
				
			}
		};
		
		//3. 빌려달라고 요청 - submit()
		Future<String> fu = pool.submit(call);
		System.out.println(fu.get());
		
		//4. ThreadPool 종료
		// shutdown() & awaitermination()
		pool.shutdown();
		boolean end =  pool.awaitTermination(1L, TimeUnit.SECONDS);
		System.out.println(end);
	}

}
