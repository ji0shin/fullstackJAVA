
public class Ex01while문 {

	public static void main(String[] args) {
		
		//반복문 
		//1.while (do~while) : 특정 조건에 해당할 경우에만 반복 수행 (반복횟수가 정확하지 않은 경우)
		//2.for : 반복횟수가 정해진 경우
		
		//while({}사이 문장을 반복할 조건)
		int num = 1 ; //변수 선언 후 초기화
		while(num < 6) {
			//반복하고 싶은 문장
//			int num = 1; //1부터 시작 -> while내 중괄호에서만 사용가능하고, 자바는 위에서 아래로 실행되므로 오류 발생
//			num = 1; -- 값이 없으면 비교가 불가능함 -> while문 내 조건 실행 불가능 
			System.out.println(num); //변수 사용 (값이 바뀌어야 하므로)
			num++; //1증가
		}
		
		int number = 1 ;
		while (number < 6) {
			System.out.println(number);
			number++;
		}
		
		int number2 = 0 ;
		while (number2 < 5) {
			System.out.println(++number2);
		}
		
		int number3 = 1 ;
		while (true) {
			System.out.println(number3);
			if(number3 == 5) {
				break;
			}
		}
		//지역변수 : 특정 구역에서만 사용 가능한 값 (어디까지 사용가능한지 파악 필요, 중괄호 안에서만 영향을 미침)
		//전역변수 : 어디에서나 사용 가능한 값	
		
		//변수명 일괄 수정 : Alt + shift + R
		int num1 = 1 ; 
		while(num1 <= 5) {
			System.out.println(num1++); 
//			System.out.println(++num1); -- 2~6까지 출력
			//++num1; 
		}
			
		int num2 = 0 ; 
		while(true) { //반복을 멈출 조건을 생각하는게 더 쉬움 //무조건 반복만 하게 작성 (무한반복)
			System.out.println(++num2); 
			//반복문을 나갈 조건 추가
			if(num2 == 5) { //반복문 나갈거니?
				//반복문 나가기
				break; //switch, 반복문(while, for)을 나가게 하는 키워드
					   //break를 기준으로 가장 가까운 반복문만 나감!
			}
		}
		
		int num3 = 1 ; 
		while(true) { //반복을 멈출 조건을 생각하는게 더 쉬움 //무조건 반복만 하게 작성 (무한반복)
			
			//반복문을 나갈 조건 추가
			if(num3 == 6) { //반복문 나갈거니?
				//반복문 나가기
				break; //switch, 반복문(while, for)을 나가게 하는 키워드
					   //break를 기준으로 가장 가까운 반복문만 나감!
			}
			System.out.println(num3++); 
		}
		
		//do~while문 : 반복 문장을 무조건 1번은 실행해야할 때
		int num4 = 1 ; 
		do {
			System.out.println(num4++);
		}while(num4 <= 5);
		
	}
}
