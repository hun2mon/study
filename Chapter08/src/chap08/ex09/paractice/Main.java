package chap08.ex09.paractice;

public class Main {

	public static void main(String[] args) {
		
		JoinMember join = new JoinMember();
		String id = "admin";
		try {
			join.regId(id);			
		} catch (Exception e) {
			System.out.println(id + "는 사용할 수 없는 아이디 입니다.");
			e.printStackTrace();
		}

	}

}
