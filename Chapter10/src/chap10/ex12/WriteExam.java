package chap10.ex12;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteExam {

	public static void main(String[] args) throws Exception {
		
		
		//java IO
		//1. 스캐너 객체 생성 후 입력 받기
		//2. 주 스트림 준비 + 경로 지정
		//3. 스캐너로 입력 받은 값 쓰기
		//4. 자원 반납
		
		
		//java NIO
		//1. 스캐너 준비
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 -> ");
		//2. 입력받은 내용 수에 저장
		String msg = scan.nextLine() + "\r\n";
		
		//3.Path 객체 생성
		Path path = Paths.get("tmp/img/nio/input.txt");
		if (Files.notExists(path)) {
			Files.createFile(path);
		}
		
		//4. 쓰기
		Files.write(path, msg.getBytes("UTF-8"), StandardOpenOption.APPEND);
		//APPEND : 같은 파일이 있는 경우 이후에 내용을 추가
		//CREATE : 파일이 존재하지 않으면 파일 생성
		//CREATE NEW : 이미 파일이 존재할 경우 새 파일을 생성
		//READ: 읽기 전용
		
		
		//5. 자원 반납
		scan.close();
		System.out.println("저장 완료");
		
		
		
		

	}

}
