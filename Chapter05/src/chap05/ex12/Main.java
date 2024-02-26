package chap05.ex12;

public class Main {
	
	
	public static void main(String[] args) {
		
		Computer com  = new Computer();
		
		
		// 전원(power) 상태를 변경하고 싶다.
		
		com.setPower(true);
		boolean power = com.isPower();
		System.out.println("현재 전원 상태 : "+power);
		
		// 팬 속도(panSpeed) 를 조절하고 싶다.

		int temp = com.getTemp();
		System.out.println("pc 온도 : " + temp);
		
		com.setPanSpeed(80);
		temp = com.getTemp();
		System.out.println("pc 온도 : " + temp);
		
		// 온도 조절의 경우 열어 주지 않았기 때문에 사용불가
		// 이렇게 개발자가 사용자의 실수를 막기 위해 접근제어자로 막아주는 것을 캡슐화.
		// com.setTemp();
		
	}

}
