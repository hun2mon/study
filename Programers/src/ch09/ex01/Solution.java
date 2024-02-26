package ch09.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Solution {
	
	public String solution(String letter) {
        String answer = "";
        StringBuffer buffer = new StringBuffer();
        
        Map<String, String> map = new HashMap<String, String>();
        map.put(".-","a");
        map.put("-...","b");
        map.put("-.-.","c");
        map.put("-..","d");
        map.put(".","e");
        map.put("..-.","f");
        map.put("--.","g");
        map.put("....","h");
        map.put("..","i");
        map.put(".---","j");
        map.put("-.-","k");
        map.put(".-..","l");
        map.put("--","m");
        map.put("-.","n");
        map.put("---","o");
        map.put(".--.","p");
        map.put("--.-","q");
        map.put(".-.","r");
        map.put("...","s");
        map.put("-","t");
        map.put("..-","u");
        map.put("...-","v");
        map.put(".--","w");
        map.put("-..-","x");
        map.put("-.--","y");
        map.put("--..","z");
        
        
        // letter 로 들어온 값을 split(" ") 으로 나눠서 배열에 담기
        String[] letters = letter.split(" ");
        
        for (String str : letters) {
        	buffer.append(map.get(str));
		}
        answer = buffer.toString();

        return answer;
    }
}
