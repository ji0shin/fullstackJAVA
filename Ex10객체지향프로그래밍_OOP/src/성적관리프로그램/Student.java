package 성적관리프로그램;

public class Student {
	//필드 : 이름, 학번, 성적 → 처음에는 private으로 접근제한자 붙이는 것으로 추천
	private String stuName;
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	//메서드
	
	//생성자 : 객체 생성 후 메모리에 할당
	//1. 객체를 생성할 때 최초로 1번만 호출되는 메서드
	//   일반 메서드는 원할 때 여러번 호출할 수 있음
	//   생성자는 한 객체에 대하여 한 번만 호출할 수 있음
	//2. 반환타입을 작성하지 않음 (void도 작성하지 않음)
	//3. 클래스 이름과 생성자 이름이 동일함
	//4. 생성자는 하나 이상 선언되어야 함
	//   → 없는 경우 컴파일시 자동으로 default 생성자 추가
	public Student(String stuName, String stuNum, 
			int javaScore, int dbScore, int webScore) {
		this.stuName = stuName;      //힙영역(필드) - 스택영역(지역변수)
		this.stuNum = stuNum;        //클래스로부터 탄생한 자기자신(this) 
//		if(javaScore >= 0 || javaScore <= 100) {
//			this.javaScore = javaScore;  //객체 자기자신의 javaScore -> 필드
//		}else {
//			javaScore = 0;
//		}
		
		//메서드를 활용하여 코드를 간단하게 만들 수 있다.
		this.javaScore = validScore(javaScore);
		this.dbScore = validScore(dbScore);      
		this.webScore = validScore(webScore);    
	}
	
	private int validScore(int score) { //클래스 내부에서만 사용 → 접근제한자 private
		if(score >= 0 || score <= 100) {
			return score;
		}else {
			return 0;
		}
	}
	//객체를 꺼내는 메서드 → 게터(getter)메서드 → 자동으로 만들 수 있게 이클립스에서 지원
	//이름을 꺼내는 메서드
	public String getStuName() {
		return stuName;
	}
	
	//학번을 꺼내는 메서드
	public String getStuNum() {
		return stuNum;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public int getDbScore() {
		return dbScore;
	}

	public int getWebScore() {
		return webScore;
	}

	//setter 메서드 - 수정하는 용도로 많이 사용
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	
}
