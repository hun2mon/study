package chap06.ex09;

public class DriveController {

	public static void main(String[] args) {
		
		//차량 준비
		Benz benz = new Benz();
		Bmw bmw = new Bmw();
		Audi audi = new Audi();
		
		//레이서에게 운전을 요청한다.
		Racer racer = new Racer();
		racer.drive(audi);
		racer.drive(benz);
		racer.drive(bmw);
		

	}

}
