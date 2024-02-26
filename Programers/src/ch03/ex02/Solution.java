package ch03.ex02;

import java.util.Iterator;

public class Solution {
	
	public int solution(int n) {
		
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
        	if(i%2 == 0) {
        		answer += i;
        	}
		}
        return answer;
    }

}
