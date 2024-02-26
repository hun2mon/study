package chap10.ex07;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutput {

	//	java 의 고유 데이터를 저장하기 위해서는 dat 확장자를 사용해야 한다.
	public static void main(String[] args) throws Exception {
		
		//1. 객체생성  + 경로 지정 + 주스트림 준비 
		FileOutputStream fos = new FileOutputStream("tmp/img/temp/data.dat");
		
		// 보조스트림 사용(속도 UP, java 고유 데이터 타입 저장)
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		
		//2. 내보내기
		dos.writeUTF("김정훈");
		dos.writeInt(9000000);
		dos.writeBoolean(false);
		
		
		//3. 자원 반납 (flush , close)
		dos.flush();
		dos.close();	
	}
}
