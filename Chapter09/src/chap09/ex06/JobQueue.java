package chap09.ex06;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {

	public static void main(String[] args) {
		
		//Queue 는 규겨일 뿐이고, 실제로는 링크드 리스트로 만들어 졌다.
		Queue<Job> queue = new LinkedList<Job>();
		
		// 데이터추가 : offer()
		queue.offer(new Job("send SMS", "Alice"));
		queue.offer(new Job("send Main", "Bryan"));
		queue.offer(new Job("send SMS", "Chriss"));
		queue.offer(new Job("send Mail", "Denis"));
		queue.offer(new Job("send SMS", "Erick"));
		
		// 하나씩 빼내기 : poll()
		//isEmpty()
		Job job = null;
		while(!queue.isEmpty()) {
			job = queue.poll();
			// peek() 을 쓰면 확인하고 다시 넣는다.
			System.out.println(job.getTo() + " 에게 " + job.getCommand() + " 을 해라");
		}
	}

}
