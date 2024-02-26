package chap10.ex05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		/* 1. 위치 선정 및 객체 생성 파일 생성
		File file = new  File("tmp/img/temp/smaple.txt");
		if (file.exists() == false) {
			file.createNewFile();
		}
		*/
		
		//Scanner 를 이용해 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 내용 = ");
		
		String inputStr = scan.nextLine();
		System.out.println("입력한 내용 = " + inputStr);
		
		// 2. 빨대 생성
		FileWriter writer = new FileWriter("tmp/img/temp/smaple.txt", true);
		
		// 3. 내보내기
		writer.write(inputStr + "\r\n");
		System.out.println("파일 저장 완료");
		
		// 4. 자원 반납
		scan.close();
		writer.flush();
		writer.close();
		
		
		
	}

}
