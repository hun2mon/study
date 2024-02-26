package ch04.ex02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] result = {0,0};
		int[] num_list = {};
		Solution sol = new Solution();
		
		num_list = new int[] {1,2,3,4,5};
		result = sol.solution(num_list);
		System.out.println(Arrays.toString(result));
		
	}

}
