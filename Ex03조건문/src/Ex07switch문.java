
public class Ex07switch문 {

	public static void main(String[] args) {
		
		int num = 20;
		
		//num이 20을 가지고 있으면 "20" 출력, 30을 가지고 있음 "30" 출력
		//그 나머지 값을 가지고 있으면 "다른수" 출력
		
		//switch(식, 값)
		switch(num) {
		case 20:
			System.out.println(20);
//			break; //switch문을 멈추고 다음 문장을 실행하도록 하는 명령어
		case 30:
			System.out.println(30);
//			break;
		default:
			System.out.println("다른수");
		}
	}
}
