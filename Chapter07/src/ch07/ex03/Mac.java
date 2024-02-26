package ch07.ex03;

public class Mac implements MouseEvent {

	@Override
	public void click(int button) {
		System.out.println(button + "번 버튼 클릭");
	}

	@Override
	public void dbiClick(int button) {
		System.out.println(button + "번 버튼 더블 클릭");
	}

	@Override
	public Double[] move() {
		System.out.println("원래는 움직인 좌표 반환");
		return null;
	}

}
