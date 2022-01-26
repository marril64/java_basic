package static2;

public class Asean {
	// 출석점수(check), 중간고사(midTerm), 기말고사(finalTerm)
	// 변수를 설정해주세요.
	// 위 변수들은 개별 객체가 따로따로 관리합니다.
	private int check;
	private int midTerm;
	private int finalTerm;
	
	// 공용 발표점수인 presentationScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	private static int presentationScore = 19; // 공용 점수는 private로 만들어 조작이 불가능하게 만들어야 한다.
	// 당연한 소리지만 공용으로 쓰는 변수이기 때문에 this를 붙일 수 없다.
	// 클래스 내부에서 생성하자마자 초기화해준다.(여기서는 19로 초기화)
	
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만
	// 받아서 수치를 입력해줍니다.
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	// 일반 메서드로 showAseanInfo()를 생성해주시되
	// 성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : XX점, 기말고사 : YY점 ...
	public void showAseanInfo() {
		System.out.println("중간고사 : " + this.midTerm + ", 기말고사 : " + this.finalTerm + ", 출석 : " + this.check + ", 발표점수 : " + presentationScore);
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public int getMidTerm() {
		return midTerm;
	}

	public void setMidTerm(int midTerm) {
		this.midTerm = midTerm;
	}

	public int getFinalTerm() {
		return finalTerm;
	}

	public void setFinalTerm(int finalTerm) {
		this.finalTerm = finalTerm;
	}

	public static int getPresentationScore() { // 메서드를 static으로 만들어 조회가 가능하게 만들어준다.
		return presentationScore;
	}

	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}

}
