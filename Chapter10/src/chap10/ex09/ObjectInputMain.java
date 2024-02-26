package chap10.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

public class ObjectInputMain {

	public static void main(String[] args) {
		
		try {
			//1. 불러올 스트림 준비 및 경로 지정
			FileInputStream fis = new FileInputStream("tmp/img/object.dat");
			
			//보조 스트림(버퍼, 오브젝트)
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			//2. 읽기
			//map
			Map<String, String> map = (Map<String, String>) ois.readObject();
			
			//array
			int[] arr = (int[]) ois.readObject();
			
			//String
			String str = ois.readUTF();
			
			//class
			Sample sample = (Sample) ois.readObject();
			
			System.out.println(map);
			System.out.println(Arrays.toString(arr));
			System.out.println(str);
			System.out.println(sample.team + " " + sample.num + " " + sample.job);
			System.out.println(sample.method());
			//3. 자원 반납(close)
			ois.close();
		
		} catch (Exception e) {
			System.out.println("불러오는중 문제가 발생했습니다.");
			e.printStackTrace();
		}
	}

}
