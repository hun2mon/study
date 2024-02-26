package chap12.ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Sender {

	public static void main(String[] args) throws Exception {
		
			//소켓 생성
			Socket socket = new Socket("localhost", 6000);
			
			File file = new File("/Users/jeounghun/eclipse-workspace/JAVA/Chapter12/img/cat.MP4");
			String fileName = file.getName();//파일 이름
			long size = file.length();//크기(byte)
			
			//파일 불러올 주스트림 + 보조스트림
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			//파일 내보낼 주스트림 + 보조스트림
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeUTF(fileName);
			byte[] arr = new byte[(int) size];
			bis.read(arr); // 배열에 데이터가 담기고, 얼마만큼의 크기에 담겼는지 반환
			oos.write(arr);
			System.out.println("전송 완료 : 크기 (" + size + ")");
//			
//			while((data = bis.read()) != -1) {// 데이터 읽고 쓰기
//				bos.write(data);
//			}
//			
			//자원 반납
			oos.flush();
			bis.close();
			oos.close();
			socket.close();
	}

}
