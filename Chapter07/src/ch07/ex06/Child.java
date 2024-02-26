package ch07.ex06;

import ch07.ex03.MouseEvent;
import ch07.ex04.KeyEvent;

// interface 는 규격 개념으로 필요한 규격을 모듈처럼 가져다 붙인다.
public interface Child extends MouseEvent, KeyEvent {
	
	public void textField(String input);
	
	public void selectOne();
	
	public void checkOne();
	
	
}
