package chap10.ex06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferMain {

	// 이미지 복사하기
	public static void main(String[] args) throws Exception {
		
		// 빨대, 객체 생성
		FileInputStream file = new FileInputStream("tmp/img/cat.mp4");
		FileOutputStream out = new FileOutputStream("tmp/img/temp/cat2.mp4");
		
		// 보조 스트림 준비
		BufferedInputStream bis = new BufferedInputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		// 읽어오기 -> 내보내기
		int data;
		long start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		System.out.println("저장 완료");
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		// 자원 반납
		bis.close();
		bos.flush();
		bos.close();
	}
}
