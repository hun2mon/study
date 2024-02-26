package ch08.ex02;

public class Solution {
	public String solution(String my_string, int n) {
		
		String answer = "";
		
		StringBuffer buffer = new StringBuffer();
		
		// 각각의 문자를 뽑아내기
		String[] arr = my_string.split("");
		
		// 뽑아낸 문자를 n 번 반복
		for (String str : arr) {
			// 반복된 문자를 answer 에 합치기
			//buffer.append(str.repeat(n)); // 0.18ms ~ 0.26ms
			for (int i = 0; i < n; i++) {
				buffer.append(str); //0.15ms ~ 0.21ms
			}
		}
		answer = buffer.toString();
		
		
		
		
		return  answer;
    }

}
