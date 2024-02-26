package chap12.ex06;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

// 보내기 전용 스레드
public class SenderThread extends Thread {
	
	Socket socket = null;
	ObjectOutputStream oos = null;
	Scanner scan = null;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
			scan = new Scanner(System.in);
			while(true) {
				String msg = scan.nextLine();
				oos.writeUTF(msg);
				oos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
			try {
				oos.close();
				scan.close();
				socket.close();
			} catch (IOException e1) {	}
		}
	}
}
