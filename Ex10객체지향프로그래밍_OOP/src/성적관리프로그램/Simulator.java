package 성적관리프로그램;

public class Simulator {

	public static void main(String[] args) {
		
		//stu1 객체 생성 → 생성자 호출
		Student stu1 = new Student("신지영", "001", 90, 80, 87);
		//stu2 객체 생성
		Student stu2 = new Student("김지영", "002", 100, 70, 97);
		
//		stu1.stuName = "신지영"; //객체지향에서 직접적으로 접근하는 것은 권장하지 않음
//		stu1.stuNum = "001";   //데이터보호에 도움이 되지 않음
//		stu1.javaScore = 90;
//		stu1.dbScore = 80;
//		stu1.webScore = 87;
		
		//필드를 보호하지만 수정하는 방법
		//1. 생성자를 이용해서 데이터 입력
		//2. 세터스(setters) : 필드 값 하나하나 수정하는 것
		
		System.out.println(stu1.getStuName());
		System.out.println(stu1.getStuNum());
		System.out.println(stu1.getJavaScore());
		
		stu1.setStuNum("002");
		System.out.println(stu1.getStuNum());
		
	}

}
