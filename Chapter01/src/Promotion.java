
public class Promotion {

	public static void main(String[] args) {
		// 작은것에서 큰것으로 갈땐 묵시적 형변환(promotion)
		// 작은잔에서 큰잔으로 옮길때 당연히 안 흘릴테니 확인이 필요 없다.
		
		byte byteValue;
		char charValue = 'a';
		int intValue = 0;
		long longValue;
		float floatValue;
		double doubleValue;
		
		//byte < int
		byteValue = 10;
		intValue = byteValue;
		
		//char < int
		intValue = charValue;
		System.out.println(intValue); //97 -> ASCII CODE (각 문자의 번호가 공통 규격으로 정해져 있다.)
		//int < long
		longValue = intValue;
		
		//float < double
		floatValue = 0.1f;
		doubleValue = floatValue;

	}

}
