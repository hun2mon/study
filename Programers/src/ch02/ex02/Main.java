package ch02.ex02;

public class Main {

	public static void main(String[] args) {
		Solusion sol = new Solusion();
		String result = "";
		result = sol.solution(3);
		System.out.println("Odd == " + result);
		result = sol.solution(4);
		System.out.println("Even == " + result);

	}

}
