package ch07.ex01;

public class Main {

	public static void main(String[] args) {
		
		// 추상클래스는 자식 외에 절대 부를 수 없다.
		// Mammal mal = new Mammal("");
		
		Person person = new Person("영희");
		
		
		person.useTool();
		person.sosial();
		person.talk();
		//부모메서드
		person.birth();
		person.eat();
	}

}
