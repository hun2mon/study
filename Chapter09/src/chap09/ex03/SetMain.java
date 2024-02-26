package chap09.ex03;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		
		//set 은 중복을 허용하지 않고 순서도 없다.
		HashSet<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("JSP");
		set.add("MARIA");
		set.add("SPRING");//중복
		System.out.println(set + ":" + set.size());
		
		HashSet<Member> member = new HashSet<Member>();
		member.add(new Member());
		member.add(new Member()); // 각 객체는 복사본이므로 기본적으로 다르다고 판단한다.
		System.out.println(member.size());
		
		//요소 삭제
		set.remove("MARIA");
		
		//요소를 하나씩 뽑아내는 방법 1 : 정식적인 방법
		Iterator<String> iter = set.iterator();//덩어리 쪼갠다.
		while (iter.hasNext()) {
			System.out.println(iter.next());// 하나씩 가져옴
		}
		
		//요소를 하나씩 뽑아내는 방법 1 : 향상된 for 방법
		//set 을 넣으면 알아서 쪼개준다.
		for (String val : set) {
			System.out.println(val);
		}
		//isEmpty()
		//clear()
	}
}

class Member{
}