package ch07.ex01;

public class Person extends Mammal {

	public Person(String name) {
		super(name); // 부모생성자의 줄임말
	}
	
	// name 은 Person 의 없는 변수이지만
	// Mammal 이 부모이므로 내것처럼 쓸 수 있다.
	public void useTool() {
		System.out.println(name + "가 도구를 사용한다.");
	}
	
	public void sosial() {
		System.out.println(name + "가 사회생활을 한다.");
	}
	
	public void talk() {
		System.out.println(name + "가 대화를 한다.");
	}

}
