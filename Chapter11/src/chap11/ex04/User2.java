package chap11.ex04;

public class User2 extends Thread {

	private Computer com;
	
	public User2(Computer com) {
		setName("user2");
		this.com = com;
	}

	@Override
	public void run() {
		com.setScore(200); // user2은 점수를 200점으로 만들어 놨다.
	}
	
	

}
