 package ch04.ex01;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = 0;
		int dot[];
		
		dot = new int[] {2,4};
		result = sol.solution(dot);
		System.out.println("1==" + result);
		
		dot = new int[] {-7,9};
		result = sol.solution(dot);
		System.out.println("2==" + result);
		
		

	}

}
