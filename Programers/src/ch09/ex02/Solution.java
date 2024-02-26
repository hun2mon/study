package ch09.ex02;

import java.util.HashMap;

public class Solution {
	public long solution(String numbers) {
        long answer = 0;
        
//        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        
//        for (int i = 0; i < arr.length; i++) {
//			numbers = numbers.replace(arr[i], String.valueOf(i));
//		}
        //2. HashMap
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        for (String key : map.keySet()) {
		numbers	= numbers.replaceAll(key, map.get(key));
		}
        
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }

}
