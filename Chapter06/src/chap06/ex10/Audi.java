package chap06.ex10;

public class Audi extends Car {
	@Override
	public String run() {
		return "아우디" + super.run();	
	}
}
