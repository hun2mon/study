package chap10.ex08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedPractice {

	public static void main(String[] args) throws Exception {
		
		
		//1. 객체 생성 + 가져올 파일 지정 + 주 스트림
		FileInputStream fis = new FileInputStream("tmp/img/cat.MP4"); //cat.mp4 를 읽을 FileInputStream타입의 fis 라는 객체 생성
		
		//2. 내보낼 위치 지정 + 객체 생성 + 주 스트림
		FileOutputStream fos = new FileOutputStream("tmp/img/temp/cat_copy.mp4"); 
		// 읽어온 파일을 쓰기 위해 FileOutputStream 타입의 fos 에 객체를 생성해 주고 저장 위치와 파일 이름을 지정해 줍니다.
		
		
		// 보조스트림 (속도)
		BufferedInputStream bis = new BufferedInputStream(fis); // 읽기의 속도를 향상시키기 위해 fis를 bis에 탑승시킵니다.
		BufferedOutputStream bos = new BufferedOutputStream(fos); // 쓰기의 속도를 향상 시킥 위해 bos 에 fos 를 탑승시킵니다.
		
		//3. 파일 가져오기 - > 내보내기
		int data;
		long start = System.currentTimeMillis();
		while((data = bis.read()) != -1) { 
			//inputStream 과 OutputStream은 byte 타입기반이므로 int 타입 data 변수에 담아 반복문을 통해 작성해 줍니다. 
			//이때 조건식은 .read() 메서드는 읽을 값이 없으면 -1 을 반환하므로 -1이 아니면 계속 실행하도록 한다.
			bos.write(data); //.write 메서드를 통해 한자씩 옮겨줍니다.
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		System.out.println("파일 복사 완료");
		
		//4. 자원 반납(flush , close)
		bis.close();
		bos.flush(); //bos는 내보낼 데이터가 남아있을 수 있으므로 .flush메서드를 통해 모두 내보낸 뒤에 .close 메서드를 통해 닫는다.
		bos.close();
	}
}
