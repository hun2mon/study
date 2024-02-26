package chap10.ex12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadExam {

	public static void main(String[] args) throws IOException {
		//java IO
		//1. 주 스트림 객체 생성 및 경로 지정 
		//1-2보조 스트림(선택)
		//2. 읽어오기
		//3. 자원 반
		
		//java IO
		//1. 경로 지정 
		Path path = Paths.get("tmp/img/temp/test.txt");
		
		//2. 읽어오기 - 일반 바이너리 파일의 경우 readBytes(path)
		List<String> lines = Files.readAllLines(path);
		
		for (String str : lines) {
			System.out.println(str);
		}
		
		
		
		
	}

}
