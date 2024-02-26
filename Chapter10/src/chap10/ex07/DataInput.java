package chap10.ex07;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

public class DataInput {

	public static void main(String[] args) throws Exception {
		
		//1. 객체 + 읽을 파일 경로 + 주 스트림 준비
		FileInputStream fis = new FileInputStream("tmp/img/temp/data.dat");
		//보조 스트림 사용(java 고유데이터 사용)
		DataInputStream dis = new DataInputStream(fis);
		
		
		//2. 파일 읽기(쓴 순서 그대로 읽어와야 한다.)

		String name = dis.readUTF();
		int salary = dis.readInt();
		boolean promotion = dis.readBoolean();
		System.out.println(name + " /" + salary + "/ " + promotion);
		
		//3. 자원 반납(close)
		dis.close();
	}
}
