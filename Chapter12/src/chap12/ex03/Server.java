package chap12.ex03;

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
		// 1. 서버 소켓 준비
		try {
			server = new ServerSocket(5500);
			while(true) {
				// 2. 접속 요청 대기
				System.out.println("접속 대기중");
				// 3. 접속 허용
				Socket socket = server.accept();
				System.out.println("접속 완료");
				//4. 할 일
				
				InputStream is = socket.getInputStream();// 주스트림 준비
				ObjectInputStream ois = new ObjectInputStream(is); // 보조스트림 준비
				//읽기
				String msg = ois.readUTF();
				System.out.println("Client > " + msg);
				// 쓰기
				OutputStream os = socket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeUTF("너가 보낸 메세지 > " + msg);
				//다 썼으면 자원 반납
				oos.flush();
				ois.close();
				oos.close();
				socket.close();				
			}
		} catch (IOException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
			try {
				server.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
