
public class StmtBreak {

	public static void main(String[] args) {
		
		//while 문은 무한루프 중이다.
		//그런데 i 값이 100이 되면 빠져나오도록 만들러 보자
		int i = 0;
		while (i<=100) {
			i++;
			if (i == 100) {
				break;
			}
			System.out.println(i);
			
		}
	

	}

}
