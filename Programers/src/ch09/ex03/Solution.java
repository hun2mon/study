package ch09.ex03;

import java.util.Arrays;

public class Solution {
	
	public int solution(int []a, int []b)
    {
        int answer = 0;
        int length = b.length - 1;
        
        //a 는 작은수가 앞에 오도록 정렬
        Arrays.sort(a);
        
        //b 는 큰 수가 앞에 오도록 정렬
        Arrays.sort(b);
        
        //각 인덱스 별로 곱하고 더해준다.
//        for (int i = 0; i < b.length; i++) {
//			answer +=  a[i] * b[length--];
//		}
        
        for (int i = 0; i < b.length; i++) {
			answer +=  a[i] * b[b.length-1-i];
		}

        return answer;
    }
}
