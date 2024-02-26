package ch07.ex06;

public class Main {

	public static void main(String[] args) {
		
		Child child = new ChildImpl();
		
		child.click(1);
		child.dbiClick(2);
		
		child.keyDown(47);
		child.keyup(47);
		
		child.selectOne();
		child.checkOne();
		child.textField("아무거나 입력");
	}

}
