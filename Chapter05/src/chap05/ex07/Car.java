package chap05.ex07;

public class Car {

	int gear = 0; // 기어
	boolean on = false; // 시동상태
	
	public Car() {
		gear = 0;
		on = false;
	}

	void start() {
		
		if (on) {
			System.out.println("시동이 이미 걸려 있습니다.");
		}else {
			System.out.println("시동이 걸렸습니다.");			
		}
	}
	
	
	void chanege(int gear) {
		System.out.println(gear+"단으로 변속 되었습니다.");
		this.gear = gear;
	
	}
	
}


