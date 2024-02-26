package ch04.ex03;

public class Solution {
	public int[] solution(int money) {
        int[] answer = {0,0};
        
        //1.아메리카노 5500원
        //2. 얼마를 가지고 있는데 answer{개수, 남는 돈}을 구해라.
        //개수(몫) = 가지고 있는 돈(money) / 가격(5500)
        //남는돈(나머지) = 가지고 있는 돈(money) % 가격(5500)
        
        answer[0] = money/5500;
        answer[1] = money%5500;
        
        return answer;
    }

}
