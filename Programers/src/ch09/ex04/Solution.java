package ch09.ex04;

public class Solution {
	
	 boolean solution(String s) {
	        boolean answer = true;
	        //(의 개수 )의 개수 같은지
	        
	        //닫힘으로 시작하면 애초에 비교할 가치가 없다.
	        
	        if (s.startsWith(")")) {
				return false;
			}
	        
	        int sum = 0;
	        for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {// ' ( '일 경우 값 증가
					sum++;
				} else {// ' ) ' 일 경우 값 감소
					if (sum>0) {
						sum--;						
					} else {
						return false;
					}
				}
			}
	        answer = sum == 0;
	       	return answer;
	    }

}
