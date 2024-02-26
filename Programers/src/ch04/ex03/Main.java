package ch04.ex03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(5500);
		System.out.println(Arrays.toString(result));
		
		result = sol.solution(15000);
		System.out.println(Arrays.toString(result));
	
		

	}

}
