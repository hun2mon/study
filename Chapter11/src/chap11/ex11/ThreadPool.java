package chap11.ex11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	
	public static void main(String[] args) {
		
		ExecutorService pool = null;
		// 아무것도 없이 있다가 요청이 있으면 그때 만든다.
		// 반납받은 thread 가 있으면 빌려준다.
		// 반납받은 thread 가 60초간 놀고 있으면 버린다.
		// pool = Executors.newCachedThreadPool();
		
		
		// 초기에 n 개의 thread 를 구비하고 있는다.
		// 일반적으로 n 은 CPU에서 가용 가능한 MainThread 개수
		int n = Runtime.getRuntime().availableProcessors();
		System.out.println("MainThread : " + n);
		pool = Executors.newFixedThreadPool(n);
	}

}
