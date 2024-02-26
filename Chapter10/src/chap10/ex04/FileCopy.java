package chap10.ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
//		//1-1. 읽어올 위치 + 파일객체 생성
//		File src = new File("tmp/img/dog.jpeg");
//		//1-2. 내보낼 위치 + 파일객체 생성
//		File dst = new File("tmp/img/temp/dog_copy.jpeg");

		//2-1. 읽어올 빨대 준비(File 이 앞에 붙으면 파일객체가 내장 되있다.) - 그러므로 파일 객체를 만들지 않아도 됨.
		FileInputStream fis = new FileInputStream("tmp/img/cat.mp4");
		//2-2. 내보낼 빨대 준비
		FileOutputStream fos = new FileOutputStream("tmp/img/temp/cat_copy.mp4");
		
		/*3. 읽어오기 -> 쓰기 (안정성이 훨씬 좋다. 하지만 속도가 느리다.)
		int data;
		while((data = fis.read()) != -1) {
			fos.write(data);
			i++;
			System.out.println("파일 복사 중... " + i);
		}
		*/
		int i = 0;
		
		byte[] arr = new byte[1024];
		
		while(fis.read(arr) != -1) {// 배열을 넣으면 얼마나 옮기는지 출력, 이후 더이상 읽을게 없으면 -1반
			// 읽은 데이터가 매개변수로 주어진 배열에 담긴다.
			fos.write(arr);
			i++;
			System.out.println("파일 복사 중... " + i);
		}
		
		//4. 자원 반납 (flush, close)
		fis.close();
		fos.flush();
		fos.close();
		
	}

}
