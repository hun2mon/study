package ch07.ex04;

import ch07.ex03.MouseEvent;

public class Window implements MouseEvent, KeyEvent {
	
	//KeyEvent의 추상 메서드 구현
	@Override
	public void keyDown(int key) {
		
	}

	@Override
	public void keyup(int key) {
		
	}
	
	//MouseEvent의 추상 메서드 구현
	@Override
	public void click(int button) {
	
	}

	@Override
	public void dbiClick(int button) {
	
	}

	@Override
	public Double[] move() {
		return null;
	}

}
