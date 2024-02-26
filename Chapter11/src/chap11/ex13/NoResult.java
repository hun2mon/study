package chap11.ex13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResult {

	public static void main(String[] args) throws Exception {
		
		ExecutorService pool = Executors.newCachedThreadPool();
		
		Runnable run = new Runnable() {// 할 일 지정
			@Override
			public void run() {
				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println("작업 처리중.....");
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					System.out.println("강제 종료 당함");
				}
			}
		};
		
		//runnable 은 반환하는 것이 없지만 blocking 기능을 이용하기 위해 예외적으로 submit() 사용가능
		Future<?> fu = pool.submit(run);// 반환 타입이 void 이므로 반화타입을 모른다(? : 와일드카드 타입)
		fu.get(); // 받을건 없지만 블로킹을 위해 get() 사용
		System.out.println("작업 완료");
	
		pool.shutdownNow(); // 풀 종료
		
		
	}

}
