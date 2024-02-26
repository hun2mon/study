package chap12.ex05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {

	public static void main(String[] args) throws Exception {
		
		//서버 소켓 생성
		ServerSocket server = new ServerSocket(6000);
		while(true) {
			System.out.println("접속 성공");
			Socket socket = server.accept();// 접속 대기
			
			// 소켓을 이용하여 파일 수신할 주스트림 + 보조 스트림 생성
			InputStream is = socket.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			ObjectInputStream ois = new ObjectInputStream(bis);
			String fileName = ois.readUTF();
			
			// 수신한 파일을 내보내줄 주스트림 + 보조스트림
			FileOutputStream fos = new FileOutputStream("/Users/jeounghun/eclipse-workspace/JAVA/Chapter12/img/tmp/" + fileName); 
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			System.out.println("파일 저장 시작");
			
			int data;
			while((data = ois.read()) != -1) {//수신 한 데이터 읽고 저장
				bos.write(data);
			}
			
			System.out.println("복사 완료");
			
			//자원 반납
			bos.flush();
			ois.close();
			bos.close();
			socket.close();
		}

	}

}
