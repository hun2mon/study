package ch07.ex05;

import ch07.ex03.MouseEvent;
import ch07.ex03.Window;

public class Main {

	public static void main(String[] args) {
		
		// 일반적인 객체화의 경우(다형성 활용)
		MouseEvent mouse = new Window();
		// 일반적으로 interface 를 활용하기 위해서는 구현해줄 class 가 필요하다.
		
		// 익명개체 활용
		// interface 를 구현받을 클래스의 이름이 '익명' 이다.
		// 그러므로 interface 를 구현받은 클래스는 이곳외에 어디서도 부를 수 없다.
		MouseEvent evt = new MouseEvent() {
			
			@Override
			public Double[] move() {
				return null;
			}
			
			@Override
			public void dbiClick(int button) {
				System.out.println(button + "번 버튼 더블 클릭");
			}
			
			@Override
			public void click(int button) {
				System.out.println(button + "번 버튼 클릭");
			}
		};
		
		evt.click(1);
		evt.dbiClick(2);
		
	}

}
