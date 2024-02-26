package ch07.ex03;

public class Main {

	public static void main(String[] args) {

		
		// 1. interface 도 다형성을 활용할 수 있다.
		// class 다형성(상속받은 클래스가 부모 형태로 들어가는 것)
		// interface 다형성(구현받은 클래스가 인터페이스 형태로 들어가는 것)
		MouseEvent mouse;
		
		mouse = new Window();
		mouse.click(1);
		
		mouse = new Linux();
		mouse.dbiClick(2);
		
		mouse = new Mac();
		mouse.dbiClick(3);
		
	
		
		// 2. interface 는 객체화 할 수 없다.
		// interface 를 활용해 주는 class 가 있어야 한다.(interface 는 규격의 개념이기 때문)
		// MouseEvent m = new MouseEvent(); -> X
		
		
		mouse.wheel(1);
		
		MouseEvent.setDpi(400);
		
		
	}

}
