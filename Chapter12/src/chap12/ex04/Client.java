package chap12.ex04;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("메세지를 입력하세요 -> ");
		String msg = scan.nextLine();
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 5500);
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			
			ObjectOutputStream oos = new ObjectOutputStream(os);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			oos.writeUTF(msg);
			oos.flush();
			
			System.out.println(ois.readUTF());
			
			ois.close();
			oos.close();
			
		} catch (Exception e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
