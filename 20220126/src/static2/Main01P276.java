package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이 발표점수를 콘솔에 찍어보세요.
		// System.out.println(Asean.presentationScore); // presentationScore를 private로 만들면 정보은닉이 적용이 되서 접근이 불가능하다.
		// private으로 만들면 main지역에서 직접적으로 접근하는 것은 불가능해진다.
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(30, 30, 30);
		Asean a2 = new Asean(29, 29, 29);
		Asean a3 = new Asean(28, 28, 28);
		Asean a4 = new Asean(27, 27, 27);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
		
		// presentationScore는 private으로 전환될 경우
		// main지역에서 다이렉트로 조회가 불가능합니다.
		// Asean을 new 키워드로 만들지 않고도
		// private presentationScore를 콘솔에 조회가능하도록
		// 조치를 취해보세요.
		System.out.println(Asean.getPresentationScore()); // 왜 안떠올랐을까...공부합시다 ㅠㅠ
	}

}
