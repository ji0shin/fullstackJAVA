import java.util.Scanner;

public class Ex06배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arrStr = {"김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민"};

		System.out.print("검색할 이름 입력 >> ");
		
		String inputName = sc.next();
		
		int cnt = 0;
		for(int i = 0 ; i < arrStr.length ; i++) {
			if(arrStr[i].equals(inputName)) {
				System.out.println(inputName + "님은 " + i + "번째 인덱스에 저장되어 있습니다");
			}else {
				cnt++ ;
			}
		}
		if(cnt >= arrStr.length) {
			System.out.println("이름을 다시 입력하세요");
		}
		
		//for~each문 사용
		int index = 0;
		for(String name : arrStr) {
			index++;
			if(name.equals(inputName)) {
				System.out.printf("%s님은 %d번째 인덱스에 저장되어 있습니다", inputName, index-1);
				break;
			}else {
				if(index == 7) {
					System.out.println("이름을 다시 입력하세요");
				}
			}
		}
		

	}

}
