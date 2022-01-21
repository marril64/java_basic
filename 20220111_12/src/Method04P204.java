
public class Method04P204 {
	
	public static void info() { // info지역 생성
		// 만약 내부 실행구문이 추가 입력을 받지 않아도
		// 완성된 구문이라면 굳이 값을 받지 않아도 됩니다.
		System.out.println("123");
		System.out.println("456");
		System.out.println("124");
		System.out.println("784");
	} // 14번 라인으로 이동, info지역 스택에서 사라짐

	public static void main(String[] args) { // main지역 생성, 시작점
		info(); // 4번 라인으로 이동
		info();
		info(); // 간단하면서 반복적인 코드를 쓸 때 사용한다.
		info(); // 16라인으로 쓸 코드를 간결하게 4라인으로 줄일 수 있어서 쓴다.
	}

}
