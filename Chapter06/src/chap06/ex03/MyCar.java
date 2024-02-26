package chap06.ex03;

public class MyCar extends ParentCar {

	
	// 부모로부터 받은 메서드를 완전히 뜯어 고친다.
	/*
	@Override
	public int run() {
		return 200;
	}
	*/
	
	// 일부분만 변경(부모걸 사용할 수도 안할수도 있음.)
	// super는 부모를 의미한다.
	boolean turbo = false;
	
	@Override
	public int run() {// 상황에 따라 부모 메서드를 일부 사용
		if (turbo) {
			return 200;
		} else {
			return super.run();			
		}
	}


}
