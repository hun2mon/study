package chap08.ex09.paractice;

public class JoinMember {

	String[] reserved = {"admin", "tester", "manager"};
	
	
	public void regId(String id) throws ReserverdException {
		for (int i = 0; i < reserved.length; i++) {
			if (reserved[i].equals(id)) {
			throw new ReserverdException(id);
			}
		}
	}
	

}
