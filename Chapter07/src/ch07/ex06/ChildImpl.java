package ch07.ex06;

// Child, KeyEvent, MouseEvent 의 추상메서드를 강제 오버라이드 한다.
public class ChildImpl implements Child {
	
	
	//MouseEvent 내용
	@Override
	public void click(int button) {
		System.out.println(button + "몇번 버튼 클릭");
	}

	@Override
	public void dbiClick(int button) {
		System.out.println(button + "몇번 버튼 더블 클릭");
	}

	@Override
	public Double[] move() {
		return null;
	}
	
	//KeyEvent 내용
	@Override
	public void keyDown(int key) {
		System.out.println((char)key + "키 누름");
	}

	@Override
	public void keyup(int key) {
		System.out.println((char)key + "키 땜");
	}
	
	//Child 내용
	@Override
	public void textField(String input) {
		System.out.println(input + "라고 입력");
	}

	@Override
	public void selectOne() {
		System.out.println("아이템 선택");
	}

	@Override
	public void checkOne() {
		System.out.println("아이템 체크");
	}

}
