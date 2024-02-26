package ch05.ex06;

public class Main {

	public static void main(String[] args) {
		
		//Puppy 라는 객체가 생성될때 이름과 할 일을 지정해 준다.
		Puppy puppy = new Puppy("백구", "집 지키기");
		System.out.println(puppy.name);
		System.out.println(puppy.goal);
		
		Puppy p1 = new Puppy();
		Puppy p2 = new Puppy("백구");

	}

}
