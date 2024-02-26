package ch04.ex02;

import java.util.Iterator;

public class Solution {
	
	public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        //들어온 배열의 answer{짝수의 수, 홀수의 수}
        
        for (int n : num_list) {
			if (n%2==0) {
				answer[0]++;
			} else {
				answer[1]++;
			}
		}

        return answer;
		}
      
    }


