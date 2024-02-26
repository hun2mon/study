package chap06.ex08;

public class ArrMage {

	public static void main(String[] args) {
		
		// Ice, Light, Fire 주문을 연속으로 날릴 수 있도록 배열과 for 문을 활용해서 구현 해보자.
		
		Spell[] spellArr = {new Ice(), new Fire(), new Light()};
		
		for (int i = 0; i < spellArr.length; i++) {
			
		System.out.println(spellArr[i].casting());
		
		}
		
		for (Spell spell : spellArr) {
			System.out.println(spell.casting());
		}
		
	
		
		
	
	}

}
