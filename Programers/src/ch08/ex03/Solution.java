package ch08.ex03;

public class Solution {
	
	public String solution(int age) {
		
		// {1,2,3,4,5,6,7,8,9}
		//{a,b,c,d,e,f,g,h,i,j}
		String answer = "";
		String str = "abcdefghij";
		StringBuffer buffer = new StringBuffer();
		
		String[] num = (age + "").split("");
				
		for (String n : num) {
		int idx = Integer.parseInt(n);
		buffer.append(str.charAt(idx));
		}
		answer = buffer.toString();
		
        return answer;
        
        
        
    }
	
	
}
