package ch02.ex06;

public class Solution {
	public int solution(int n, int k) {
        int answer =  n * 12000 + k * 2000 - (n/10) * 2000;
        return answer;
    }
}
