package ch05.ex04;

public class Main {

	public static void main(String[] args) {
		
		//API : 앱 개발 시 어려운 문제를 쉽게 해결해 주는 무언가(방법)
		//MyApi 의 plus 메서드는 더하기라는 어려운 문제를 간단하게 해결해 준다.
		MyApi api = new MyApi();
		
		// 클래스를 복사(객체화) 하고 나면 ctrl + space 를 통해 이용할 수 있는 메서드를 훑어보자
		int result = api.plus(100, 200);
		System.out.println("result = " + result);
		
		//라이브러리 : 도서관 - 누군가가 만들어 놓은 수많은 방법론(메서드) 들을 도서관 처럼 모아놓았다.

	}

}
