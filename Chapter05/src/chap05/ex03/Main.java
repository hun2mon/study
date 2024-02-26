package chap05.ex03;

public class Main {

	public static void main(String[] args) {
	
		
		// std1과 std2는 각각 다른 복사본이다.
		Student std1 = new Student();		// Student를 담을 std1 이라는 변수를 만들고
		Student std2 = new Student();		// Student를 복사한다.
		
		// 일련번호를 보면 서로 다르다.(내용은 같을 지라도...)
		System.out.println(std1);
		System.out.println(std2);
		
		// 그래서 String 끼리 == 대조한다면 일련번호를 대조하기 때문에 다르다고 판단할 수도 있다.
		// 그래서 equals() 를 통해 일련번호가 아닌 내용으로 대조 하도록 해야하 한다.
	}

}
