package ch07.ex07;

public class Client {

	public static void main(String[] args) {
		
		VingsuMaker maker = new VingsuMaker();
		
		Vingsu ving = new ChocoVingsu();
		maker.make(ving);
		System.out.println();
		
		ving = new CookieVingsu();
		maker.make(ving);
		System.out.println();
		
		ving = new RedBeanVingsu();
		maker.make(ving);
		
		
	
	}

}
