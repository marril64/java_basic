import java.util.Scanner;

public class ForQ2P112 {

	public static void main(String[] args) {
		// Scanner로 int count 변수에 정수를 입력하세요.
		// 입력된 count 횟수만큼 "Hello Java"를 출력하는
		// 반복문을 아래쪽에 작성해주세요.
		
		// 1. 스캐너 생성, 정수값을 받는 count 변수 생성
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		// 2. for문으로 0으로 시작하는 i가 count에 받은 정수와 같아질 때 까지
		//    i를 1씩 증가시켜 "Hello Java" 출력
		for (int i = 0; i < count; i++) {
			System.out.println("Hello Java");
		}
		
		// 3. 스캐너 종료 맨날 까먹는다.
		scan.close();

	}

}
