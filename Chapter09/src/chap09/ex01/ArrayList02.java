package chap09.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	// 베열을 ArrayList 로 옮기고 싶을
	public static void main(String[] args) {
		//array -> List -> ArrayList
		//array -> List
		String[] arr = {"List","Map","Set"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list.size());
		System.out.println(list.get(1));
//		list.add("Collection"); // Array 를 List 로 변환하고 나면 수정은 불가능 하다.
		
		// List -> ArrayList
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.addAll(list);
		arrList.add("Collection");
		System.out.println(arrList);
	}

}
