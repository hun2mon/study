package ch07.ex03;

public interface MouseEvent {
	
	//interface 는 추상메서드가 기본메서드이다.
	public void click(int button);
	public void dbiClick(int button);
	public Double[] move();
	
	//1.8 부터 가능해진 기능
	//default 메서드
	public default void wheel(int i) {
		if (i == 1) {
			System.out.println("윗방향으로 스크롤");
		} else {
			System.out.println("아랫방향으로 스크롤");
		}
		
	}
	
	//static 메서드
	public static void setDpi(int dpi) {
		System.out.println("강도 조절 : " + dpi);
	}

}
