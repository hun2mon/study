import java.util.Arrays;

public class Summary {

	public static void main(String[] args) {
		String str = "abcdefg";
		boolean boolResult;
		int intResult;
		
		// 문자열 만드는 방식
		String str1 = "abcdefg"; //리터럴 방식
				
		String str2 = new String("abcdefg");
				
		char[] arr = {'a','b','c','d','e','f','g'};
		String str3 = new String(arr);
		String strResult;
		char chResult;
		
		// 문자열의 길이 
		intResult = str.length();
		System.out.println(intResult);
		
		// 특정 인덱스의 값 가져오기
		chResult = str.charAt(2);
		System.out.println(chResult);
		
		// 문자열 -> char 배열
		arr = str.toCharArray();
		System.out.println(arr[2]);
		
		// 특정 문자가 어느 인덱스에 있는지 확인
		str = "abcdabcdabcd";
		
		//a 를 찾아보자(앞에서부터 1개 밖에 못찾음)
		intResult = str.indexOf("a");
		System.out.println("a의 위치는 : " + intResult);
		
		//뒤에서부터 찾아보자
		intResult = str.lastIndexOf("a");
		System.out.println("a의 위치는 : " + intResult);
		
		//문자열 잘라내기
		str = "0123456789";
		strResult = str.substring(3); //3번 인덱스부터 끝까지
		System.out.println(strResult);
			
		strResult = str.substring(1, 5); //1번부터 보여주고, 5번 인덱스 부터는 버려
		System.out.println(strResult);
			
		//특정 문자를 기준으로 잘라내기
		str = "a/b/c/d/e/f/g";
		String[] list = str.split("/");
		System.out.println(Arrays.toString(list));
			
		list = str.split(""); //구분자 안넣으면 어떻게 되는가? -> 모든 문자를 다 끊어 놓는다.
		System.out.println(Arrays.toString(list));
		
		//문자열 비교
		boolResult = "abc".equals(str);
		System.out.println("두 문자가 같은가? " + boolResult);
		
		//특정 문자열 포함 여부
		boolResult = str.contains("c");
		System.out.println(str + " 안에 c 가 포함되어 있는가? " + boolResult);
		
		//문자열 교체
		strResult = str.replace("abc", "abc".toUpperCase());
		System.out.println(str + " -> " +strResult);
		
		//앞뒤 공백 제거
		str =  " 가나다라마바사 ";
		strResult = str.trim();
		System.out.println(str);
		System.out.println(strResult);
		
		//문자열의 시작과 끝
		str = "[img]uploadFile.png";
		
		boolResult = str.startsWith("[img]");
		System.out.println("[img]로 시작 하는가? " + boolResult);
		
		boolResult = str.endsWith(".png");
		System.out.println(".png 로 끝나는가? " + boolResult);
		
		//반복 repeat
		strResult = "*".repeat(10);
		System.out.println(strResult);
		
		//문자열 누적합
		str = "문자열을 ";
		str += "추가하면 ";
		str += "객체가 증가한다.";
		System.out.println(str);
		
		//StringBuffer(다수유저 X) & StringBuilder(다수유저 O) 
		
		StringBuffer buffer = new StringBuffer("문자열을 ");
		buffer.append("추가하면 ");
		buffer.append("객체 크기가 증가한다.");
		System.out.println(buffer);
		
		str = buffer.toString(); //문자열화 시킬 수 있다.
		str = buffer.reverse().toString(); //문자열을 뒤집는다.
		System.out.println(str);

	}

}
