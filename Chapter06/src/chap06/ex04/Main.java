package chap06.ex04;

public class Main {

	public static void main(String[] args) {
		// 다형성을 사용하기 전(첫째 ~ 다섯째)
		// 사용할 객체가 여러개라면 여러개의 객체를 담을 변수를 선언해 주어야 한다.
		// 만약 사용할 객체의 개수가 100개라면, 몇개의 변수를 선언해야 하는가?
		Child ch = new Child();
		ch.useRoom();
		
		ChildOne ch1 = new ChildOne();
		ch1.useRoom();
		
		ChildTwo ch2 = new ChildTwo();
		ch2.useRoom();
		
		ChildThree ch3 = new ChildThree();
		ch3.useRoom();
		
		ChildFour ch4 = new ChildFour();
		ch4.useRoom();
		
		System.out.println();
		
		// 다형성을 사용 한 후
		// 하나의 변수(부모타입)에 여러 객체(자식타입)를 수용할 수 있다.
		
		ParentHouse house;
		
		house = new Child();
		house.useRoom();
		
		house = new ChildOne();
		house.useRoom();
		
		house = new ChildTwo();
		house.useRoom();
		
		house = new ChildThree();
		house.useRoom();
		
		house = new ChildFour();
		house.useRoom();

	}

}
