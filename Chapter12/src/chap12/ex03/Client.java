package chap12.ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			//1. 소켓 준비
			socket = new Socket("localhost", 5500);
			//2. 접속 요청
			System.out.println("접속 성공");
			//3. 할 일
			String msg = "Hi JAVA NetWork";
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			System.out.println("전송 내용 : msg");
			oos.writeUTF(msg);
			oos.flush();
			
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println(ois.readUTF());
			
			oos.close();
			ois.close();
		} catch (IOException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
