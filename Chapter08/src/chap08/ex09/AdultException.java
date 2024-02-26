package chap08.ex09;

// 일반 예외 - 실행 해보지 않아도 미리 알려 준다.
public class AdultException extends Exception {

	public AdultException(String message) {
		super(message);
	}
}
