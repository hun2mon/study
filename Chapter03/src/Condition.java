
public class Condition {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("조건이 참일 경우만 실행한다.");
		}
		
		if (false) { // dead code 경고
			System.out.println("무조건 실행되지 않는다.");
		}
		
		boolean a = true;
		boolean b = false;
		
		if (a) {
			System.out.println("a 는 true 이므로 실행된다.");
		}
		
		if (!b) {
			System.out.println("b는 false 이므로 실행되지 않는다.");
		}

	}

}
