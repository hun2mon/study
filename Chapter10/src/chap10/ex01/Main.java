package chap10.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// system 으로부터 받아온 것을 Scanner 로 받겠다.
		Scanner scan = new Scanner(System.in);
		
		// system 으로부터 밖으로 내보낸다.
		// print 할 내용을 (ln 은 줄 바꿈을 의미)
		System.out.print("문자열 입력 > " );
		
		// 입력받은 문자열 저장
		String inputStr = scan.nextLine();
		System.out.println(inputStr); 
		System.out.println(); // 아무 의미 없는 공백 출력 후 줄바꿈
		
		// 정수(int)
		System.out.println("정수 입력 >");
		int inputInt = scan.nextInt();
		System.out.println(inputInt);
		System.out.println();
		
		// 실수(double)
		System.out.println("실수 입력 >");
		double inputDouble = scan.nextDouble();
		System.out.println(inputDouble);
		System.out.println();
		
		
	}

}
