package chap12.ex06;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

// 받기 전용 스레드
public class ReceiveThread extends Thread {
	
	Socket socket = null;
	ObjectInputStream ois = null;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			ois = new ObjectInputStream(socket.getInputStream()); // 스트림 받아냄
			while(true) {
				String msg = ois.readUTF();
				System.out.println("받은 메시지 : " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				ois.close();
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		
		
	}
	
	

}
