package ch05.ex07;

public class Car {
	
	int gear; //기어
	boolean on;  //시동상태

	public Car() {//혹시 모르니 초기화 해준다.
		gear = 0;
		on = false;
	}
	
	void start() {
		if (on) {
			System.out.println("시동이 이미 걸려 있습니다.");
			System.out.println("시동 끄겠습니다.");
			this.on = false;
		} else {			
			System.out.println("시동이 걸렸습니다.");		
			this.on = true;
		}
	}
	
	void change(int gear) {
		System.out.println(gear + "단으로 변속 되었습니다.");
		this.gear = gear;
	}

}
