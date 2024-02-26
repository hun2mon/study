package chap08.ex08;

public class Main {

	//JVM 에게 전가 - 안한것과 다름 없다.
	public static void main(String[] args) {
	
		try {
			Sub sub = new Sub();
			sub.method1(); // 1. main() -> method1() 호출
		} catch (Exception e) {//예외에 대한 모든 정보가 e 에 들어가 있다.
			System.out.println("숫자만 입력 하세요");
			//어떤 예외가 발생했는지 간단하게 알려준다.
			System.out.println(e.toString());
		}
	}
}
