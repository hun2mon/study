package chap10.ex08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferPractice2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요 -> ");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력해 주세요 -> ");
		int score = scan.nextInt();
		
		FileOutputStream fos = new FileOutputStream("tmp/img/test.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("이름 =  " + name + "\r\n" + "나이 = ");

		dos.writeInt(score);
		
		dos.flush();
		dos.close();
		
		FileInputStream fis = new FileInputStream("tmp/img/test.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF() + " " + dis.readInt());
		
		dis.close();
		
		
		
		
	}

}
