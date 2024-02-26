package ch05.ex03;

public class Main {

	public static void main(String[] args) {
		
		// std1 과 std2는 각각 다른 본사본이다.		
		Student std1 = new Student();
		Student std2 = new Student();
		
		//일련번호를 보면 서로 다르다.(내용은 같아도...)
		System.out.println(std1);
		System.out.println(std2);
		
		//그래서 String 끼리 ==로 대조한다면 일련번호를 대조하기 때문에 다르다고 판단할 수 있다.
		//그래서 equals() 통해 일련번호가 아닌 내용으로 대조 하도록 한다.

	}

}
