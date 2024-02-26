package chap06.ex10;

public class DriveController {

	public static void main(String[] args) {
		
		//자량 준비(필드 다형성)
		Car car;
		//레이서 준비
		Racer racer = new Racer();
		//운전
		car = new Audi();
		System.out.println(racer.drive(car));
		car = new Benz();
		System.out.println(racer.drive(car));
		car = new Bmw();
		System.out.println(racer.drive(car));
	

	}

}
