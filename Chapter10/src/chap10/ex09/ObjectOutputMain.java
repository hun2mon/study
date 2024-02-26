package chap10.ex09;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectOutputMain {

	public static void main(String[] args) {
		
		try {
			//1. 내보낼 주스트림 객체 생성 및 경로 지정
			FileOutputStream fos = new FileOutputStream("tmp/img/object.dat");
		
			//보조스트림 (속도 + 오브젝트 내보내기)
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			//2. 내보내기
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", "김정훈");
			map.put("phone", "010-4593-2857");
			
			// map 형태 넣기
			oos.writeObject(map);
		
			// array 형태 넣기
			oos.writeObject(new int[] {10,20,30,40,50});
			
			// 기본 형태 넣기
			oos.writeUTF("기본 형태도 사용 가능");
			
			// 클래스 객체 넣기
			oos.writeObject(new Sample());
			
			//3. 자원 반납(flush, close)
			oos.flush();
			oos.close();
			System.out.println("저장 완료");
		
		
		} catch (Exception e) {
			System.out.println("파일 저장중 문제 발생");
			e.printStackTrace();
		}
		
	} 

}
