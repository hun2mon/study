
public class StmeElseIf {

	public static void main(String[] args) {

		// 우리가 가지고 있는 음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료, 냉커피, 식혜
		String item ="";
		
		if (item.equals("콜라") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("생수") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("오렌지주스") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("사이다") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("에너지음료") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("냉커피") ) {
			System.out.println(item+ " 나왔습니다.");
		}else if (item.equals("식혜") ) {
			System.out.println(item+ " 나왔습니다.");
		} else {
			System.out.println(item+" 보유하고 있지 않습니다.");
		}

	}
}