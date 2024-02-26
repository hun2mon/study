package chap10.ex12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExam {

	public static void main(String[] args) throws IOException {
		//JAVA IO
		//1. 위치지정 + 주 스트림(가져올곳, 내보낼곳)
		//2.보조 스트림
		//3.읽어오기
		//4.쓰기
		//5.자원반납(flush, close)
		
		
		//JAVA NIO
		//1. 위치지정 
		Path from = Paths.get("tmp/img/cat.mp4");
		Path to = Paths.get("tmp/img/nio/cat_copy.mp4");
		
		long start = System.currentTimeMillis();
		
		//2. 읽어오기 + 쓰기 = copy method 사용
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		//REPLACE_EXISTING : 이미 파일이 존재할 경우 덮어쓴다.(이 옵션이 없으면 파일 존재시 예외 발생)
		//COPY_ATTRIBUTES : 파일의 속성까지도 복사(권한, 읽기여부 등.....)
		
		long end = System.currentTimeMillis();
		System.out.println(end-start + "ms");
		
		
		
		
		
		
	}

}
