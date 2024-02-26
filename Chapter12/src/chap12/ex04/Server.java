package chap12.ex04;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		// 1. 서버소켓 준비
		try {
			server = new ServerSocket(5500);
			// 2. 접속 허용
			while(true) {
				System.out.println("접속 성공!");
				Socket socket = server.accept();
				//주 스트림 준비
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				//보조 스트림 준비
				ObjectInputStream ois = new ObjectInputStream(is);
				ObjectOutputStream oos =  new ObjectOutputStream(os);
				// 3. 할일
				String msg = ois.readUTF();
				System.out.println("받은 메세지 : " + msg);
				oos.writeUTF(msg);
				oos.flush();
				// 4. 자원 반납
				ois.close();
				oos.close();
				socket.close();
			}
		} catch (IOException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		
		
	}

}
