package chap08.ex02;

import java.util.Arrays;
import java.util.Iterator;

public class StringArr {

	public static void main(String[] args) { // 문자열 == 문자배
		
		String str = "abcdefg";
		
		String strResult;
		int intResult;
		char chResult;
		
		// 문자열의 길이 
		intResult = str.length();
		System.out.println(intResult);
		
		// 특정 인덱스의 값 가져오기
		chResult = str.charAt(2);
		System.out.println(chResult);
		
		// 문자열 -> char 배열
		char[] arr = str.toCharArray();
		System.out.println(arr[2]);
		
		// 특정 문자가 어느 인덱스에 있는지 확인
		str = "abcdabcdabcd";
		
		//a 를 찾아보자(앞에서부터 1개 밖에 못찾음)
		intResult = str.indexOf("a");
		System.out.println("a의 위치는 : " + intResult);
		
		//뒤에서부터 찾아보자
		intResult = str.lastIndexOf("a");
		System.out.println("a의 위치는 : " + intResult);
		
		//모든 c 를 다 찾고 싶다면?
		// 1. 배열 활용
		char[] arr2 = str.toCharArray();
		System.out.print("c의 위치는 : ");
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 'c') {
				 System.out.print(i + "번 ");
			}
		}
		System.out.println();
		
		// 2. indexOf 오버로드 메서드 활용
		intResult = 0; //intResult 는 인덱스 번호로 활용되기 때문에 0을 넣어준다.
		//while문을 통해 indexOf라는 메서드를 여러번 반복하여 "c"를 가지고 있는 인덱스 번호를 추출한다.
		while(intResult>-1) { //indexOf는 더이상 찾을게 없으면 -1을 반환하므로 intResult가 -1보다 크다는 조건을 걸어준다.
			intResult = str.indexOf("c", intResult);
			System.out.println(intResult);
			if(intResult == -1) {
				continue;
			}
			intResult++;
		}
		
		//2
		while(intResult>-1) {
			intResult = str.indexOf("c", intResult);
			if(intResult>-1) {
				System.out.println(intResult);
				intResult++;	
			}
		}
		
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
		
		
		
		
	}
	
	

}
