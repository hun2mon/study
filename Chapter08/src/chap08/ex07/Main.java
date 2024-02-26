package chap08.ex07;

public class Main {

	public static void main(String[] args) {
		
		String data1= null;
		String data2 = "1234z";
		
		//multi catch : jdk 1.7부터 지원
		//여러 예외를 한곳에서 처리 가능
		//대신 예외 별로 각기 처리 어렵다.
		try {//문제 발생이 예상 되는 곳
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
		} catch (NumberFormatException | NullPointerException e) {//예외 발생 시 처리 내
			System.out.println("올바른 값이 입력 되어야 합니다");
		} finally {//무조건 실행 되어야 하는 곳
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
		}
	}
}
