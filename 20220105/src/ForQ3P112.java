import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		// 구구단을 작성해보겠습니다.
		// Scanner를 이용해서 int dan에 정수를 받아주세요.
		// dan에 값을 받으면
		// dan * 1부터 dan * 9까지 순차적으로 콘솔창에 찍히게 만들어주세요.
		
		// for문에서 쓰기위해 선언한 i도 숫자가 저장된 변수이기 때문에
		// 연산에 사용할 수 있습니다.
		
		// 1. 스캐너 생성 및 2~9 값을 받는 dan 변수 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 단을 보고 싶으신가요?");
		int dan = scan.nextInt();
		
		// 2. 2~9 사이의 수인지 확인 후 반복문으로 구구단 출력
		// 3. 2~9 사이의 수가 아닐 시 "2~9 사이의 수를 입력해주세요." 출력
		// dan은 고정, i를 이용해 곱함.
		if (dan > 1 && dan < 10) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
		} else {
			System.out.println("2~9 사이의 수를 입력해주세요.");
		}
		
		// 4. 스캐너 종료
		scan.close();

	}

}
