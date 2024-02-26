package ch05.ex10;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("KOREA", "홀길동");
		p.age = 30;
		
//		final 키워드가 붙은 필드는 초기값을 읽을수만 있다.{read only}
//		p.nation = "AMERICA";
//		p.name = "KIM";
		System.out.println(p.nation);
		System.out.println(p.name);
		System.out.println(Person.ssn);
		System.out.println(p.age);

	}
}
