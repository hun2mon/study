package chap10.ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 ->");
		String name = scan.nextLine();
		
		System.out.print("급여를 입력하세요 ->");
		int salary = scan.nextInt();
		
		System.out.print("승진여부를 입력하세요 ->");
		boolean promotion  = scan.nextBoolean();
		
		
		//1. 객체 생성 및 경로 지정 주 스트림
		FileOutputStream fos = new FileOutputStream("tmp/img/temp/input_smaple.dat");
		//보조 스트림
		DataOutputStream dos = new DataOutputStream(fos);
		//2. 파일 내보내기
		dos.writeUTF(name);
		dos.writeInt(salary);
		dos.writeBoolean(promotion);
		
		//3. 자원 반납(flush , close)
		scan.close();
		dos.flush();
		dos.close();
		
		
		
		
		// 파일 읽기
		//1. 객체 생성 및 경로 지정 주 스트림
		FileInputStream fis = new FileInputStream("tmp/img/temp/input_smaple.dat");
		//1-2보조 스트림
		DataInputStream dis = new DataInputStream(fis);
		
		//2.파일 읽기
		System.out.println(dis.readUTF() + "/" + dis.readInt() + "/" + dis.readBoolean());
		
		//3.자원 반납
		dis.close();
		
	}

}
