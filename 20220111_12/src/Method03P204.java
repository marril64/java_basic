
public class Method03P204 {
	
	public static void/*void 이므로 return문이 없음*/ plus (int a, int b) { // plus지역 생성
		// 내부 실행문이 2개 이상의 변수를 필요로 한다면
		// 두 개 이상의 매개변수를 선언할 수 있습니다.
		// 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		System.out.println(a + b); // 12번 라인에서 가져온 3과 5를 a, b에 대입, 콘솔에 결과값인 8을 찍고 12번 라인으로 다시 돌아감.
	}

	public static void main(String[] args) { // main지역 생성, 처음으로 시작
		plus(3, 5); // plus 메서드를 만남과 동시에 (3, 5) 자료를 가지고 4번라인으로 넘어감
	} // 12번 라인으로 돌아옴과 동시에 plus지역이 사라지고 13번 라인에서 main지역도 사라짐.

}
